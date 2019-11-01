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

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public int getLength() {
        return length;
    }
}