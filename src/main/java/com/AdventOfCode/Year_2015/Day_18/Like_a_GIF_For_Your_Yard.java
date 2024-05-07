package com.AdventOfCode.Year_2015.Day_18;

import com.AdventOfCode.AOCExercise;
import com.AdventOfCode.Conveniencer;

import java.util.List;

public class Like_a_GIF_For_Your_Yard extends AOCExercise {
    boolean[][] lightGrid;
    @Override
    public String answer1() {
        init();
        animate(false);
        return "" + countLights();
    }

    @Override
    public String answer2() {
        init();
        animate(true);
        return "" + countLights();
    }

    private int countLights()
    {
        int count = 0;

        for (int y = 0; y < lightGrid.length; y++)
        {
            for (int x = 0; x < lightGrid[y].length; x++)
            {
                if (lightGrid[y][x]) count++;
            }
        }

        return count;
    }

    private void animate(boolean cornerAlwaysOn)
    {
        int totalGenerations = Conveniencer.stringToInt(args[0]);

        for (int generation = 0; generation < totalGenerations; generation++)
        {
            doGeneration(cornerAlwaysOn);
        }
    }

    private void doGeneration(boolean cornerAlwaysOn)
    {
        int lastIndex = lightGrid.length-1;

        if (cornerAlwaysOn)
        {
            lightGrid[0][0] = true;
            lightGrid[0][lastIndex] = true;
            lightGrid[lastIndex][0] = true;
            lightGrid[lastIndex][lastIndex] = true;
        }

        boolean[][] newLightGrid = copyLightGrid();

        for (int y = 0; y < lightGrid.length; y++)
        {
            for (int x = 0; x < lightGrid[y].length; x++)
            {
                int neighbors = getNeighbors(x, y);

                if (cornerAlwaysOn &&
                    (x == 0 || x == lastIndex) &&
                    (y == 0 || y == lastIndex))
                {
                    continue;
                }

                //light on
                if (lightGrid[y][x])
                {
                    newLightGrid[y][x] = neighbors >= 2 && neighbors <= 3;
                }
                //light off
                else
                {
                    newLightGrid[y][x] = neighbors == 3;
                }
            }
        }
        lightGrid = newLightGrid;
    }

    private boolean[][] copyLightGrid()
    {
        boolean [][] newLightGrid = new boolean[lightGrid.length][lightGrid[0].length];
        for(int index = 0; index < lightGrid.length; index++)
            newLightGrid[index] = lightGrid[index].clone();
        return newLightGrid;
    }

    private int getNeighbors(int x, int y)
    {
        int count = 0;

        for (int xOffset = -1; xOffset <= 1; xOffset++)
        {
            for (int yOffset = -1; yOffset <= 1; yOffset++)
            {
                if (yOffset == 0 && xOffset == 0) continue;

                try
                {
                    if (lightGrid[y + yOffset][x + xOffset]) count++;
                }
                catch (IndexOutOfBoundsException ignored) {}
            }
        }

        return count;
    }

    private void init()
    {
        List<String> lines = Conveniencer.convertTextToLines(this.input);

        int width = lines.get(0).length();
        int height = lines.size();

        lightGrid = new boolean[width][height];

        for (int lineIndex = 0; lineIndex < lines.size(); lineIndex++)
        {
            String line = lines.get(lineIndex);

            for (int charIndex = 0; charIndex < line.length(); charIndex++)
            {
                lightGrid[lineIndex][charIndex] = line.charAt(charIndex) == '#';
            }
        }
    }
}
