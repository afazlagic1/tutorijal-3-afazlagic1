package ba.unsa.etf.rpr.tutorijal_3;

public class FiksniBroj extends TelefonskiBroj {
    private Grad grad;
    private String broj;
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
    public String ispisi() {
        return pozivniBroj() + "/" + broj;
    }
}
