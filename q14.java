//Get input for salary and age.
//If salary greater than or equal to 20000 or age less than or equal to 25,
//get input for required loan amount. If not print "You are not eligible for loan."
//If required loan amount is less than or equal to 50,000 print "You are eligible for loan."
//If it is greater than 50,000 print "maximum loan amount is 50000".

import java.util.Scanner;
class Mian{
    public static void main(String arg[]){
        Scanner foc = new Scanner(System.in);
        int salary = foc.nextInt();
        int age = foc.nextInt();

        if(salary >= 20000 || age <= 25){
            System.out.println("Loan will be provide");
            Scanner doc = new Scanner(System.in);
            int amount = doc.nextInt();

            if(amount <= 50000){
                System.out.print("You are eligible for loan");
            }
            else if(amount >= 50000){
                System.out.print("Maximum loan amount is 50000");
            }
        }else{
            System.out.print("You are not eligible for loan");
        }
    }
}
