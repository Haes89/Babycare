package Child.src.main.java;


import Menu.src.main.java.Menu;

public class DemoSystem {

    public void run(){
        Menu opt = new Menu();
        opt.runMenu();
    }


    public static void main(String[] args)
    {
        DemoSystem system = new DemoSystem();
        system.run();
    }
}
