//--------Nested for loop----
// Print output 
// *
// **
// ***

class main{
    public static void main(String arg[]){
        for(int j=1; j<=3; j++){
            for(int i=1; i<=j; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}