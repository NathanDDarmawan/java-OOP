import java.util.Scanner;
import java.lang.Math;
public class Q13
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter a 2nd degree polynomial (ax^2 + bx + c = 0) equation:");
	    
        System.out.println("Enter a:");
        float a = sc.nextFloat();
        System.out.println("Enter b:");
        float b = sc.nextFloat();
        System.out.println("Enter c:");
        float c = sc.nextFloat();
        
        if(a == 0){
            double x = (-c)/b;
            System.out.println("solution for x is: " + x);
        } else{
            // x = (-b +/- sqrt(b^2 - 4ac))/2a
            double x1 = (-b + Math.sqrt(b*b - 4*a*c))/2*a;
            double x2 = (-b - Math.sqrt(b*b - 4*a*c))/2*a;
            System.out.println("solutions for x are: " + x1 + " , " + x2);
        }
        

        
	}
}
