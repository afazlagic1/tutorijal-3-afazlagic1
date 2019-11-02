package ba.unsa.etf.rpr.tutorijal_3;

import java.util.*;

import static ba.unsa.etf.rpr.tutorijal_3.FiksniBroj.Grad.*;

public class Imenik {
    private Map<String, TelefonskiBroj> imenik = new HashMap<>();
    private String pozivniBroj(FiksniBroj.Grad grad) {
        switch (grad) {
            case SARAJEVO:
                return "033";
            case BIHAĆ:
                return "037";
            case LIVNO:
                return "034";
            case TUZLA:
                return "035";
            case TRAVNIK:
                return "030";
            case MOSTAR:
                return "036";
            case ORAŠJE:
                return "031";
            case ZENICA:
                return "032";
            case ŠIROKIBRIJEG:
                return "039";
            case BRČKO:
                return "049";
            case GORAŽDE:
                return "038";
            default:
                return "ne valja grad";
        }
    }
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
                krajnji += ". " + i + " - " + imenik.get(i).ispisi() + "\n";
                rednibr = rednibr + 1;
            }
        }
        return krajnji;
    }

    Set<String> izGrada(FiksniBroj.Grad g) {
        Set<String> skupGradova = new TreeSet<String>();
        for(String t : imenik.keySet()) {
            if(imenik.get(t) instanceof FiksniBroj)
                if(imenik.get(t).ispisi().substring(0, 3).equals(pozivniBroj(g)))
                    skupGradova.add(t);
        }
        return skupGradova;
    }
    Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad g) {
        Set<TelefonskiBroj> brojevi = new HashSet<>();
        for(TelefonskiBroj t : imenik.values()) {
            if(t instanceof FiksniBroj)
                if(t.ispisi().substring(0, 3).equals(pozivniBroj(g)))
                    brojevi.add(t);
        }
        return brojevi;
    }
}
