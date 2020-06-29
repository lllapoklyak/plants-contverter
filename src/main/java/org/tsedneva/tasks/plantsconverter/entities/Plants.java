package org.tsedneva.tasks.plantsconverter.entities;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/** List of Plants entity. */
@XmlRootElement(name = "plants")
public final class Plants {
    private List<Plant> plants;

    public Plants() {
    }

    public Plants(List<Plant> plants) {
        this.plants = plants;
    }

    @XmlElement(name = "plant")
    public List<Plant> getPlants() {
        return plants;
    }

    public void setPlants(List<Plant> plants) {
        this.plants = plants;
    }

}
