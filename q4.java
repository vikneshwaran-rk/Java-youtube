import java.util.Scanner;

class hello{
    public static void main(String arg[])
    {
        Scanner vam = new Scanner(System.in);
        String name = vam.nextLine();
        double score = vam.nextDouble();
        vam.nextLine();
        String department = vam.nextLine();

        System.out.println("My name is "+name);
        System.out.println("My score is "+score/10 +"/10");
        System.out.print("My department is "+department);
    }
}
