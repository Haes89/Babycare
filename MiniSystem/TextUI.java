
/**
 * The text based user interface of our demo system.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class TextUI
{
    private ServiceProvider myController;
    
    private Scanner sc = new Scanner(System.in);
    
    
    public TextUI(ServiceProvider aCtrlr)
    {
        myController = aCtrlr;
    }
    
    private int askForInt(String promptText)
    {
        System.out.print(promptText);
        
        return sc.nextInt();
    }
    
    public void runMenu()
    {
        boolean isRunning = true;
        
        do 
        {
          System.out.println("---=== Main menu ===---\n");
        
          System.out.println("A - Add two numbers");
          System.out.println("P - a to the power of b");
          System.out.println("Q - Quit\n");

          System.out.print("Choose wisely: ");

          
          switch (sc.next().charAt(0))
          {
              case 'A':
              case 'a': System.out.println("\nCalculating a + b");
              
                        int a = askForInt("Enter your first number: ");
                        
                        int b = askForInt("Enter your second number: ");
                        
                        System.out.println("The result is: " 
                           + myController.addTwoDigits(a,b)+"\n");
                        break;
                     
              case 'P': 
              case 'p': System.out.println("\nCalculating a to the power of b");
                        
                        a = askForInt("Enter your base: ");
                        
                        b = askForInt("Enter your power: ");
                        
                        System.out.println("The result is: " 
                          + myController.powerTo(a,b)+"\n");
                        break;
                
              case 'Q':
              case 'q': isRunning = false;
                        System.out.println("Goodbye - system shutdown!");
                        break;
                        
              default : System.out.println("You pressed the wrong key\n");
          }
        }
        while(isRunning);
        
    }
    
}
