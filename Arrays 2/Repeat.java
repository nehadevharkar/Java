import java.util.*;

class Repeat{

	static int repeat(int[] arr){

		for(int i=0; i<arr.length; i++){

			for(int j=i+1; j<arr.length; j++){

				if(arr[i] == arr[j]){

					return arr[i];
				}
			
			}
		}

		return -1;

	}

	public static void main (String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();

		System.out.println("Enter array elemetns : ");
		int[] arr = new int[size];
		for (int i=0; i<arr.length; i++){

			arr[i] = sc.nextInt();
		}

		System.out.println("Element repeated : "+repeat(arr));
	}
}
