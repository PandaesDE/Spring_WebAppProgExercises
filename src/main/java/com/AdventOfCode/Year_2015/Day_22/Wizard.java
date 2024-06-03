package com.AdventOfCode.Year_2015.Day_22;

import java.util.ArrayList;
import java.util.List;

public class Wizard {
    public final static int MANA_MAGIC_MISSILE = 53;
    public final static int MANA_DRAIN = 73;
    public final static int MANA_SHIELD = 113;
    public final static int MANA_POISON = 173;
    public final static int MANA_RECHARGE = 229;

    public final static int DAMAGE_MAGIC_MISSILE = 4;
    public final static int DAMAGE_DRAIN = 2;
    public final static int ROUNDS_SHIELD = 6;
    public final static int ROUNDS_POISON = 6;
    public final static int DAMAGE_POISON = 3;
    public final static int ROUNDS_RECHARGE = 5;
    private int hitPoints;
    private int mana;

    //effects
    private int armor = 0;
    private int shieldTurnsLeft = 0;
    private int rechargeTurnsLeft = 0;

    public Wizard(int hitPoints, int mana)
    {
        this.hitPoints = hitPoints;
        this.mana = mana;
    }

    public Wizard(Wizard wizard)
    {
        this.hitPoints = wizard.hitPoints;
        this.mana = wizard.mana;
        this.armor = wizard.armor;
        this.shieldTurnsLeft = wizard.shieldTurnsLeft;
        this.rechargeTurnsLeft = wizard.rechargeTurnsLeft;
    }

    public void doEffects()
    {
        armor = 0;
        if (isShieldActive(false))
        {
            armor = 7;
            shieldTurnsLeft--;
        }
        if (isRechargeActive(false))
        {
            mana += 101;
            rechargeTurnsLeft--;
        }
    }
    public void doDamage(int damage)
    {
        //damage
        if (damage <= armor) hitPoints -= 1;
        else hitPoints -= damage - armor;
    }

    public int magicMissile(Boss boss)
    {
        useMana(MANA_MAGIC_MISSILE);
        boss.doDamage(DAMAGE_MAGIC_MISSILE);
        return MANA_MAGIC_MISSILE;
    }

    public int drain(Boss boss)
    {
         useMana(MANA_DRAIN);
         boss.doDamage(DAMAGE_DRAIN);
         hitPoints += DAMAGE_DRAIN;
         return MANA_DRAIN;
    }

    public int shield()
    {
        useMana(MANA_SHIELD);
        shieldTurnsLeft = ROUNDS_SHIELD;
        return MANA_SHIELD;
    }

    public int poison(Boss boss)
    {
        useMana(MANA_POISON);
        boss.doPoison(ROUNDS_POISON, DAMAGE_POISON);
        return MANA_POISON;
    }

    public int recharge()
    {
        useMana(MANA_RECHARGE);
        rechargeTurnsLeft = ROUNDS_RECHARGE;
        return MANA_RECHARGE;
    }

    @Override
    public Object clone() {
        try {
            return (Wizard) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Wizard(this);
        }
    }

    public boolean isDefeated()
    {
        return hitPoints <= 0;
    }
    public boolean isShieldActive(boolean nextTurn)
    {
        if (nextTurn) return shieldTurnsLeft > 1;
        return shieldTurnsLeft > 0;
    }
    public boolean isRechargeActive(boolean nextTurn)
    {
        if (nextTurn) return rechargeTurnsLeft > 1;
        return rechargeTurnsLeft > 0;
    }

    public int getMana()
    {
        return mana;
    }

    private void useMana(int amount)
    {
        if (mana - amount < 0) hitPoints = 0;
        mana -= amount;
    }
}
