import java.util.Scanner;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
	    Scanner reader = new Scanner(System.in);

        System.out.println("Enter the number of items:");
        int NUM_ITEMS = reader.nextInt();
        
        //Error handling
        while (NUM_ITEMS < 0){
            System.out.println("Number must be greater than 0");
            System.out.println("Enter the number of items:");
            NUM_ITEMS = reader.nextInt();
        }
        
        //initializing the array
        int [] items = new int[NUM_ITEMS];
        
        //loop for array input
        System.out.println("Enter the value of all items (separated by space):");
        for (int i = 0; i < items.length; i++){
            items[i] = reader.nextInt();
        }
        
        System.out.println("The values are:" + Arrays.toString(items));
	}
}
