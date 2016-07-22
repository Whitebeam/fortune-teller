package se.nackademin;

import org.junit.Test;

import static org.junit.Assert.*;
//import static org.mockito.Mockito.*;

/**
 *
 * @author Whitebeam
 */
public class TranslatorTest {

    @Test
    public void testGetNoun() {
        Translator translator = new Translator();
        String result = translator.getNoun(5);
        assertTrue("should return 'ett hus' for input 5", "ett hus".equals(result));
    }

    @Test
    public void testGetVerb() {
        Translator translator = new Translator();
        String result = translator.getVerb(3);
        //System.out.println("result=" + result);
        assertTrue("should return 'se' for input 3", "se".equals(result));
    }

    @Test
    public void testGetAdjective() {
        Translator translator = new Translator();
        String result = translator.getAdjective(0);
        assertTrue("should return 'ett hus' for input 0", "stor".equals(result));
    }
    
}
