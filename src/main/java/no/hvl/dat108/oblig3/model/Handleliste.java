package no.hvl.dat108.oblig3.model;

import java.util.ArrayList;
import java.util.List;

public class Handleliste {
    private List<Vare> varer = new ArrayList<>();

    public  void addItem(Vare vare) {
            varer.add(vare);
    }

    public  void removeVare(String vare) {

            varer.removeIf(p -> p.getNavn().equals(vare));
    }

    public List<Vare> getCartItems() {
        return varer;
    }
}
