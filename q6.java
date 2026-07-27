//Get a input from user, for the variable called meghana.
//If meghana is "dead" print("Suriya meets Ramya")
//else print("Suriya weds meghana")

import java.util.Scanner;
class Main{
    public static void main(String arg[]){
        Scanner vom = new Scanner(System.in);
        String meghana = vom.nextLine();

        if(meghana.equals("dead")){
            System.out.print("Suriya meets Ramya");
        }else{
            System.out.print("Suriya weds meghana");
        }
    }
}
