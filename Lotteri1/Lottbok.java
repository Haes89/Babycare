/** Klassen Lottbok implementerad från analys
 *  av det enkla lotterisystemet efter mindre
 *  design- och implementationsjusteringar.
 *  (C) Genuine Systems
 */

import java.util.*;

public class Lottbok
{
  /** Registrering av visst antal lotter till en person. */
  public void regForsaljning(Person enPerson, int antal)
  {
    // Plocka lotter slumpvis. Sålda lotter kan inte säljas igen.

    // OBS! **** Om alla lotter sålts returnerar inte metoden! ****

    int j, index;
    boolean found;

    Random rndGen = new Random();
    rndGen.setSeed(System.currentTimeMillis());

    for (int i = 0; i < antal; i++)
      {
        j = 0;
        found = false;

        while(!found)
          {
            index = rndGen.nextInt(lotterna.size());
            if (!(lotterna.get(index)).arSald())
              {
                (lotterna.get(index)).sattKopare(enPerson);
                found = true;
              }
          }
      }
  }

  /**
   * Plockar fram en såld lott som inte tidigare givit vinst.
   */
  public Lott draVinst()
  {
    int i = 0;
    Lott enLott = null;
    while (i < lotterna.size())
      {
        enLott = lotterna.get(i);
        if (enLott.arSald() && !enLott.arVinst())
          {
            enLott.sattVinst();
            break;
          }
        i++;
      }
      
    if (i == lotterna.size())          // Ingenting fanns att dra!
      enLott = null;

    return enLott;
  }

  /**
   * Lottboken fylls med ett antal lotter i slumpvis ordning när den skapas.
   */
  public Lottbok(int antalLotter)
  {
    lotterna = new ArrayList<>(antalLotter);

    // Fyll vektorn med slumpvis numrerade lotter.
    // Ett ganska simpelt sätt att göra detta för att slippa söka efter tidigare
    // inlagda lotter är att hämta lotterna slumpvis ur en temporär vektor där
    // de ursprungligen lagts in i sekventiell ordning.

                                       // Skapa lotterna (i sekvens)...
    ArrayList<Lott> tempLotter = new ArrayList<>(antalLotter);
    for(int i = 0; i < antalLotter; i++)
      tempLotter.add(new Lott(i));


                                       // Flytta över slumpvis...
    int index;
    Random rndGen = new Random();
    rndGen.setSeed(System.currentTimeMillis());
    for (int i = 0; i < antalLotter; i++)
      {
        index = rndGen.nextInt(tempLotter.size());
        lotterna.add(tempLotter.get(index));
                                       
        tempLotter.remove(index);      // Kopierad lott måste tas bort.
      }
  }


  private ArrayList<Lott> lotterna;    // De slumpvist lagrade lotterna.
}
