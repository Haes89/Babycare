
/**
 * Provides different usable services within the system.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ServiceProvider
{
    private Matematiker myMath;
    
    
    public ServiceProvider(Matematiker aMath)
    {
        myMath = aMath;
    }
    
    public void setMathemagician(Matematiker aMath)
    {
        myMath = aMath;
    }
    
    public int addTwoDigits(int numA, int numB)
    {
        return myMath.add(numA, numB);
    }
    
    public long powerTo(int numA, int numB)
    {
         return myMath.powerTo(numA, numB);
    }
}
