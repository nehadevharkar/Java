import java.util.*;

class Largest{

	public static void main (String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int size = sc.nextInt();

		int[] arr = new int[size];
		System.out.println("Enter array elements : ");
		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();

		int max = arr[0];
		for(int i=0; i<arr.length; i++){

			if(max < arr[i])
				max = arr[i];
		}

		System.out.println("Max is "+max);
	}
}
