package no.hvl.dat108.oblig3;

import org.springframework.lang.NonNull;

public class Vare {
    //@Size(min = 1)
    private String navn;

    public Vare(String navn){
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }
}
