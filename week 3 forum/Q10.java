import java.util.Scanner;
import java.lang.Math;
public class Q10
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter x1:");
        float x1 = sc.nextFloat();
        System.out.print("Enter x2:");
        float x2 = sc.nextFloat();
        System.out.print("Enter x3:");
        float x3 = sc.nextFloat();
        
        double mean = (x1+x2+x3) / 3;
        System.out.println("mean: " + mean);

        double varience = (Math.pow(x1-mean,2) + Math.pow(x2-mean,2) + Math.pow(x3-mean,2))/3;
        System.out.println("variance: "+ varience); 

        double SD = Math.sqrt(varience);
        System.out.println("standard deviation: " + SD);
	}
}
