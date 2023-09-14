import java.util.*;
class Search{

	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();

		System.out.println("Enter array elements : ");
		int[] arr = new int[size];
		for(int i=0; i<arr.length; i++){

			arr[i] = sc.nextInt();
		}

		System.out.println("Enter element to be searched : ");
		int search = sc.nextInt();	


		int ans = search(arr, size, search);

		System.out.println("Element found at index : "+ans);
	}

	static int search(int[] arr, int size, int n){

		int ans = 0;

		for(int i=0; i<arr.length; i++){

			if(arr[i]==n){

				ans = i;
				break;
			}
		}

		return ans;
	}
}
