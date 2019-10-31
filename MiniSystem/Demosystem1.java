
/**
 * Write a description of class Demosystem1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Demosystem1
{
    
   
   private void run()
   {
       ServiceProvider controller = new ServiceProvider(new Matematiker());
       
       TextUI myUI = new TextUI(controller);
       
       
       myUI.runMenu();
       
   }
   
   public static void main(String[] args)
   {
       Demosystem1 system = new Demosystem1();
       
       system.run();
   }
}











