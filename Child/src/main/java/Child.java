import java.time.LocalDate;
import java.util.Scanner;

public class Child {
    private String name;
    private float weight;
    private int length;
    private LocalDate DOB;

    Scanner scan = new Scanner(System.in);


    public void addName(String name) {
        name = scan.nextLine();
        this.name = name;
    }


}