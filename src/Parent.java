import java.util.Scanner;
import java.util.ArrayList;

public class Parent
{
    private String nickname;
    private ArrayList<Child> allMyChildren;
    private int numberOfChildren;

    Scanner scan = new Scanner(System.in);

    public Parent(String nickname)
    {
        this.nickname = nickname;
        allMyChildren = new ArrayList<>();
    }

    public void addChild(Child newChild)
    {
        boolean newToMe = true;
        newToMe = (allMyChildren.indexOf(newChild) == -1);

        if (newToMe)
        {
            allMyChildren.add(newChild);
        }

        newChild.setParent(this);
    }

    public int getChildCount()
    {
        return allMyChildren.size();
    }


}
