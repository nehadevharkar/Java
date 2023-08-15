import java.util.Arrays;
import java.util.Scanner;

class Array3{

	static int lastOccurrences(int[] arr, int x){

		int lastIndex = -1;

		for(int i=0; i<arr.length; i++){

			if(arr[i]==x){

				lastIndex = i;
			}
		}

		return lastIndex;

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

		System.out.println("Last Occurrence of element "+x+" is "+lastOccurrences(arr, x));
	}
}
