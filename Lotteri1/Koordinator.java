/** Klassen Koordinator implementerad från analys
 *  av det enkla lotterisystemet efter mindre
 *  design- och implementationsbeslut.
 *  Koordinatorn styr och samordnar aktiviteterna i lotterisystemet.
 *  Frågor om systembeteende och sekvenser hanteras här.
 *  (C) Genuine Systems
 */

public class Koordinator
{
  // Objektreferenser till associerade objekt.
  private Operatorsgransyta operGY;
  private Lottbok lottboken;

  /** Initierar koordinatorobjektet med dess lottbok.
    *
    */
  public Koordinator(Lottbok lb)
  {
    lottboken = lb;
  }


  /** Startpunkten för koordinatorn och därmed det sätt som
    * applikationen använder för att köra igång allting från main.
    */
  public void starta()
  {
    // Här skulle man kunna kontrollera att Koordinatorn verkligen fått
    // sin operatörsgränsyta.

    // Naturligtvis kunde anropet göras direkt till operatörsgränsytan från
    // applikationsklassen också. Om ansvaret för att starta (användningsfallet 
    // som inte specificerades) bedöms vara koordinatorns, får man en lite 
    // renare syn på saker om man låter anropet ske härifrån.

    operGY.korMeny();
  }


  /** Driver användningsfallet Lottförsäljning. Se motsvarande sekvensdiagram.
    *
    */
  public void utforForsaljning(int    antalLotter,   // Så kan man skriva
                               String namn,          // för att det skall
                               String tel)           // bli lättläst.

  {
    // Detta är ett litet knep att använda vid implementationen av metoder.
    // Skriv upp en sekvens (pseudokod) för vad metoden skall utföra så blir
    // kodningen betydligt enklare!

    // Sekvens (från sekvensdiagram Utför försäljning):
    // - Skapa nytt personobjekt
    // - Låt lottboken registrera försäljning av rätt antal lotter
    //   för denna person.

    Person nyPerson;
                                       // Det nya personobjektet och
                                       // registreringen...
    nyPerson = new Person(namn, tel);
    lottboken.regForsaljning(nyPerson, antalLotter);
  }


  /** Driver användningsfallet Vinstdragning. Se motsvarande sekvensdiagram.
    *
    */
  public void utforVinstdragning(int antalVinster)
  {
    for (int i = 0; i < antalVinster; i++)
      operGY.visaVinst(lottboken.draVinst());
  }


  /** Kopplar koordinatorn till en användargränsyta.
    *
    */
  public void setOperatorsgransyta(Operatorsgransyta oi)
  {
    operGY = oi;
  }

}














