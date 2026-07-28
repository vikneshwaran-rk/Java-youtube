//-----Ternary Operator-----
//Get input for two integer number and find which number is greater using ternary operator.

import java.util.Scanner;
class Mian{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String max = (a>b)?"a is greater":"b is greater";
        System.out.print(max);
    }
}