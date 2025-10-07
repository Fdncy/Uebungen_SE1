package org.hbrs.se1.ws25.exercises.uebung1.view;

import org.hbrs.se1.ws25.exercises.uebung1.control.Factory;
import org.hbrs.se1.ws25.exercises.uebung1.control.Translator;

public class Client {

	/**
		 * Methode zur Ausgabe einer Zahl auf der Console
		 * (auch bezeichnet als CLI, Terminal)
		 *
		 */
	private Translator t;

		 void display( int aNumber ){
			// In dieser Methode soll die Methode translateNumber
			// mit dem übergegebenen Wert der Variable aNumber
			// aufgerufen werden.
			//
			// Strenge Implementierung (nur) gegen das Interface Translator gewuenscht!
			 t = Factory.createGermanTranslator();
			 String ergebnis = t.translateNumber((aNumber));
			 System.out.println("Das Ergebnis der Berechnung: " + ergebnis);
		 }
}





