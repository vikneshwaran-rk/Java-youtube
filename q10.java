//Get input for a number and find it is even or odd number.

import java.util.Scanner;
class Main{
    public static void main(String arg[]){
        Scanner god = new Scanner(System.in);
        int num = god.nextInt();
        
        if(num%2 == 0){
            System.out.print("Even");
        }else{
            System.out.print("Odd");
        }
    }
}