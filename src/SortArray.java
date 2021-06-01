import java.util.Random;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter an array lenght of anywhere between 20 and 40: ");
		int arrLength = sc.nextInt();
		boolean outOfbounds;
		
		if (arrLength > 40 || arrLength < 20) {  										//
			outOfbounds = true;															//
		}																				//
																						//	
		else {																			//	
			outOfbounds = false;														//	
																						//			
		}																				//			
																						//
		while (outOfbounds) {															//
			System.out.print("You might be out of bounds. Please try again: ");			//checks if the numbers is between
			arrLength = sc.nextInt();													//			20 and 40
			if (arrLength > 40 || arrLength < 20) {										//		else error message
				outOfbounds = true;														//		
			}																			//
																						//
			else {																		//
				outOfbounds = false;													//
																						//
			}																			//	
		}																				//

		
		sc.close();
		
		int[] listArr = new int[arrLength];
		for (int i = 0; i < listArr.length; i++) {  //creates an array with a user specified length and prints it out
			int randomInt = rnd.nextInt(90) + 10;   //--
			listArr[i] = randomInt;					//--
			System.out.print(listArr[i]);			//--
			if (i < listArr.length - 1) {			//-- 
				System.out.print(", ");       		// --   separate values with ", " excluding the last value and the end of array
			}
		}
		System.out.println();
		int temp = 0;                                    		// sorts array in ascending order
		for (int i = 0; i < listArr.length; i++) {				//--
			for (int j = i + 1; j < listArr.length; j++) {		//--
				if (listArr[i] > listArr[j]) {					//--
					temp = listArr[i];							//--
					listArr[i] = listArr[j];					//--
					listArr[j] = temp;							//--
				}
			}
		}
		for (int i = 0; i < listArr.length; i++) {			//prints out the sorted array
			System.out.print(listArr[i]);					//--
			if (i < listArr.length - 1) {					//--
				System.out.print(", ");						//--

			}
		}

	}

}
