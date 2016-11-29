import java.util.Scanner;

/**

 *

 * Name: Dylan Angell

 * Teacher: Mr.Hardman

 * Assignment Demo, Program #1

 * Date Last Modified: 11/28/2016

 *

 */
public class Lab5c {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] userArray = new int [5] ;
		int indexOfSearched = -1;
		double userValue;
		int minimum;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please enter Five Values:");
		
		for(int i = 0; i < userArray.length; i++){
			System.out.print("Please enter a value: ");
			userArray[i] = userInput.nextInt();
		}
		

		minimum = userArray[0];
		
		for(int i = 0; i < userArray.length; i ++){
			
			if(userArray[i] > minimum){
				
				minimum = userArray[i];
				
				if(minimum == userArray[i]){
					indexOfSearched = i;
				}
			}
			
		}
		
		System.out.println("The maximum value is: " + minimum);
		System.out.print("\nThe index of the largest value is: " +indexOfSearched);
		
		userInput.close();
		
	}

}
