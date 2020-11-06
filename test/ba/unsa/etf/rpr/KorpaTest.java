package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void izbaciArtiklSaKodom() {
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        korpa.dodajArtikl(new Artikl("Romobil", 500, "2"));
        korpa.izbaciArtiklSaKodom("1");
        assertEquals(korpa.getBrojArtikala(), 1);
        assertEquals(korpa.dajUkupnuCijenuArtikala(), 500);
    }
    @Test
    void getArtikli() {
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(new Artikl("Kruska", 2, "1"));
        korpa.dodajArtikl(new Artikl("Jabuka", 1, "2"));
        korpa.dodajArtikl(new Artikl("Banana", 3, "2"));
        assertEquals(korpa.getBrojArtikala(),3);
    }
    @Test
    void testirajKapacitet(){
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(new Artikl("Kruska", 2, "1"));
        korpa.dodajArtikl(new Artikl("Jabuka", 1, "2"));
        korpa.dodajArtikl(new Artikl("Banana", 3, "3"));
        for (int i=4; i<60; i++){
            korpa.dodajArtikl(new Artikl("Biciklo", 1000, Integer.toString(i)));
        }
        assertEquals(korpa.getBrojArtikala(),50);
    }
}