import java.util.Scanner;

public class MyProgram extends Calculator {
    
    public static void main(String[] args) {
        
        System.out.println("Calculator ");
        System.out.println("    1. Add ");
        System.out.println("    2. Multiply ");
        System.out.println("    3. Divide ");
        System.out.println("    4. Powers ");
        System.out.println("    5. nth Root ");
        System.out.println("    6. Shapes ");
        System.out.println("    7. Factorial ");
        System.out.println("    8. Summation ");
        System.out.println("    9. Linear Equations ");
        System.out.println("    0. Calculate/Exit ");
        
        Scanner init = new Scanner(System.in);
        
        while (true) {
            int choice = init.nextInt();
            
            if (choice == 1) {
                add();
            } else if (choice == 2) {
                multiply();  
            } else if (choice == 3) {
                divide();
            }else if (choice == 4) {
                powers();
            } else if (choice == 5) {
                nthRoot();
            } else if (choice == 6) {
                shapes();
            } else if (choice == 7) {
                factorial();
            } else if (choice == 8) {
                summation();
            } else if (choice == 9) {
                linear();
            } else if (choice == 0) {
                System.out.println("Thanks for using this calculator! ");
                break;
            } else {
                System.out.println("Not a valid operation! ");
            }
            
            System.out.println(" ");
            System.out.println("Anything else? If not, enter 0 to exit. ");
            
        }
    }
    
    
}
