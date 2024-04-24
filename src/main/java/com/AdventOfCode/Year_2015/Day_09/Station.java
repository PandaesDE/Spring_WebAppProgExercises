package com.AdventOfCode.Year_2015.Day_09;

import java.util.*;

public class Station{
    private String name;
    private HashMap<Station, Integer> distanceMap;

    public Station(String name)
    {
        this.name = name;
        distanceMap = new HashMap<>();
    }

    public String getName() { return this.name; }
    public void addStation(Station station, int distance)
    {
        for (Map.Entry<Station, Integer> stationDistanceEntry : distanceMap.entrySet()) {
            if (stationDistanceEntry.getKey().equals(station))
            {
                if (stationDistanceEntry.getValue() != distance) {
                    distanceMap.replace(stationDistanceEntry.getKey(), distance);
                    return;
                }
            }
        }
        distanceMap.put(station, distance);
    }

    public int getShortestPath()
    {
        return Collections.min(getAllDistancePaths(new ArrayList<String>(), 0));
    }

    public List<Integer> getAllDistancePaths(List<String> visitedPlaces, int distance)
    {
        boolean reachedEnd = true;
        List<Integer> distanceSums = new LinkedList<>();

        visitedPlaces.add(this.name);

        for (Map.Entry<Station, Integer> stationDistanceEntry : distanceMap.entrySet())
        {
            //ignore visited
            if (visitedPlaces.contains(stationDistanceEntry.getKey().getName())) continue;

            reachedEnd = false;
            Station s = stationDistanceEntry.getKey();
            int newDistance = stationDistanceEntry.getValue() + distance;

            //merge all
            List<Integer> childDistances = s.getAllDistancePaths(visitedPlaces, newDistance);
            distanceSums.addAll(childDistances);
        }

        //Base Case/ End of Graph
        if (reachedEnd) distanceSums.add(distance);

        return distanceSums;
    }

    public boolean equals(Station station)
    {
        return equals(station.getName());
    }

    public boolean equals(String name)
    {
        return Objects.equals(this.name, name);
    }

}
