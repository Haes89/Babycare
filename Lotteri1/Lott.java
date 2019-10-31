/** Klassen Lott implementerad från analys
 *  av det enkla lotterisystemet efter mindre
 *  design - och implementationsjusteringar.
 *  (C) Genuine Systems
 */

public class Lott
{
  public Lott(int nr)
  {
    nummer = nr;
  }


  public boolean arSald()
  {
    return agare != null;               // Om ngn köpt lotten är den såld.
  }


  public boolean arVinst()
  {
    return vinst;
  }


  public void sattVinst()
  {
    vinst = true;
  }


  public int geNr()
  {
    return nummer;
  }


  public Person geKopare()
  {
    return agare;
  }


  public void sattKopare(Person p)
  {
    agare = p;
  }

  private int nummer;                // Lottnumret
  private boolean vinst;             // Har lotten blivit en vinstlott?
  private Person agare;              // Den som köpt lotten

}
