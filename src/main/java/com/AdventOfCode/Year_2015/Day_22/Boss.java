package com.AdventOfCode.Year_2015.Day_22;
public class Boss {
    private int hitPoints;
    private int damage;
    //effects
    private int poisonTurnsLeft = 0;
    private int poisonDamage = 0;


    public Boss(int hitPoints, int damage)
    {
        this.hitPoints = hitPoints;
        this.damage = damage;
    }

    public Boss(Boss boss)
    {
        this.hitPoints = boss.hitPoints;
        this.damage = boss.damage;
        this.poisonTurnsLeft = boss.poisonTurnsLeft;
        this.poisonDamage = boss.poisonDamage;
    }

    public boolean isDefeated()
    {
        return hitPoints <= 0;
    }

    public void doEffects()
    {
        //effects
        if (isPoisonActive(false))
        {
            hitPoints -= poisonDamage;
            poisonTurnsLeft--;
        }
    }

    public void doDamage(int damage)
    {
        hitPoints -= damage;
    }

    public boolean isPoisonActive(boolean nextTurn)
    {
        if (nextTurn) return poisonTurnsLeft > 1;
        return poisonTurnsLeft > 0;
    }

    public void doPoison(int poisonTurns, int poisonDamage)
    {
        this.poisonTurnsLeft = poisonTurns;
        this.poisonDamage = poisonDamage;
    }

    public void attack(Wizard player)
    {
        if (!isDefeated()) player.doDamage(damage);
    }

    @Override
    public Object clone() {
        try {
            return (Boss) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Boss(this);
        }
    }
}
