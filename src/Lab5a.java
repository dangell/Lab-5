import java.util.Scanner;

/**

 *

 * Name: Dylan Angell

 * Teacher: Mr.Hardman

 * Assignment #5, Program #1

 * Date Last Modified: 11/23/2016

 *

 */
public class Lab5a {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);
		
		double[] array1 = {12, 22, 32, 12, 52, 62, 72, 82};
		int indexOfSearched = -1;
		double userValue;

		
		
		System.out.print("The values you can choose are: ");
		
		
		for(int i = 0; i < array1.length; i++){
			
			System.out.print(array1[i] + ", ");
			
		}
		
		System.out.print("\nplease enter a value from above");
		userValue = userInput.nextDouble();
		
		for(int i = 0; i < array1.length; i++){
			
			if(userValue == array1[i]){
				indexOfSearched = i;
			}

			
		}
		if(indexOfSearched == -1){
			System.out.println("That value is not a choice");
		}
		else{
		System.out.print("The index of your value is: " + indexOfSearched);
		}
		
		userInput.close();
		
	}

}
