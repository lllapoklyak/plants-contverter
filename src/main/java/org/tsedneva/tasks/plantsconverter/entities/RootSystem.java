package org.tsedneva.tasks.plantsconverter.entities;

/** Root System entity. */
public final class RootSystem {
    private Boolean rootVegetable;
    private String rootType;

    public RootSystem() {
    }

    public RootSystem(Boolean rootVegetable, String rootType) {
        this.rootVegetable = rootVegetable;
        this.rootType = rootType;
    }

    public Boolean getRootVegetable() {
        return rootVegetable;
    }

    public void setRootVegetable(Boolean rootVegetable) {
        this.rootVegetable = rootVegetable;
    }

    public String getRootType() {
        return rootType;
    }

    public void setRootType(String rootType) {
        this.rootType = rootType;
    }

}
