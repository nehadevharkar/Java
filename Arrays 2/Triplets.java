import java.util.Scanner;
import java.util.Arrays;

class TargetSum {

	static int triplet(int[] arr, int target){

		int count = 0;

		for(int i=0; i<arr.length; i++){

			for(int j=i+1; j<arr.length; j++){

				for(int k=j+1; k<arr.length; k++){
					
					if(arr[i] + arr[j] + arr[k] == target){

						count++;
					}
				}
			}
		}

		return count;
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

		System.out.println("Enter targeted sum value : ");
		int target = sc.nextInt();

		int ans = triplet(arr,target);

		System.out.println(ans);
	}
}
