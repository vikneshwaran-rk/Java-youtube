import java.util.Scanner;

class hello{
    public static void main(String arg[])
    {
        Scanner cam = new Scanner(System.in);
        String name = cam.nextLine();
        int age = cam.nextInt();
        cam.nextLine();
        String city = cam.nextLine();
        System.out.println("My name is "+name);
        System.out.println("My age is "+age);
        System.out.print("I am from "+city);
    }
}
