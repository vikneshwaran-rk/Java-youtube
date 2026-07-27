//Get input for a number and check whether it is divisible by both 3 and 5 or not.
//if yes than print. the number is divisible by 3 and 5.
//else print the number is not divisible by 3 and 5.

import java.util.Scanner;
class Main{
    public static void main(String arg[]){
        Scanner gom = new Scanner(System.in);
        int num = gom.nextInt();

        if(num%3 == 0 && num%5 ==0){
            System.out.print("the number is divisible by 3 and 5");
        }else{
            System.out.print("the number is not divisible by 3 and 5");
        }
    }
}
