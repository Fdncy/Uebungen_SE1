package org.hbrs.se1.ws25.tests.uebung1;

import org.hbrs.se1.ws25.exercises.uebung1.control.GermanTranslator;
import org.hbrs.se1.ws25.exercises.uebung1.control.Translator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GermanTranslatorTest {

    @Test
    public void aTest() {
        GermanTranslator translator = new GermanTranslator();

        assertEquals( "fuenf" , translator.translateNumber(5));
        assertEquals( "Uebersetzung der Zahl 0 nicht möglich (" + Translator.version + ")" , translator.translateNumber(0));
        assertEquals( "Uebersetzung der Zahl -5 nicht möglich (" + Translator.version + ")" , translator.translateNumber(-5));
        assertEquals( "Uebersetzung der Zahl 13 nicht möglich (" + Translator.version + ")" , translator.translateNumber(13));
    }

}