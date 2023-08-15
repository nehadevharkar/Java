import java.util.*;

class Count{

	static int findCount(int[] arr, int n){

		int count = 0;

		for(int i=0; i<n; i++){

			int flag = 0;

			for(int j = i+1; j<n; j++){

				if (arr[i] == arr[j]){
				
					flag = 1;
					break;
				}
			}

			if(flag == 0)
				count++;
		}

		return count;
	}

	public static void main (String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter array elements : ");
		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();

		int ans = findCount(arr, size);
		System.out.println("Count of distinct elements in the array : "+ans);
	}
}
