import java.util.Scanner;
import java.util.Arrays;

class Duplicate {

	static int duplicate(int[] arr){

		for(int i=0; i<arr.length; i++){

			for(int j=i+1; j<arr.length; j++){

				if(arr[i] == arr[j]){

					arr[i] = -1;
					arr[j] = -1;
				}
			}
		}

		int ans = -1;
		for(int i=0; i<arr.length; i++){

			if(arr[i]>0){

				ans = arr[i];
			}
		}

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

		//System.out.println("Enter targeted sum value : ");
		//int target = sc.nextInt();

		int ans = duplicate(arr);
	
		System.out.println("*********************");
		System.out.println("Unique element in array is : "+ans);
	}
}
