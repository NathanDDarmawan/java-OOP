import java.lang.Math;
public class Q12
{
	public static void main(String[] args) {
        System.out.println("Number  Square  Cube");
        int i = 0;
        while(i<11){
            System.out.println(i + "\t"  + (int)Math.pow(i,2) + "\t" + (int)Math.pow(i,3)); 
            i++;
        }
	}
}
