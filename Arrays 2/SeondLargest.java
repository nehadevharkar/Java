import java.util.*;

class SecondLargest{

	public static void main (String[] args){

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter array elements : ");
		for(int i=0; i<arr.length; i++){

			arr[i] = sc.nextInt();
		}

		secondLargest(arr);

	}
}
