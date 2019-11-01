import javafx.scene.Parent;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

    boolean running = true;
    Scanner scan = new Scanner(System.in);
    int val = 0;
    int text = 0;
    Parent parent = new Parent();
    Child child = new Child();

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
                String name = scan.next();
                child.addName(name);

                float fat = scan.next();
                child.setWeight(fat);

                int tall = scan.next();
                child.setLength(tall);


                break;

            case 'A':                  // Closing the menu.
            case 'a':

                break;
        }
    }
    while(running = true);




    }




}
