package no.hvl.dat108.oblig3.utils;

import org.springframework.beans.factory.annotation.Value;

public class Validator {



    public static boolean isValidPassword(String password, String riktigpass){
        if (!password.equals(riktigpass)){
            return false;
        }
        else return true;
    }
}
