import sum.kern.*;
/**
 * @author Torben Piepenburg & Nick Wessel
 * @version v4.14.0
 */
public class Personenwagen extends Waggon
{
    // Bezugsobjekte

    // Attribute

    // Konstruktor
    public Personenwagen(int pH, int pV)
    {
        super (pH, pV);
        super.setzeLaenge(90);
    }

    // Dienste
    protected void zeichne()
    {
        double lH, lV;
        
        lH = this.stift().hPosition();
        lV = this.stift().vPosition();
        
        this.stift().runter();
        
        
        
        
        
        // zurueck zur Ausgangsposition
        this.stift().hoch();
        this.stift().bewegeBis(lH, lV);
    }

}
