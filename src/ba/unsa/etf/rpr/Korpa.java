package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Korpa {
    private ArrayList<Artikl> korpa;
    public  Artikl izbaciArtiklSaKodom(String kod) {
        Artikl upamti=null;
        for (Artikl A: korpa) {
            if(kod.equals(A.getNaziv())) {
                upamti=A;
                korpa.remove(A);
            }
        }
        return upamti;
    }
    public boolean dodajArtikl(Artikl a) {
        Artikl A= new Artikl(a.getNaziv(), a.getCijena(),a.getKod());
        korpa.add(a);
        return false;
    }

    public int dajUkupnuCijenuArtikala() {
        int ukupna=0;
        for (Artikl A: korpa) {
            ukupna=ukupna+A.getCijena();
        }
        return ukupna;
    }
    public Artikl[] getArtikli() {
        return korpa.toArray(new Artikl[korpa.size()]);
    }
}
