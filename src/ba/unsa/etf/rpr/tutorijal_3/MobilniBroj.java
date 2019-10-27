package ba.unsa.etf.rpr.tutorijal_3;

public class MobilniBroj extends TelefonskiBroj {
    private int mobilnaMreza;
    private String broj;
    MobilniBroj(int mobilnaMreza, String broj) {
        //if(mobilnaMreza < 60 || mobilnaMreza > 67) throw;
        this.mobilnaMreza = mobilnaMreza; this.broj = broj;
    }

    @Override
    public String ispisi() {
        return "0" + String.valueOf(mobilnaMreza) + broj;
    }
}
