//Get input for five subjects marks. Add all of it, And find average.
//-If average mark is less than 35. Print "Additional class is required"
//-Else Print "You are good to go".

import java.util.Scanner;
class Main{
    public static void main(String arg[]){
        Scanner dox = new Scanner(System.in);
        int sub1 = dox.nextInt();
        int sub2 = dox.nextInt();
        int sub3 = dox.nextInt();
        int sub4 = dox.nextInt();
        int sub5 = dox.nextInt();

        int total = sub1+sub2+sub3+sub4+sub5;
        double avg = total/5;
        System.out.print(avg );

        if(avg < 35){
            System.out.print("Additional class is required");
        }else{
            System.out.print("You are good to go");
        }
    }
}