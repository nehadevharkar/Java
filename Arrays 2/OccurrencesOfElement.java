import java.util.Arrays;
import java.util.Scanner;

class Array2{

	static int countOccurrences(int[] arr, int x){

		int count = 0;

		for(int i=0; i<arr.length; i++){

			if(arr[i]==x){

				count++;
			}
		}

		return count;

	}

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size : ");
		int size = sc.nextInt();

		int[] arr = new int[size];
		System.out.print("Enter array elements : ");
		for(int i=0; i<arr.length; i++){

			arr[i]=sc.nextInt();
		}

		System.out.print("Enter element to find its occurrences : ");
		int x = sc.nextInt();

		System.out.println("Count of Occurrence of element "+x+" is "+countOccurrences(arr, x));
	}
}
