package com.AdventOfCode.Year_2015.Day_22;

import com.AdventOfCode.AOCExercise;
import com.AdventOfCode.Conveniencer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Wizard_Simulator_20XX extends AOCExercise {
    private Boss boss;
    private Wizard player;
    private int minMana = Integer.MAX_VALUE;
    @Override
    public String answer1() {
        init();
        calculateMinimalManaUsageForWin();
        return "" + minMana;
    }

    @Override
    public String answer2() {
        return null;
    }

    private void calculateMinimalManaUsageForWin() {
        for (int startAttackIndex = 0; startAttackIndex < 5; startAttackIndex++)
        {
            calculateMinimalManaUsageForWinRecursive((Wizard) player.clone(), (Boss) boss.clone(), startAttackIndex, 0);
        }
    }

    private void calculateMinimalManaUsageForWinRecursive(Wizard player, Boss boss, int attackIndex, int manaSum)
    {
        if (manaSum >= minMana) return;

        //player turn
        //effects
        player.doEffects();
        boss.doEffects();

        if (!boss.isAlive())
        {
            if (manaSum < minMana)
                minMana = manaSum;
            return;
        }

        if (attackIndex == 0) manaSum += player.magicMissile(boss);
        if (attackIndex == 1) manaSum += player.drain(boss);
        if (attackIndex == 2) manaSum += player.shield();
        if (attackIndex == 3) manaSum += player.poison(boss);
        if (attackIndex == 4) manaSum += player.recharge();

        if (!boss.isAlive())
        {
            if (manaSum < minMana)
                minMana = manaSum;
            return;
        }

        //boss turn
        //effects
        player.doEffects();
        boss.doEffects();

        if (!boss.isAlive())
        {
            if (manaSum < minMana)
                minMana = manaSum;
            return;
        }

        boss.attack(player);
        if (!player.isAlive())
        {
            return;
        }

        //next turn
        int remainingMana = player.getMana();
        if (remainingMana >= Wizard.MANA_MAGIC_MISSILE)
            calculateMinimalManaUsageForWinRecursive((Wizard) player.clone(), (Boss) boss.clone(), 0, manaSum);
        if (remainingMana >= Wizard.MANA_DRAIN)
            calculateMinimalManaUsageForWinRecursive((Wizard) player.clone(), (Boss) boss.clone(), 1, manaSum);
        if (remainingMana >= Wizard.MANA_SHIELD && !player.isShieldActive())
            calculateMinimalManaUsageForWinRecursive((Wizard) player.clone(), (Boss) boss.clone(), 2, manaSum);
        if (remainingMana >= Wizard.MANA_POISON && !boss.isPoisonActive())
            calculateMinimalManaUsageForWinRecursive((Wizard) player.clone(), (Boss) boss.clone(), 3, manaSum);
        if (remainingMana >= Wizard.MANA_RECHARGE && !player.isRechargeActive())
            calculateMinimalManaUsageForWinRecursive((Wizard) player.clone(), (Boss) boss.clone(), 4, manaSum);
    }



    private void init()
    {
        player = new Wizard(50, 500);

        int bossHitPoints = 0;
        int bossDamage = 0;
        for (String line : Conveniencer.convertTextToLines(input))
        {
            String[] splitLine = line.split(" ");
            if (line.contains("Hit Points:"))
                bossHitPoints = Conveniencer.stringToInt(splitLine[splitLine.length - 1]);
            if (line.contains("Damage:"))
                bossDamage = Conveniencer.stringToInt(splitLine[splitLine.length - 1]);
        }

        boss = new Boss(bossHitPoints, bossDamage);
    }
}
