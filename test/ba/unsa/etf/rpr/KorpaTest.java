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
    void dodajArtikl() {
    }

    @Test
    void dajUkupnuCijenuArtikala() {
    }

    @Test
    void getArtikli() {
    }
}