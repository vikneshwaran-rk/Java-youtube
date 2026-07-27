import java.lang.System;
import java.util.Scanner;

class hello{
    public static void main(String arg[])
    {
        Scanner guru = new Scanner(System.in);
        String Name = guru.nextLine();
        int Age = guru.nextInt();

        System.out.println("My name is "+Name);
        System.out.print("My age is"+Age);
    }
}
