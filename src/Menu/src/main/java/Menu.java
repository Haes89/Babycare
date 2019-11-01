package Menu.src.main.java;
import java.util.Scanner;

public class Menu {
    Scanner scan = new Scanner(System.in);
    Child.src.main.java.Child goblin = new Child.src.main.java.Child();
    Child.src.main.java.Parent fool = new Child.src.main.java.Parent();


public void runMenu() {

    boolean running = true;

    do {

        System.out.println("\nVänlig välj alternativ\n");
        System.out.println("N - Skriv in ditt namn");
        System.out.println("B - Lägg till barn");
        System.out.println("A - Avsluta appligationen");
        System.out.print("\nAnge val: ");

        char val = scan.next().charAt(0); //Avläs första position endast.


        switch ((char) val) {
            case 'N':                 // Write the name of the user in the program
            case 'n':
                String nick = scan.next();
                fool.setName(nick);
                break;

            case 'B':                 // adding a child to the system.
            case 'b':
                String name = scan.next();
                goblin.addName(name);

                float fat = scan.nextFloat();
                goblin.setWeight(fat);

                int tall = scan.nextInt();
                goblin.setLength(tall);


                break;

            case 'A':                  // Closing the menu.
            case 'a':

                break;
            default:System.out.println("\nPress the right key you git!\n");
        }
    }
    while (running);
}

}





