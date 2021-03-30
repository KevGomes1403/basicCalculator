import java.util.Scanner;
import java.lang.Math;

public class Calculator {
    
    public static void add () {
        System.out.println(" ");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Addition (Enter 0 to calculate) ");
        
        double total = 0;
        int i = 1;
        while(true) {
            System.out.print("Number " + i + ": ");
            double sum = sc.nextDouble();
            
            if (sum == 0) {
                break;
            } else {
                total += sum;
            }
            
            i += 1;
        }
        
        System.out.println("=> " + total);
    
    }
    
    public static void multiply () {
        System.out.println(" ");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Multiplication (Enter 0 to calculate) ");
        
        double total = 1;
        int i = 1;
        while(true) {
            System.out.print("Number " + i + ": ");
            double prod = sc.nextDouble();
            
            if (prod == 0) {
                break;
            } else {
                total *= prod;
            }
            
            i += 1;
        }
        
        System.out.println("=> " + total);
    
    }
    
    public static void divide () {
        System.out.println(" ");
        
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Dividend: ");
        double quot = sc.nextDouble();
        
        System.out.print("Divisor: ");
        double quot2 = sc.nextDouble();
        
        double total = (double) quot / quot2;
        
        System.out.println("=> " + total);
    
    }
    
    public static void powers () {
        System.out.println(" ");
        System.out.println("Powers ");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Base: ");
        double base = sc.nextDouble();
        
        System.out.print("Exponent: ");
        double exponent = sc.nextDouble();
        
        double total = Math.pow(base, exponent);
        
        System.out.println("=> " + total);
    
    }
    
    public static void nthRoot () {
        System.out.println();
        System.out.println("nth Root: ");
        
        System.out.print("Number: ");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        
        System.out.print("Root: ");
        double root = sc.nextDouble();
        
        double result = Math.pow(num, 1 / root);
        System.out.println("=> " + result);
        
    }

    public static void shapes() {
        
        System.out.println(" ");
        
        System.out.println("Shapes ");
        System.out.println("    1. Triangles (Area, Completely Solve) ");
        System.out.println("    2. Trapezoid (Area) ");
        
        Scanner sc = new Scanner(System.in);
        
        int choiceAdv = sc.nextInt();
        
        if (choiceAdv == 1) {
            triangleHandler();
        } else if (choiceAdv == 2) {
            areaTrapezoid();
        }
    
    }
    
    public static void triangleHandler() {
        
        System.out.println(" ");
        System.out.println("Triangles ");
        
        System.out.println("    1. Area" );
        System.out.println("    2. Completely Solve ");
        
        Scanner sc = new Scanner(System.in);
        int choiceTri = sc.nextInt();
        
        if (choiceTri == 1) {
            areaTriangle();
        } else if (choiceTri == 2) {
            solveTriangle();
        }
        
    }
    
    public static void areaTriangle() {
        
        System.out.println(" ");
        System.out.println("Area of a triangle ");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Height: ");
        double height = sc.nextDouble();
        
        System.out.print("Base: ");
        double base = sc.nextDouble();
        
        double total = (height * base) / 2;
        
        System.out.println("Area of given triangle: " + total);
    
    }
    
    public static void solveTriangle() {
        System.out.println(" ");
        System.out.println("Solving a triangle completely ");
        System.out.println("    1. Angle-Angle-Side ");
        System.out.println("    2. Angle-Side-Angle ");
        System.out.println("    3. Side-Angle-Side ");
        System.out.println("    4. Side-Side-Side " );
        
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        
        if (choice == 1) {
            lawOfSines1();
        } else if (choice == 2) {
            lawOfSines2();
        } else if (choice == 3) {
            lawOfCosines1();
        }
    }
    
    public static void lawOfSines1() {
        System.out.println(" ");
        System.out.println("Angle-Angle-Side ");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Side a: ");
        double side_a = sc.nextDouble();
        
        System.out.print("Angle A: ");
        double angleA = sc.nextDouble();
        
        System.out.print("Angle B: ");
        double angleB = sc.nextDouble();
        
        double angleC = 180 - (angleA + angleB);
        double side_b = (side_a * Math.sin(Math.toRadians(angleB))) / Math.sin(Math.toRadians(angleA));
        double side_c = (side_a * Math.sin(Math.toRadians(angleC))) / Math.sin(Math.toRadians(angleA));
        
        System.out.println("Side b: " + side_b);
        System.out.println("Side c: " + side_c);
        System.out.println("Angle C: " + angleC);
    }
    
    public static void lawOfSines2() {
        System.out.println(" ");
        System.out.println("Angle-Side-Angle ");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Angle A: ");
        double angleA = sc.nextDouble();
        
        System.out.print("Side c: ");
        double side_c = sc.nextDouble();
        
        System.out.print("Angle B: ");
        double angleB = sc.nextDouble();
        
        //complete algorithm that solves triangle through law of sines
        double angleC = 180 - (angleA + angleB);
        double side_a = (side_c * Math.sin(Math.toRadians(angleA))) / Math.sin(Math.toRadians(angleC));
        double side_b = (side_c * Math.sin(Math.toRadians(angleB))) / Math.sin(Math.toRadians(angleC));
        
        System.out.println("Angle C: " + angleC);
        System.out.println("Side a: " + side_a);
        System.out.println("Side b: " + side_b);
    }
    
