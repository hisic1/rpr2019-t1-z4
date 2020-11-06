package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void izbaciArtiklSaKodom() {
        Supermarket supermarket = new Supermarket();
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        supermarket.dodajArtikl(new Artikl("Romobil", 500, "2"));
        supermarket.izbaciArtiklSaKodom("2");
        assertEquals(supermarket.getArtikli()[0].getCijena(), 1000);
    }

    @Test
    void dodajArtikl() {
    }
}