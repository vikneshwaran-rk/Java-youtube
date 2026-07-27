//Get input for the variable Mark. If mark >35 print pass. Else print Fail.
import java.util.Scanner;
class Main{
    public static void main(){
        Scanner vom = new Scanner(System.in);
        int mark = vom.nextInt();

        if(mark>34){
            System.out.print("Pass");
        }else{
            System.out.print("Fail");
        }
    }
}