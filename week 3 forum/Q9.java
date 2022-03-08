import java.util.Scanner;
public class Q9
{
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Temperature in Celcius:");
        
        float c = sc.nextFloat();
        float f;
        
        f = (c / 5) * 9 + 32;
        
        System.out.printf("%.1f Celcius degrees are %.1f Fahrenheit degrees.", c, f);
	}
}
