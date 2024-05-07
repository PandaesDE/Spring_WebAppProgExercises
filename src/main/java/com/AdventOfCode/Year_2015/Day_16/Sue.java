package com.AdventOfCode.Year_2015.Day_16;

import java.util.Objects;

public class Sue {
    private int id;
    private Integer children;
    private Integer cats;
    private Integer samoyeds;
    private Integer pomeranians;
    private Integer akitas;
    private Integer vizslas;
    private Integer goldfishes;
    private Integer trees;
    private Integer cars;
    private Integer perfumes;

    public Sue(int id)
    {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sue sue = (Sue) o;
        return id == sue.id;
    }

    public boolean probablyEquals(Sue notMFCSAMSue, boolean withOutdatedRetroencabulator)
    {
        if (children != null && notMFCSAMSue.children != null)
            if (!children.equals(notMFCSAMSue.getChildren())) return false;

        if (samoyeds != null && notMFCSAMSue.samoyeds != null)
            if (!samoyeds.equals(notMFCSAMSue.getSamoyeds())) return false;

        if (akitas != null && notMFCSAMSue.akitas != null)
            if (!akitas.equals(notMFCSAMSue.getAkitas())) return false;

        if (vizslas != null && notMFCSAMSue.vizslas != null)
            if (!vizslas.equals(notMFCSAMSue.getVizslas())) return false;

        if (cars != null && notMFCSAMSue.cars != null)
            if (!cars.equals(notMFCSAMSue.getCars())) return false;

        if (perfumes != null && notMFCSAMSue.perfumes != null)
            if (!perfumes.equals(notMFCSAMSue.getPerfumes())) return false;

        if (withOutdatedRetroencabulator)
            return probablyEqualsWithOutdatedRetroencabulator(notMFCSAMSue);
        else
            return probablyEqualsWithoutOutdatedRetroencabulator(notMFCSAMSue);
    }

    private boolean probablyEqualsWithoutOutdatedRetroencabulator(Sue notMFCSAMSue)
    {
        if (cats != null && notMFCSAMSue.cats != null)
            if (!cats.equals(notMFCSAMSue.getCats())) return false;

        if (pomeranians != null && notMFCSAMSue.pomeranians != null)
            if (!pomeranians.equals(notMFCSAMSue.getPomeranians())) return false;

        if (goldfishes != null && notMFCSAMSue.goldfishes != null)
            if (!goldfishes.equals(notMFCSAMSue.getGoldfishes())) return false;

        if (trees != null && notMFCSAMSue.trees != null)
            if (!trees.equals(notMFCSAMSue.getTrees())) return false;

        return true;
    }

    private boolean probablyEqualsWithOutdatedRetroencabulator(Sue notMFCSAMSue)
    {
        if (cats != null && notMFCSAMSue.cats != null)
            if (cats > notMFCSAMSue.getCats()) return false;

        if (pomeranians != null && notMFCSAMSue.pomeranians != null)
            if (pomeranians < notMFCSAMSue.getPomeranians()) return false;

        if (goldfishes != null && notMFCSAMSue.goldfishes != null)
            if (goldfishes < notMFCSAMSue.getGoldfishes()) return false;

        if (trees != null && notMFCSAMSue.trees != null)
            if (trees > notMFCSAMSue.getTrees()) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getChildren() {
        return children;
    }

    public void setChildren(Integer children) {
        this.children = children;
    }

    public Integer getCats() {
        return cats;
    }

    public void setCats(Integer cats) {
        this.cats = cats;
    }

    public Integer getSamoyeds() {
        return samoyeds;
    }

    public void setSamoyeds(Integer samoyeds) {
        this.samoyeds = samoyeds;
    }

    public Integer getPomeranians() {
        return pomeranians;
    }

    public void setPomeranians(Integer pomeranians) {
        this.pomeranians = pomeranians;
    }

    public Integer getAkitas() {
        return akitas;
    }

    public void setAkitas(Integer akitas) {
        this.akitas = akitas;
    }

    public Integer getVizslas() {
        return vizslas;
    }

    public void setVizslas(Integer vizslas) {
        this.vizslas = vizslas;
    }

    public Integer getGoldfishes() {
        return goldfishes;
    }

    public void setGoldfishes(Integer goldfishes) {
        this.goldfishes = goldfishes;
    }

    public Integer getTrees() {
        return trees;
    }

    public void setTrees(Integer trees) {
        this.trees = trees;
    }

    public Integer getCars() {
        return cars;
    }

    public void setCars(Integer cars) {
        this.cars = cars;
    }

    public Integer getPerfumes() {
        return perfumes;
    }

    public void setPerfumes(Integer perfumes) {
        this.perfumes = perfumes;
    }
}
