/** Klassen Person implementerad från analys
 *  av det enkla lotterisystemet efter mindre
 *  design- och implementationsjusteringar.
 *  (C) Genuine Systems
 */

import java.util.*;

public class Person
{
  public Person(String namnet, String numret)
  {
    namn = namnet;
    telefonnummer = numret;
  }


  public String geNamn()
  {
    return namn;
  }


  public String geTelNr()
  {
    return telefonnummer;
  }

  private String namn;
  private String telefonnummer;

  // Detta kunde vara sättet att implementera kopplingen från
  // en person till flera lotter om den associationen behövdes.

  // private ArrayList koptaLotter;

}