package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {
    @Test
    void testirajGetter() {
        Artikl A= new Artikl("Brasno", 10,"1");
        assertEquals(A.getNaziv(), "Brasno");
        assertEquals(A.getCijena(),10);
        assertEquals(A.getKod(), "1");
    }
}