import java.util.*;
class Second {

	static int secondMax(int[] arr, int size){

		int largest = arr[0];
		int secondlargest = arr[0];

		for(int i=0; i<arr.length; i++){

			if(arr[i]>largest){

				secondlargest = largest;
				largest = arr[i];
			}

			else if (arr[i]>secondlargest && arr[i]<largest)
				secondlargest = arr[i];

			else
				continue;
		}

		return secondlargest;
	}

	public static void main (String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter array elements : ");
		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();

		System.out.println("Second largest element is : "+secondMax(arr, size));
	}
}
