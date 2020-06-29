package org.tsedneva.tasks.plantsconverter.entities;

/** Leafs entity. */
public final class Leafs {
    private String leafsType;
    private String leafsGrowingType;
    private Integer avgLenght;
    private Integer avgWidth;

    public Leafs() {
    }

    /** Creates new Leafs entity. */
    public Leafs(String leafsType, String leafsGrowingType, Integer avgLenght, Integer avgWidth) {
        this.leafsType = leafsType;
        this.leafsGrowingType = leafsGrowingType;
        this.avgLenght = avgLenght;
        this.avgWidth = avgWidth;
    }

    public String getLeafsType() {
        return leafsType;
    }

    public void setLeafsType(String leafsType) {
        this.leafsType = leafsType;
    }

    public String getLeafsGrowingType() {
        return leafsGrowingType;
    }

    public void setLeafsGrowingType(String leafsGrowingType) {
        this.leafsGrowingType = leafsGrowingType;
    }

    public Integer getAvgLenght() {
        return avgLenght;
    }

    public void setAvgLenght(Integer avgLenght) {
        this.avgLenght = avgLenght;
    }

    public Integer getAvgWidth() {
        return avgWidth;
    }

    public void setAvgWidth(Integer avgWidth) {
        this.avgWidth = avgWidth;
    }

}
