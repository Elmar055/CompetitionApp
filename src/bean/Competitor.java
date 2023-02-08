package bean;


public class Competitor {
    private String name;
    private String surName;

    @Override
    public String toString() {
        return "name=" + name + ", surName=" + surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Competitor(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

}