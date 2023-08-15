import java.util.*;

class ArrayDemo2{

	static int kthSmallest(int[] arr, int k){

		Arrays.sort(arr);
		int ans = arr[k-1];
		return ans;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size : ");
		int size = sc.nextInt();

		int[] arr = new int[size];
		System.out.println("Enter array elements : ");
		for(int i=0; i<arr.length; i++){

			arr[i]=sc.nextInt();
		}

		System.out.print("Enter k : ");
		int k = sc.nextInt();

		int ans = kthSmallest(arr,k);
		System.out.println(k+"th smallest element is "+ans);
	}
}
