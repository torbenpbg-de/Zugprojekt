import sum.kern.*;
/**
 * @author Torben Piepenburg & Nick Wessel
 * @version v4.14.0
 */ 
public abstract class Waggon
{   
    //Bezugsobjekte
    Stift hatStift; 
    
    //Attribute
    int zLaenge;
    
    //Konstruktor
    public Waggon(int pH, int pV)
    {
        hatStift = new Stift();
        hatStift.bewegeBis(pH, pV);
        this.zeichne();
    }
    
    // Dienste
    protected abstract void zeichne();
    
    protected Stift stift()
    {
        return hatStift;
    }
    
    public int laenge()
    {
        return zLaenge;
    }
    
    protected void setzeLaenge(int pLaenge)
    {
        zLaenge = pLaenge;
    }
    
    public void gibFrei()
    {
        hatStift.gibFrei();
    }

}
