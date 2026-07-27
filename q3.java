import java.util.Scanner;

class hello{
    public static void main(String arg[])
    {
        Scanner dude = new Scanner(System.in);
        int a = dude.nextInt();
        int b = dude.nextInt();
        int c = dude.nextInt();
        
        int d = a*b*c;
        int e = a+b+c;
        int f = d/e;

        System.out.println(d);
        System.out.println(e);
        System.out.print(f);

    }
}
