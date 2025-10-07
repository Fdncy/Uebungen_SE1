package org.hbrs.se1.ws25.exercises.uebung1.control;

public class Factory {

    public static GermanTranslator createGermanTranslator() {
        return new GermanTranslator();
    }

}
