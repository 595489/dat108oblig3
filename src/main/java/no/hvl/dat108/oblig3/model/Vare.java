package no.hvl.dat108.oblig3.model;

import org.springframework.lang.NonNull;

public class Vare {
    //@Size(min = 1)
    private String name;

    public Vare(String name) {
        this.name = name;
    }

    public String getNavn() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
