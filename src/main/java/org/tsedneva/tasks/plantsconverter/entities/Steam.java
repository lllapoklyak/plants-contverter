package org.tsedneva.tasks.plantsconverter.entities;

/** Steam entity. */
public final class Steam {
    private String steamType;
    private Integer avgRadius;

    public Steam() {
    }

    public Steam(String steamType, Integer avgRadius) {
        this.steamType = steamType;
        this.avgRadius = avgRadius;
    }

    public String getSteamType() {
        return steamType;
    }

    public void setSteamType(String steamType) {
        this.steamType = steamType;
    }

    public Integer getAvgRadius() {
        return avgRadius;
    }

    public void setAvgRadius(Integer avgRadius) {
        this.avgRadius = avgRadius;
    }

}
