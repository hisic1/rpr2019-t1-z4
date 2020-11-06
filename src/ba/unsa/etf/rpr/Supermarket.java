package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Supermarket {
    private ArrayList<Artikl> Police;
    // int Br_artikala;
    public Artikl izbaciArtiklSaKodom(String kod) {
        for (Artikl A: Police) {
            if(kod.equals(A.getNaziv()))
                Police.remove(A);
        }
        return null;
    }

    public void dodajArtikl(Artikl a) {
        Artikl A= new Artikl(a.getNaziv(),a.getCijena(), a.getKod());
        Police.add(a);
    }

    public Artikl[] getArtikli() {
        return Police.toArray(new Artikl[Police.size()]);
    }
}
