package ba.unsa.etf.rpr.tutorijal_3;

import java.util.Objects;

public class FiksniBroj extends TelefonskiBroj implements Comparable {
    private Grad grad;
    private String broj;
    public enum Grad { SARAJEVO, TUZLA, ZENICA, BIHAĆ, ORAŠJE, TRAVNIK, MOSTAR, ŠIROKIBRIJEG, GORAŽDE, LIVNO, BRČKO};
    private String pozivniBroj() {
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
    FiksniBroj(Grad grad, String broj) {
    this.grad = grad; this.broj = broj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FiksniBroj that = (FiksniBroj) o;
        return grad == that.grad &&
                broj.equals(that.broj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), grad, broj);
    }

    @Override
    public String ispisi() {
        return pozivniBroj() + "/" + broj;
    }

    @Override
    public int compareTo(Object o) {
        FiksniBroj f = (FiksniBroj) o;
        if(this.ispisi().compareTo(f.ispisi()) > 0) return 1;
        else if(this.ispisi().compareTo(f.ispisi()) < 0) return -1;
        return 0;
    }

}
