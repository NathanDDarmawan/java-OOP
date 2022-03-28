import java.util.Scanner;
import java.util.Arrays;

public class StudentGrade
{
	public static void main(String[] args) {
	    Scanner reader = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int numStudents = reader.nextInt();
        
        //Error handling
        while (numStudents < 0){
            System.out.println("Number must be greater than 0");
            System.out.println("Enter the number of students:");
            numStudents = reader.nextInt();
        }
        
        //initializing the array
        int [] grades = new int[numStudents];
        int total = 0;
        
        //loop for array input
        for (int i = 0; i < grades.length; i++){
            System.out.println("Enter the grade for student "+(i+1));
            grades[i] = reader.nextInt();
            while(grades[i]>100 || grades[i]<0){
                System.out.println("Grade must be > 0 and < 100");
                System.out.println("Enter the grade for student "+(i+1));
                grades[i] = reader.nextInt();
            }
            total += grades[i];
        }
        
        double average = total/numStudents;
        Arrays.sort(grades);
  
        System.out.printf ("The average is: "+average+'\n'+"The minimum is: " + grades[0]+'\n'+"The maximum is: " + grades[numStudents-1]);
	}
}
