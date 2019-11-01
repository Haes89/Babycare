package Child.src.main.java;


import java.util.Scanner;

public class Parent
{
   String name;
   int nrChild;

   Scanner scan = new Scanner(System.in);

   public void setName(String name)
   {
       this.name = name;
   }

   public void nrChild(int nr)
   {
       nrChild = nr;
   }

   public String getName()
   {
       return name;
   }

   public int getNrChild()
   {
       return nrChild;
   }

}
