import java.util.Scanner;
import java.util.Arrays;

class ArrayDemo {

	static int[] smallestAndLargestElement(int[] arr){

		Arrays.sort(arr);
		/*for(int i=0; i<arr.length; i++){

			System.out.println(arr[i]);
		}*/

		int[] ans = {arr[0], arr[arr.length-1]};
		return ans;
	}

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter arrays size : ");
		int size = sc.nextInt();

		int[] arr = new int[size];
		System.out.print("Enter array elements : ");
		for(int i=0;i<arr.length;i++){

			arr[i]=sc.nextInt();
		}

		int[] ans = smallestAndLargestElement(arr);
		System.out.println("Smallest element : "+ans[0]);
		System.out.println("Largest element : "+ans[1]);

	}
}
