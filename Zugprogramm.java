
import sum.kern.*;
/**
 * @author Torben Piepenburg & Nick Wessel
 * @version v4.14.0
 */
public class Zugprogramm
{
    // Objekte
    Bildschirm hatBildschirm;
    Lokomotive hatLokomotive;
    //Personenwagen hatPersonenwagen;
    //Gueterwagen hatGueterwagen;

    // Konstruktor
    public Zugprogramm()
    {
        hatBildschirm = new Bildschirm(600,200);
        this.fuehreAus();
    }

    // Dienste
    public void fuehreAus()
    {
        // Aktionsteil
        hatLokomotive = new Lokomotive(100, 100);
      //  hatPersonenwagen = new Personenwagen(100, 100);
      //  hatGueterwagen = new Gueterwagen(100, 100);
        
        // Aufraeumen
      //  hatLokomotive.gibFrei();
      //  hatPersonenwagen.gibFrei();
      //  hatGueterwagen.gibFrei();
        hatBildschirm.gibFrei();
    }
}