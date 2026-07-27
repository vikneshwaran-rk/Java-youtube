//Get input for Variable Income. if Income is greater than 7000 scholarship is available Else not eligible for scholarship.
import java.util.Scanner;
class Main{
    public static void main(String arg[]){
        Scanner zom = new Scanner(System.in);
        int income = zom.nextInt();

        if(income>7000){
            System.out.print("Scholarship is available");
        }else{
            System.out.print("Scholarship not available");
        }
    }
}