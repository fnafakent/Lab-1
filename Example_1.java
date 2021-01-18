import java.util.*;
public class Example_1 
{

	public static void main(String[] args) 
	{
	
			      Scanner input = new Scanner(System.in);

			      System.out.print("Enter average (-1 to quit): ");
			      int inputNumber = input.nextInt();

			      while (inputNumber != -1) {
			         if (inputNumber >= 0 && inputNumber <= 100) {
			            System.out.printf("Point is: %d%n",
			               qualityPoints(inputNumber));
			         }
			         else {
			            System.out.println("Invalid input.");
			         }
			         
			         System.out.print("Enter average (-1 to quit): ");
			         inputNumber = input.nextInt();
			      }
			   }

			   // return single-digit value of grade
			   public static int qualityPoints(int grade) {
			      if (grade >= 90) {
			         return 4;
			      }
			      else if (grade >= 80) {
			         return 3;
			      }
			      else if (grade >= 70) {
			         return 2;
			      }
			      else if (grade >= 60) {
			         return 1;
			      }
			      else {
			         return 0;
			      }
			   } 
			}