    public static void lawOfCosines1() {
        System.out.println(" ");
        System.out.println("Side-Angle-Side ");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Side a: ");
        double side_a = sc.nextDouble();
        
        System.out.print("Angle C: ");
        double angleC = sc.nextDouble();
        
        System.out.print("Side b: ");
        double side_b = sc.nextDouble();
        
        double side_c = Math.sqrt(Math.pow(side_a, 2) + Math.pow(side_b, 2) - (2 * side_a * side_b) * Math.cos(Math.toRadians(angleC)));
        
        //Angle A doesn't work
        //TODO: Fix it 
        double angleA = Math.toDegrees(Math.acos((Math.pow(side_a, 2) - ((Math.pow(side_b, 2) + Math.pow(side_c, 2))) / (-2 * side_b * side_c))));
        
        double angleB = 180 - (angleA + angleC);
        
        System.out.println(side_c);
        System.out.println(angleA);
        System.out.println(angleB);
        
    }
    
    public static void areaTrapezoid() {
        
        System.out.println(" ");
        System.out.println("Area of trapezoid ");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Height: ");
        double height = sc.nextDouble();
        
        System.out.print("Base 1: ");
        double base1 = sc.nextDouble();
        
        System.out.print("Base 2: ");
        double base2 = sc.nextDouble();
        
        double total = ((base1 + base2) / 2) * height;
        
        System.out.println("=> " + total);
    
    }
    
    public static void factorial() {
        System.out.println();
        System.out.println("Factorial ");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int num = sc.nextInt();
        
        int result = factorialCalc(num);
        if (result == -1) {
            System.out.println("Undefined ");
        } else {
            System.out.print("=> " + result);
        }
    }
    
    public static int factorialCalc(int num) {
        if (num == 1 || num == 0) {
            return 1;
        } else if (num < 0) {
            return -1;
        } else {
            return num *= factorialCalc(num - 1);
        }
    }
    
    public static void summation() {
        System.out.println();
        System.out.println("Summation: ");
        
        System.out.println("    n ");
        System.out.println("\\¯¯¯¯¯¯\\");
        System.out.println(" \\ ");
        System.out.println("  \\     a(x^y)+b ");
        System.out.println("  / ");
        System.out.println(" / ");
        System.out.println("/______/");
        System.out.println("   x1 ");
        System.out.println();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("x1: ");
        int start = sc.nextInt();
        
        System.out.print("n: ");
        int end = sc.nextInt();
        
        System.out.print("a: ");
        double a = sc.nextDouble();
        
        System.out.print("y: ");
        double y = sc.nextDouble();
        
        System.out.print("b: ");
        double b = sc.nextDouble();
        
        double result = summationCalc(start, end, a, y, b);
        System.out.println("=> " + result);
    }
    
    //uses the format: a(x^n)+b
    public static double summationCalc(int start, int end, double a, double n, double b) {
        if (start > end) {
            return 0;
        } else {
            return (double)(a * Math.pow(start, n) + b) + summationCalc(start + 1, end, a, n, b);
        }
    }
    
    public static void linear() {
        System.out.println();
        
        System.out.println("Linear Equations: ");
        System.out.println("    1. Standard Form ");
        System.out.println("    2. Slope-Intercept Form ");
        System.out.println("    3. Point-Slope Form ");
        
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        
        if (choice == 1) {
            linearStand();
        } else if (choice == 2) {
            linearSlopeInt();
        }
    }
    
    public static void linearStand() {
        System.out.println();
        System.out.println("ax + by = c ");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        double a = sc.nextDouble();
        
        System.out.print("b: ");
        double b = sc.nextDouble();
        
        System.out.print("c: ");
        double c = sc.nextDouble();
        
        double slope = (a * -1) / b;
        double xInt = c / b;
        double yInt = c / a;
        
        System.out.println("Slope: " + slope);
        System.out.println("X-Intercepts: (" + xInt + ", 0) ");
        System.out.println("Y-Intercepts: (0, " + yInt + ") ");
    }
    
    public static void linearSlopeInt() {
        System.out.println();
        System.out.println("y = mx + b ");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("m: ");
        double m = sc.nextDouble();
        
        System.out.print("b: ");
        double b = sc.nextDouble();
        
        double slope = m;
        double xInt = (b * -1) / m;
        double yInt = b;
        
        System.out.println("Slope: " + m);
        System.out.println("X-Intercept: (" + xInt + ", 0) ");
        System.out.println("Y-Intercept: (0, " + yInt + ") ");
        
    }
}
