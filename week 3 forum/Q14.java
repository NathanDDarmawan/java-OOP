import java.util.Scanner;
import java.lang.Math;
public class Q14
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Enter the number of seconds:");
        int s = sc.nextInt();
        
        int h = s/3600;
        int m = (s%3600)/60;
        s = (s%3600)%60;
        
        System.out.println("Hours = " + h);
        System.out.println("Minutes = " + m);
        System.out.println("seconds = " + s);        
        
	}
}
