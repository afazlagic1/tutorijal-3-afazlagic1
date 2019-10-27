package ba.unsa.etf.rpr.tutorijal_3;

public class MedunarodniBroj extends TelefonskiBroj {
    private String drzava, broj;
    MedunarodniBroj(String drzava, String broj) {
        this.drzava = drzava; this.broj = broj;
    }

    @Override
    public String ispisi() {
        return drzava + broj;
    }
}
