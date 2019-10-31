/** Klassen Operatorsgransyta implementerad från analys
 *  av det enkla lotterisystemet efter mindre
 *  design- och implementationsbeslut.
 *  (C) Genuine Systems
 */


//import java.io.*;
import java.util.*;
public class Operatorsgransyta
{

  public Operatorsgransyta(Koordinator koord)
  {
    minKoordinator = koord;
    minKoordinator.setOperatorsgransyta(this); // Bra integritet i associationen!
  }

  /**
   * När systemet startas i koordinatorn, körs menyn. Se "Lotteridesign 1".
   */
  public void korMeny()
  {
    int val = 0;

    int antLotter;   // Antal lotter vid försäljning                  
    
    StringBuffer namn = new StringBuffer();    // Stringbuffer fungerar här som 
    StringBuffer telNr = new StringBuffer();   // en förändringsbar String...
    
    Scanner reader = new Scanner(System.in);
   
    
    do
      {
         System.out.println("\nLotterisystemet Lotten\n");
         System.out.println("F - Försäljning av lotter");
         System.out.println("V - Vinstdragning");
         System.out.println("A - Avsluta");
         System.out.print("\nAnge val: ");
        
         val = reader.next().charAt(0); //Avläs första position endast.
        
         switch((char)val)
           {
             case 'F' :                 // Försäljning av lotter - se diagram!
             case 'f' : antLotter = fragaLottantal();
                        fragaPersUppg(namn, telNr);
                        minKoordinator.utforForsaljning(antLotter, namn.toString(), telNr.toString());
                        geRegbekraftelse();
                        break;

             case 'V' :                 // Dragning av vinster - se diagram!
             case 'v' : radnummer = 0;
                        antLotter = fragaAntalVinster();
                        minKoordinator.utforVinstdragning(antLotter);
           }
      }
    while ((char)val != 'A' && (char)val != 'a');

    System.out.println("Lotterisystemet avslutat. Välkommen åter.\n");
  }


  /**
   * Tjänsten för att få ett lottantal från användaren enligt interaktionsdiagrammen.
   */
  public int fragaLottantal()
  {
    StringBuffer line = new StringBuffer();
    int result = 0;
    do
    {
      System.out.print("Ange antal sålda lotter: ");
      readLine(line);
      try
      {
          result = Integer.parseInt(line.toString());
      }
      catch(Exception e)
      {
          System.out.println("Fel inmatning! Skriv ett nummer i stället!");
      }
    }
    while(result <= 0); 
    
    return result;
  }


  /**
   * Tjänsten för att få personuppgifter från användaren enligt interaktionsdiagrammen.
   */
  // StringBuffer kan förändras inuti metoden...
  public void fragaPersUppg(StringBuffer namnet, StringBuffer telNr)
  {
    System.out.println("\nFör försäljningen behövs personuppgifter. \n");

    System.out.print("Ange namn: ");
    readLine(namnet);
    
    System.out.print("Ange telefonnummer: ");
    readLine(telNr);
  }


  /**
   * Bekräftelse av att en försäljning är registrerad.
   */
  public void geRegbekraftelse()
  {
    System.out.println("\nFörsäljningen är registrerad.\n\n");
  }


  /**
   * Efterfrågning av antal vinster i en vinstdragning.
   */
  public int fragaAntalVinster()
  {
    StringBuffer line = new StringBuffer();
    
    int result = 0;
    do
    {
      System.out.print("Ange antal vinster i dragningen: ");
      readLine(line);        
      try
      {
          result = Integer.parseInt(line.toString());
      }
      catch(Exception e)
      {
          System.out.println("Fel inmatning! Skriv ett nummer i stället!");
      }
    }
    while(result <= 0);
      
    return result;
  }


  /**
   * Visar uppgifter om en vinst; lott och person som köpt lotten. 
   * Hanterar att vinstlotten kan vara null.
   */
  public void visaVinst(Lott vinstlott)
  {
    Person pers;

    // Ingen lott - inget att visa!    // Vad händer om denna kontroll inte finns?
    if (vinstlott == null)             
      return;                          

    pers = vinstlott.geKopare();

    // Om vinstlotten inte har någon köpare finns ingen vinnare att visa.
    // Detta är dålig hantering; en såld lott utan köpare är ett systemfel som borde hanteras.
    if (pers == null)
      return;

    System.out.print(++radnummer + ":  " + vinstlott.geNr());

    System.out.println(" - " + pers.geNamn() + "  " + pers.geTelNr());

    // Koden kunde göras lite mera kompakt och på sitt sätt smidigare, men detta
    // följer beskrivningen i sekvensdiagrammet ganska väl. Dock ingen
    // mellanlagring av lottnummer, namn och telenummer.

  }

  /**
   En privat implementationsmetod som har till uppgift att läsa in en rad med tecken.
   Den lämnar resultatet som innehåll i det medsända StringBuffer-objektet.
   */
  private void readLine(StringBuffer buffer)
  {
    Scanner aLineReader = new Scanner(System.in);
  
    buffer.delete(0, buffer.length()); // Töm ur buffern ifall den innehöll något!
    
    buffer.append(aLineReader.next()); // Lägg in den sträng som användaren matade in.
    
  }

  private Koordinator minKoordinator;
  private int radnummer;
  
}