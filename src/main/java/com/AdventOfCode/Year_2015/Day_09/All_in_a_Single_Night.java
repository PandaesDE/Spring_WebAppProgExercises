package com.AdventOfCode.Year_2015.Day_09;

import com.AdventOfCode.AOCExercise;
import com.AdventOfCode.Conveniencer;

import java.util.ArrayList;
import java.util.List;

public class All_in_a_Single_Night extends AOCExercise {

    private List<Station> stations = new ArrayList<>();
    @Override
    public String answer1() {
        initializeValues();
        return "" + calculateShortestDistance();
    }

    @Override
    public String answer2() {
        initializeValues();
        return null;
    }

    private int calculateShortestDistance()
    {
        int min = Integer.MAX_VALUE;
        for (Station s : stations)
        {
            int newDist = s.getShortestPath();
            if (newDist < min) min = newDist;
        }
        return min;
    }

    private void initializeValues()
    {
        List<String> lines = Conveniencer.convertTextToLines(input);
        lines.forEach(line -> {
            List<String> tokenizedLine = Conveniencer.tokenizeString(line);
            String station1 = tokenizedLine.get(0);
            String station2 = tokenizedLine.get(2);
            int distance = Conveniencer.stringToInt(tokenizedLine.get(4));

            registerStationInformation(station1, station2, distance);
        });
    }

    private void registerStationInformation(String sName1, String sName2, int distance)
    {
        Station station1 = getStation(sName1);
        Station station2 = getStation(sName2);

        if (station1 == null)
        {
            station1 = new Station(sName1);
            stations.add(station1);
        }
        if (station2 == null)
        {
            station2 = new Station(sName2);
            stations.add(station2);
        }

        station1.addStation(station2, distance);
        station2.addStation(station1, distance);
    }

    private Station getStation(String name)
    {
        for (Station station : stations) {
            if (station.equals(name)) {
                return station;
            }
        }
        return null;
    }
}
