package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Supermarket {
    private ArrayList<Artikl> Police;
    private int kapacitet=1000;
    public Artikl izbaciArtiklSaKodom(String kod) {
        for (Artikl A: Police) {
            if(kod.equals(A.getNaziv()))
                Police.remove(A);
        }
        return null;
    }

    public void dodajArtikl(Artikl a) {
        if(Police==null)Police = new ArrayList<Artikl>();
        //if(Police.size()>=kapacitet)return false;
        //Artikl A= new Artikl(a.getNaziv(),a.getCijena(), a.getKod());
        Police.add(a);
    }

    public Artikl[] getArtikli() {
        return Police.toArray(new Artikl[Police.size()]);
    }
}
