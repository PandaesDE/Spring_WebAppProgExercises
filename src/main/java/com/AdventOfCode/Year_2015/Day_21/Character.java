package com.AdventOfCode.Year_2015.Day_21;

public class Character {
    private int hitPoints;

    private int damage;
    private int defense;
    private Item weapon;
    private Item armor;
    private Item[] rings;

    public Character(int hitPoints)
    {
        this(hitPoints, 0, 0);
    }

    public Character(int hitPoints, int damage, int armor)
    {
        this.hitPoints = hitPoints;
        this.damage = damage;
        this.defense = armor;
        rings = new Item[2];
    }

    public int getSumOfAllEquippedItems()
    {
        int sum = weapon.cost;
        if (armor != null) sum += armor.cost;
        if (rings[0] != null) sum += rings[0].cost;
        if (rings[1] != null) sum += rings[1].cost;

        return sum;
    }

    public int hitsUntilDefeated(int damage)
    {
        if (damage <= defense) return Integer.MAX_VALUE;
        damage -= defense;

        if (hitPoints % damage == 0) return hitPoints / damage;
        return 1 + (hitPoints / damage);
    }

    public void equipWeapon(Item weapon)
    {
        unequipWeapon();
        if (weapon == null) return;

        this.weapon = weapon;
        this.damage += weapon.damage;
        this.defense += weapon.defense;
    }

    public void equipArmor(Item armor)
    {
        unequipArmor();
        if (armor == null) return;

        this.armor = armor;
        this.damage += armor.damage;
        this.defense += armor.defense;
    }

    public void equipRing(Item ring, int index)
    {
        unequipRing(index);
        if (ring == null) return;

        this.rings[index] = ring;
        this.damage += ring.damage;
        this.defense += ring.defense;
    }

    private void unequipWeapon()
    {
        if (this.weapon != null)
        {
            this.damage -= this.weapon.damage;
            this.defense -= this.weapon.defense;
        }

        this.weapon = null;
    }

    private void unequipArmor()
    {
        if (this.armor != null)
        {
            this.damage -= this.armor.damage;
            this.defense -= this.armor.defense;
        }

        this.armor = null;
    }

    private void unequipRing(int index)
    {
        if (this.rings[index] != null)
        {
            this.damage -= this.rings[index].damage;
            this.defense -= this.rings[index].defense;
        }

        this.rings[index] = null;
    }

    public int getDamage() {
        return damage;
    }
}
