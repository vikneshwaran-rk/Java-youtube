//Get input for a variable a and b and print the number from a to b
// input: 5 10
// output: 5 6 7 8 9 10

import java.util.Scanner;
class main{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=a; i<=b ; i=i+1){
            System.out.print(i);
        }
    }
}