/** Klassen Lotteri implementerad från analys
 *  av det enkla lotterisystemet efter mindre
 *  design- och implementationsbeslut.
 *  Lotteri är applikationsklassen där applikationsstart och
 *  förberedande kod för körningen finns.
 *  (C) Genuine Systems
 */

public class Lotteri
{
  /**
   * Konstruktorn har till uppgift att skapa intial objektstruktur.
   */
  public Lotteri(int storlek)
  {
                                       // Skapa applikationens objektstomme
                                       // "nedifrån och upp", dvs i beroendeordning.
                                       // Lottboken beror inte av ngt annat begrepp.
                                       
    enLottbok = new Lottbok(storlek);
    enKoordinator = new Koordinator(enLottbok);
    enOGY = new Operatorsgransyta(enKoordinator);

    // enKoordinator.setOperatorsgransyta(enOGY); Möjligt, men ger dålig integritet.
  }

  /**
   * Applikationens startpunkt.
   */
  public static void main(String[] args)
  {
    Lotteri lotteri = new Lotteri(100);

    lotteri.exekvera();

  }

  
  private void exekvera()
  {
    enKoordinator.starta();
  }


  private Lottbok enLottbok;
  private Koordinator enKoordinator;
  private Operatorsgransyta enOGY;

}
