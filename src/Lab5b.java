import java.util.Scanner;

/**

 *

 * Name: Dylan Angell

 * Teacher: Mr.Hardman

 * Assignment #5, Program #2

 * Date Last Modified: 11/24/2016

 *

 */
public class Lab5b {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userElement;
		int numOfNum = 0;
		int[] userValues = new int [10];
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please enter ten Values:");
		
		for(int i = 0; i < userValues.length; i++){
			System.out.print("Please enter a value: ");
			userValues[i] = userInput.nextInt();
		}
		
		System.out.println(" What value would you like to search for?");
			userElement = userInput.nextInt();
		
		for(int i = 0; i < userValues.length; i++){

			if(userValues[i] == userElement){
				
				numOfNum ++;
				
			}
			
		}
		System.out.println("The number of times your element has been entered is: " + numOfNum);
		
		userInput.close();
	}

}
