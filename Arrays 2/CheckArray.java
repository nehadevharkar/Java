import java.util.Arrays;
import java.util.Scanner;

class Array5{

	static boolean checkArray(int[] arr){

		boolean isSort = true;

		for(int i=1; i<arr.length; i++){

			if(arr[i]<arr[i-1]){

				isSort=false;
				break;
			}
		}

		return isSort;

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

		System.out.println(checkArray(arr));
	}
}
