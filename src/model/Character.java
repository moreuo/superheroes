package model;

public abstract class Character {
    protected String name;
    protected String description;
    protected String habilities;
    protected String group;

    public Character(String name, String description, String habilities, String group) {
        this.name = name;
        this.description = description;
        this.habilities = habilities;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescrition(String description) {
        this.description = description;
    }

    public String getHabilities() {
        return habilities;
    }

    public void setHabilities(String habilities) {
        this.habilities = habilities;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
