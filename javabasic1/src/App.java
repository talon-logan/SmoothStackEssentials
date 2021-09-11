import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;
public class App {

    public static void main(String args[]){
        int n = 5;
       
        reversehalf(n);
        System.out.println();
        print2(n);
        System.out.println(); 
        printReverse(n);
        System.out.println();
        printTrinangle(n);
        guessingGame((int)(Math.random()*50)+1);


        
        
        
    }

    public static void reversehalf( int n){
        for(int i= 0; i <= n; i++){
            for(int j=0;  j <= i; j++){
                System.out.print("* ");

            }
            System.out.println();
        }
    }

    public static void print2(int n){
        for (int i = n; i >= 0; --i) {
            for (int j = 1; j <= i; ++j) {
              System.out.print("* ");
            }
            System.out.println();
          }

    }

    public static void printTrinangle(int n){
        //loop to create the number of row
        for(int i=0; i< n; i++){
            //loop to create the number of space
            for(int j=n-i; j>1; j--){ 
                  System.out.print(" ");
            }
            //stars in loop
            for(int j = 0; j <= i; j++ ){
                System.out.print("* ");
            }
            System.out.println();
            

        }
    }

    public static void printReverse(int n){
        int rows = 5;

        for(int i=n; i>=1; i--){
            //loop to create the number of space
            for(int j=i; j<n; j++){ 
                  System.out.print(" ");
            }
            //stars in loop
            for(int j = 0; j < (2*i-1); j++ ){
                System.out.print("*");
            }
            System.out.println();
            

        }
    }

    public static void guessingGame(int random){
        System.out.println(random);

        int marks = 0;
        int guess = 0;
        Scanner s = new Scanner(System.in);
        

        try{
            
            System.out.println("input your guess");
            guess = s.nextInt();
        }
        catch(InputMismatchException ime){
            System.out.printf("your input should be an integer", guess); 
            throw ime;
        }

        boolean start = true;

        while(start){
            if( random-guess == Math.abs(10) || random == guess){
                System.out.printf("Close: %d was 10 away from %d", guess, random);
                System.out.printf("\n Nice work, you got it right in %d tries", marks);
                start = false;

            }
            else if(marks != 5){
                marks += 1;
                System.out.println("Incorret");
                System.out.println("Try again");
                guess = s.nextInt();
            }
            else{
                System.out.println("You failed to guess correctly");
                start=false;
                
            }


        }

        
    }
}
