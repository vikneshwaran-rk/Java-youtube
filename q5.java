//Get a input from user, for the variablr called RCB.
   //If RCB == Win Print("Patithar for reason")
   //If RCB == Lose Print("Virat for reason"
   
   
   import java.util.Scanner;
class Main{
    public static void main(String arg[]){
        Scanner com = new Scanner(System.in);
        String RCB = com.nextLine();

        if(RCB.equals("Win")){
            System.out.print("Patithar for reason");
        }else{
            System.out.print("Virat for reason");
        }
    }
}  