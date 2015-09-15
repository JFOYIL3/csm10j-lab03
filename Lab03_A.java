import java.util.Scanner;

public class Lab03_A {
    public static void main(String[] args) {
        
        Scanner READ = new Scanner (System.in);
        
        double Number_Of_Pages;
        
        System.out.print("How many pages to fax?  ");
        Number_Of_Pages = READ.nextInt();
        
        if ( Number_Of_Pages > 0 && Number_Of_Pages < 11 ){
            
            System.out.println("That will cost: $3.20");
        }
        
        else if ( Number_Of_Pages > 10 ){
   
            System.out.printf("That will cost: $%3.2f\n", (3.20 + ((Number_Of_Pages *.10) - 1))); 
        }
        
        else{
            System.out.println("You can't have negative pages, dummy.");
        }
           
        
        
        
    }
    
