
/**
 * Stand-in class for the real Matematiker.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Matematiker
{
   public int add(int nA, int nB)
   {
       return nA + nB;
   }
   
   
   public long powerTo(int nA, int nB)
   {
       long result = nA;
       
       if (nB == 0)
         result = 1;
       
       for(int i = nB; i > 1; i--)
         result *= nA;
         
       return result;
   }
}
