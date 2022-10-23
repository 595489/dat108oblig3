package no.hvl.dat108.oblig3;

import java.util.ArrayList;
import java.util.List;

public class Handleliste {
    private List<Vare> varer = new ArrayList<>();

    public Handleliste(){

    }

    public void leggTilVare(String navn){
        varer.add(new Vare(navn));
    }

    public void fjernVare(int vareIndex){
        varer.remove(vareIndex);
    }

    public int getVareIndex(Vare vare){
        return varer.indexOf(vare);
    }
}
