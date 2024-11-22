/**
 * @description This program auto generates an array of integers and then sorts them using 
 * 				the Bubble sort, Selection Sort, and Insertion sort algorithms. 
 * 
 * @inputs This program takes no integers, but does generate an array of random integers
 * 			Between 0 and 100 and uses that array to sort using several sorting algorithms
 * 
 * @outputs This program outputs 4 versions of the array that is generated in the beginning.
 * 			=> Unsorted List
 * 			=> Bubble Sorted List
 * 			=> Selection Sorted List
 * 			=> Insertion Sorted List
 * 
 * @author Erik Jackson
 * 
 * @contact erik.jackson@my.century.edu
 * 
 * @since 11/10/2024
 * 
 * institution: Century College
 * instructor: Mathew Nyamagwa
 * 
 */

public class Driver {
	/**
	 * @description This method takes in an unsorted array of integers and 
	 * 				prints out a sorted list via the bubble sort method
	 * 
	 * @input arr => an unsorted array of integers
	 * 
	 * @output an array of integers, sorted into descending order
	 */
	public static void bubbleSort(int arr []){
		// Descending Sort
		int n = arr.length;							//	sets the length of the array to n
		for (int i = 0; i < n; i++) {				//  Outer for-loop begins
			for(int j = 0; j < (n - i - 1); j++) {	//  Inner for-loop begins
				if(arr[j] < arr[j + 1]) {			// 	compares arr[j] to the next value
					int temp = arr[j];				//  saves arr[j] to temp
					arr[j] = arr[j + 1];			//  sets arr[j] to the value of arr[j + 1]
					arr[j + 1] = temp;				//  sets arr[j+1] to the value of temp (originally arr[j]
				}
			}
		}
		printArray(arr);							//  prints the sorted and formatted array
	}
	
	/**
	 * @description This method takes in an unsorted array of integers and 
	 * 				prints out a sorted list via the selection sort method
	 * 
	 * @input arr => an unsorted array of integers
	 * 
	 * @output an array of integers, sorted in descending order
	 */
	public static void selectionSort(int[] arr){
		int n = arr.length;							//  Saves the length of the array to n
		
		for (int i = 0; i < n-1; i++) {				//  Beginning of outer for-loop
			int max = i;							//  Initializes max, the index of the highest known integer, as the value of i
			for(int j = i + 1; j < n; j++) {		//  Beginning of the inner for-loop
				if(arr[j] > arr[max]) {				//  If the value of arr[j] is less than arr[max]...
					max = j;						//  Save the index of arr[j] to the max variable
				}									//  End of the conditional if-statement
			}										//  End of the inner for-loop
			int temp = arr[max];					//  Saves the largest known value in arr to temp
			arr[max] = arr[i];						//  Saves the value of arr[i] to the where the value of arr[max] originally was
			arr[i] = temp;							//  Saves the value stored in temp (formerly arr[max]) to its new location
		}
		printArray(arr);							//  prints the sorted and formatted array
	}
	
	/**
	 * @description This method takes in an unsorted array of integers and 
	 * 				prints out a sorted list via the insertion sort method
	 * 
	 * @input arr => an unsorted array of integers
	 * 
	 * @output an array of integers, sorted into descending order
	 */
	public static void insertionSort(int[] arr){
		//Descending Sort
		int n = arr.length;							//  saves the length of the array to n
		int key;									//  defines the key variable
		
		for(int i = 1; i < n; i++) {				//  beginning of the outer for loop
			key = arr[i];							//  initializes the key variable to arr[i] (currently 1)
			for(int j = (i - 1); j >= 0 && arr[j] < key; j--) {//beginning of the inner for loop
				arr[j + 1] = arr[j];				//  shifts the value of arr[j] to the right
				arr[j] = key; 						//  replaces arr[j] with the value of key
			}										//  end of the inner for-loop
		}											//  end of the outer for-loop
		printArray(arr);							//  prints the sorted and formatted array
	}
	
	/**
	 * @description Takes in an array of numbers as a parameter and prints out a
	 * 				formatted list.
	 * 
	 * @input nums => an array of numbers
	 * 
	 * @output formatted list of numbers, enclosed in [] brackets
	 */
	public static void printArray(int[] nums) {
		System.out.print("[");						// Prints opening brackets
		for (int i = 0; i < nums.length; i++) {		// For-loop iterates through the list and prints every integer
			if(i == nums.length -1) { 				// If it is the last number, omit the comma
				System.out.print(nums[i]);
			} else {								// Normal formatting prints the number and then a ", "
				System.out.print(nums[i] + ", ");
			}
		};
		System.out.println("]\n");					// Prints closing brackets
	}
	
	public static void main(String[] args) {
		// Sets the length of the array(s) to be generated.
		final int SIZE = 10;
		// Creates 3 arrays with the number of elements equal to SIZE
		int[] numbers1 = new int[SIZE];
		int[] numbers2 = new int[SIZE];
		int[] numbers3 = new int[SIZE];
		
		// for-loop iterates a number of times equal to SIZE and generates
		// an array with those values.
		for(int i = 0; i < SIZE; i++) {
			int newArrayNumber = (int)Math.floor(Math.random()*100);
			numbers1[i] = newArrayNumber;
			numbers2[i] = newArrayNumber;
			numbers3[i] = newArrayNumber;
		}
		
		//Prints original unsorted list w/ header
		System.out.println("***Unsorted List***");
		printArray(numbers1);
		
		//Prints bubble sorted list w/ header
		System.out.println("***Bubble Sorted List***"); 
		bubbleSort(numbers1);
		
		// Prints selection sorted list w/ header
		System.out.println("***Selection Sorted List***");
		selectionSort(numbers2);
		
		// Prints insertion sorted list w/ header
		System.out.println("***Insertion Sorted List***");
		insertionSort(numbers3);
	}

}
