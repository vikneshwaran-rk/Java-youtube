//--Print 10 numbers from an array using for loop.

    import java.util.Scanner;
class q20{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];

        for(int i=0; i<=9; i++){
            num[i] = sc.nextInt();
        }
        for(int i=0; i<=9; i++){
            System.out.println(num[i]);
        }
    }
}