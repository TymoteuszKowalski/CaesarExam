import org.example.main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SzyfrCezaraTest {
    @Test
    public void testPodstawowyKluczDodatni() {
        Assertions.assertEquals("def", main.szyfrujTekst("abc", 3));
    }

    @Test
    public void testZawijanieAlfabetu() {
        Assertions.assertEquals("abc", main.szyfrujTekst("xyz", 3));
    }

    @Test
    public void testKluczUjemny() {
        Assertions.assertEquals("abc", main.szyfrujTekst("def", -3));
    }
}
