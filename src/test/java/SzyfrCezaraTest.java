import org.example.main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SzyfrCezaraTest {
    @Test
    public void testPodstawowyKluczDodatni() {
        Assertions.assertEquals("def", main.szyfrujTekst("abc", 3));
    }

}
