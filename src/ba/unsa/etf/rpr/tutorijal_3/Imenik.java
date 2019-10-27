package ba.unsa.etf.rpr.tutorijal_3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Imenik {
    private HashMap<String, TelefonskiBroj> imenik = new HashMap<String, TelefonskiBroj>();
    public void dodaj(String ime, TelefonskiBroj broj) {
            imenik.put(ime, broj);
    }
    String dajBroj(String ime) {
        return imenik.get(ime).ispisi();
    }
    String dajIme(TelefonskiBroj broj) {
        for(String i : imenik.keySet()) {
            if(imenik.get(i).equals(broj))
                return i;
        }
        return "niko";
    }
    String naSlovo(char s) {
        String krajnji = "";
        int rednibr = 1;
        String pom = Character.toString(s);
        for(String i : imenik.keySet()) {
            if(i.startsWith(pom)) {
                krajnji += Integer.toString(rednibr);
                krajnji += "." + i + " - " + imenik.get(i).ispisi() + "\n";
            }
        }
        return krajnji;
    }
    /*
    Set<String> izGrada(Grad g) {
        Set<String> skupGradova = new Set<String>();
        return skupGradova;
    }
    Set<TelefonskiBroj> izGradaBrojevi(Grad g) {
        Set<TelefonskiBroj> brojevi = new Set<TelefonskiBroj>();
        return brojevi;
    }
    */
}
