import java.util.*;

class MaxElement{

	static void maxArr(int[] arr){

		int max = 0;

		for(int i=0; i<arr.length; i++){

			if(arr[i]>max){
				max = arr[i];
			}
		}

		System.out.println("Maximum element = "+max);
	}

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter array elements : ");
		for(int i=0; i<arr.length; i++){

			arr[i] = sc.nextInt();
		}

		maxArr(arr);
	}
}
