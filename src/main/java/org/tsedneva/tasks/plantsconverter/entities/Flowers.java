package org.tsedneva.tasks.plantsconverter.entities;

/** Flowers entity. */
public final class Flowers {
    private String inflorescence;
    private String bloomDate;
    private String[] color;
    private Integer size;

    public Flowers() {
    }

    /** Creates new Flowers entity. */
    public Flowers(String inflorescence, String bloomDate, String[] color, Integer size) {
        this.inflorescence = inflorescence;
        this.bloomDate = bloomDate;
        this.color = color;
        this.size = size;
    }

    public String getInflorescence() {
        return inflorescence;
    }

    public void setInflorescence(String inflorescence) {
        this.inflorescence = inflorescence;
    }

    public String getBloomDate() {
        return bloomDate;
    }

    public void setBloomDate(String bloomDate) {
        this.bloomDate = bloomDate;
    }

    public String[] getColor() {
        return color;
    }

    public void setColor(String[] color) {
        this.color = color;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
