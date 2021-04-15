import sum.kern.*;
/**
 * @author Torben Piepenburg & Nick Wessel
 * @version v4.14.0
 */
public class Lokomotive extends Waggon
{
    // Bezugsobjekte

    // Attribute
    
    

    // Konstruktor
    public Lokomotive(int pH, int pV)
    {
        super (pH, pV);
        super.setzeLaenge(90);
    }

    // Dienste
    protected void zeichne()
    {
        
        // Startposition speichern
        double lH, lV;

        // Startpostion für die Lok setzen
        lH = this.stift().hPosition();
        lV = this.stift().vPosition();

        
        // Zeichnen der Lok
        this.stift().runter();

        // Puffer Vorne
        this.stift().dreheUm(90);
        this.stift().bewegeUm(3.5);
        this.stift().hoch();
        this.stift().bewegeUm(-7);
        this.stift().runter();
        this.stift().bewegeUm(3.5);
        this.stift().dreheUm(-90);
        this.stift().bewegeUm(5);
        this.stift().hoch();
        this.stift().dreheUm(-90);
        this.stift().bewegeUm(4);

        //Grundgerüst der Lok
        
        this.stift().runter();
        this.stift().dreheUm(90);
        this.stift().bewegeUm(80);

        this.stift().dreheUm(90);
        this.stift().bewegeUm(50);

        this.stift().dreheUm(90);
        this.stift().bewegeUm(30);

        this.stift().dreheUm(90);
        this.stift().bewegeUm(50);

        this.stift().hoch();
        this.stift().bewegeUm(-25);
        
        //Fenster der Lok
        this.stift().dreheUm(90);
        this.stift().bewegeUm(5);
        this.stift().runter();
        this.stift().bewegeUm(20);
        this.stift().dreheUm(90);
        this.stift().bewegeUm(20);
        this.stift().dreheUm(90);
        this.stift().bewegeUm(20);
        this.stift().dreheUm(90);
        this.stift().bewegeUm(20);

        
        this.stift().hoch();
        this.stift().dreheUm(-90);
        this.stift().bewegeUm(5);
        this.stift().runter();
        
        
        
        //Kessel der Lok P1
        this.stift().bewegeUm(40);
        this.stift().hoch();
        this.stift().bewegeUm(-5);
        this.stift().runter();

        
        
        //Auspuff der Lok
        this.stift().dreheUm(-90);
        this.stift().bewegeUm(15);
        this.stift().dreheUm(90);
        this.stift().bewegeUm(5);
        this.stift().dreheUm(90);
        this.stift().bewegeUm(15);
        this.stift().dreheUm(-90);

        
        
        //Kessel der Lok P2
        this.stift().bewegeUm(10);
        this.stift().dreheUm(90);
        this.stift().bewegeUm(25);

        
        
        //Räder der Lok
        this.stift().hoch();
        this.stift().bewegeUm(5);
        this.stift().dreheUm(90);
        this.stift().bewegeUm(10);
        this.stift().zeichneKreis(5);
        this.stift().bewegeUm(60);
        this.stift().zeichneKreis(5);
        
        
        
        
        //Stift auf Startposition + Puffer (Hinten)
        this.stift().bewegeBis(lH, lV);
        
        this.stift().bewegeUm(85);
        this.stift().runter();
        this.stift().bewegeUm(5);
        this.stift().dreheUm(90);
        this.stift().bewegeUm(3.5);
        this.stift().hoch();
        this.stift().bewegeUm(-7);
        this.stift().runter();
        this.stift().bewegeUm(3.5);
        
        
        

        
        
        // zurueck zur Ausgangsposition
        this.stift().hoch();
        this.stift().bewegeBis(lH, lV);
    }

}
