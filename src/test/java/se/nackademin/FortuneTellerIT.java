package se.nackademin;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Test;

public class FortuneTellerIT {

    @Test
    public void testGetFortune() {
        FortuneTeller fortuneTeller = new FortuneTeller(new MagicNumbers(), new Translator());
        fortuneTeller.setAge("16");
        fortuneTeller.setHeight("165");
        fortuneTeller.setIncome("11000");
        fortuneTeller.setLocation("Hagfors");
        fortuneTeller.setName("Sture Hagfors");
        String output = fortuneTeller.calculate();
        assertEquals("Fortune should be calculated correctly", "Din framtid är mjuk. Du borde sluta se. Vi ser att du snart kommer att skaffa en fotboja. Snart kommer du vilja mäta, men då är det viktigt att du är mörk.", output);
    }
    
    @Test
    public void testCalculateLargeD() {
        FortuneTeller fortuneTeller = new FortuneTeller(new MagicNumbers(), new Translator());
        fortuneTeller.setAge("40");
        fortuneTeller.setHeight("165");
        fortuneTeller.setIncome("11000");
        fortuneTeller.setLocation("Hagfors");
        fortuneTeller.setName("Sture Hagfors");
        String output = fortuneTeller.calculate();
        assertEquals("Fortune should be calculated correctly", "Din framtid är vacker. Du borde sluta se. Vi ser att du snart kommer att skaffa ett hus. Snart kommer du vilja springa, men då är det viktigt att du är vacker.", output);
    }
    
    @Test
    public void setNameNull() {
        FortuneTeller fortuneTeller = new FortuneTeller(new MagicNumbers(), new Translator());
        assertFalse(fortuneTeller.setName(null));
    }

    @Test
    public void setLocationNull() {
        FortuneTeller fortuneTeller = new FortuneTeller(new MagicNumbers(), new Translator());
        assertFalse(fortuneTeller.setLocation(null));
    }
}
