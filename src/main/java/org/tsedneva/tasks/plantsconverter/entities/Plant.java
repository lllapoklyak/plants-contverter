package org.tsedneva.tasks.plantsconverter.entities;

/** Plant entity. */
public final class Plant {
    private String type;
    private String subCategory;
    private String family;
    private String name;
    private String latinName;
    private Double avgHigh;
    private Integer lifePeriod;
    private RootSystem rootSystem;
    private Steam steam;
    private Leafs leafs;
    private Harvest harvest;
    private Flowers flowers;

    public Plant() {
    }

    /** Creates new Plant entity.  */
    public Plant(String type, String subCategory, String family, String name, String latinName, Double avgHigh,
            Integer lifePeriod, RootSystem rootSystem, Steam steam, Leafs leafs, Harvest harvest, Flowers flowers) {
        this.type = type;
        this.subCategory = subCategory;
        this.family = family;
        this.name = name;
        this.latinName = latinName;
        this.avgHigh = avgHigh;
        this.lifePeriod = lifePeriod;
        this.rootSystem = rootSystem;
        this.steam = steam;
        this.leafs = leafs;
        this.harvest = harvest;
        this.flowers = flowers;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatinName() {
        return latinName;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public Double getAvgHigh() {
        return avgHigh;
    }

    public void setAvgHigh(Double avgHigh) {
        this.avgHigh = avgHigh;
    }

    public Integer getLifePeriod() {
        return lifePeriod;
    }

    public void setLifePeriod(Integer lifePeriod) {
        this.lifePeriod = lifePeriod;
    }

    public RootSystem getRootSystem() {
        return rootSystem;
    }

    public void setRootSystem(RootSystem rootSystem) {
        this.rootSystem = rootSystem;
    }

    public Steam getSteam() {
        return steam;
    }

    public void setSteam(Steam steam) {
        this.steam = steam;
    }

    public Leafs getLeafs() {
        return leafs;
    }

    public void setLeafs(Leafs leafs) {
        this.leafs = leafs;
    }

    public Harvest getHarvest() {
        return harvest;
    }

    public void setHarvest(Harvest harvest) {
        this.harvest = harvest;
    }

    public Flowers getFlowers() {
        return flowers;
    }

    public void setFlowers(Flowers flowers) {
        this.flowers = flowers;
    }

}
