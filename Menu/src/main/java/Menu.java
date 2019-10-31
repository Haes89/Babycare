import javafx.scene.Parent;

import java.util.Scanner;

public class Menu {


    boolean running = true;
    Scanner scan = new Scanner(System.in);
    int val = 0;
    int text = 0;
    Parent parent = new Parent();

    do

    {
        
        System.out.println("\nVänlig välj alternativ\n");
        System.out.println("N - Skriv in ditt namn");
        System.out.println("B - Lägg till barn");
        System.out.println("A - Avsluta appligationen");
        System.out.print("\nAnge val: ");

        val = scan.next().charAt(0); //Avläs första position endast.
        text = scan.next().charAt(40);


        switch ((char) val) {
            case 'N':                 // Write the name of the user in the program
            case 'n':
                String nick = scan.next();
                parent.parentName(nick);
                break;

            case 'B':                 // adding a child to the system.
            case 'b':

                break;

            case 'A':                  // Closing the menu.
            case 'a':

                break;
        }
    }

    public Menu() {

    }
    while(running = true);







}
