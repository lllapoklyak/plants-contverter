package org.tsedneva.tasks.plantsconverter.entities;

/** Harvest entity. */
public final class Harvest {
    private String harevestType;
    private String harvestingDate;

    public Harvest() {
    }

    public Harvest(String harevestType, String harvestingDate) {
        this.harevestType = harevestType;
        this.harvestingDate = harvestingDate;
    }

    public String getHarevestType() {
        return harevestType;
    }

    public void setHarevestType(String harevestType) {
        this.harevestType = harevestType;
    }

    public String getHarvestingDate() {
        return harvestingDate;
    }

    public void setHarvestingDate(String harvestingDate) {
        this.harvestingDate = harvestingDate;
    }
}
