import java.util.Scanner;
public class Lab03_B_For {

    public static void main(String[] args) {
        
        Scanner READ = new Scanner(System.in);
        
        int Num1;
        int Num2;
        int k; 
        int j;
        int sum = 0;
        
        System.out.println("Please give me two numbers. The first number must be less than the other number.\n");
        
        System.out.print("Input the first number: ");
        Num1 = READ.nextInt();
        
        System.out.print("Input the second number: ");
        Num2 = READ.nextInt();
        
        if ( Num1 < Num2 ){
            
            System.out.println("\nThe Odd numbers between " + Num1 + " and " + Num2 + " inclusive are:\n ");
            
            for ( k = 0; k < Num2 + 1; k++ ){
                
                 if ( k % 2 != 0 && k >= Num1 ){
                    System.out.println(k);
                }
                
            }
            
            for ( j = 0; j < Num2 + 1; j++ ){
                
                 if ( j % 2 == 0 && j >= Num1 ){
                    
                     sum = sum + j;
                }
            }
            
            System.out.println("\nThe sum of the even numbers between " + Num1 + " and " + Num2 + " inclusive is: " + sum );
          
        }
        else {
            System.out.println("You didn't input correctly.");
        }
    }
    
}
