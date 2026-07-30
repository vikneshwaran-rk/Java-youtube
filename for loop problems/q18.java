//--Count the number of odd number from 1 to 10

class q17{
    public static void main(String arg[]){
        
        int oddcount = 0;

        for(int i=1; i<=10; i++){
            if(i%2==0){
               
            }else{
                oddcount = oddcount + 1;
                System.out.println("Odd number: "+i);
            }
        }System.out.print("Count: "+oddcount);
    }
}

// So, we found the how many odd in between 1 to 10.