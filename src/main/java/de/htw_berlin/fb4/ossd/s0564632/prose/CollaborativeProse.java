package de.htw_berlin.fb4.ossd.s0564632.prose;

// Importiert die Infrastruktur des Professors (ProseBuilder, Sentence)
import de.htw_berlin.fb4.ossd.prose.*;

// Importiert deine beiden eigenen Satz-Komponenten aus dem alten Projekt
import de.htw_berlin.fb4.calculator.unisono.my_prose_app.FirstSentence;
import de.htw_berlin.fb4.calculator.unisono.my_prose_app.SecondSentence;

public class CollaborativeProse {

    public static void main(String[] args) {
        System.out.println("--- Starte Collaborative Prose App ---");

        // 1. Instanz des ProseBuilders erstellen
        ProseBuilder builder = new ProseBuilder();

        // 2. Eigene lokale Komponenten registrieren
        builder.register(new FirstSentence());
        builder.register(new SecondSentence());

        // 3. PLATZHALTER  KOMMILITONINNEN
        // builder.register(new PeerSatzKlasse1());
        // builder.register(new PeerSatzKlasse2());

        // 4. Kombinierten Text auf der Konsole ausgeben
        System.out.println("\nGenerierter Text:");
        System.out.println(builder.get());
        System.out.println("--------------------------------------");
    }
}
