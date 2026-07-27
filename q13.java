//What is the color of the traffic light?
//-If the answer is "red," Print "Stop"
//-If the answer is "yellow" Print "Get Ready"
//-If the answer is "green" Print "Go"

import java.util.Scanner;
class Main{
    public static void main(String arg[]){
        Scanner dom = new Scanner(System.in);
        String color = dom.nextLine();

        if(color.equals("red")){
            System.out.print("Stop");
        }else if(color.equals("yellow")){
            System.out.print("Get Ready");
        }else if(color.equals("green")){
            System.out.print("Go");
        }
    }
}
