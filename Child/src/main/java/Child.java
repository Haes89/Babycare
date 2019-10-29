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

    public float setWeight(float weight) {
        this.weight = weight;
    }

    public int setLength(int length) {
        this.length = length;
    }

    public LocalDate getDOB() {
        return DOB;
    }
}