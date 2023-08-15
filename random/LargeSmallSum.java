import java.util.*;

class SecondLargeSum{
	
	static int secondLargeSum(int[] arr, int size){

		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();

		even.add(arr[0]);

		for(int i=0; i<arr.length; i++){

			if(i%2==0)
				even.add(arr[i]);
			else
				odd.add(arr[i]);
		}

		Collections.sort(even);
		Collections.sort(odd);

		int sum = even.get(even.size()-2)+odd.get(odd.size()-2);

		return sum;
	}

	public static void main (String[] args){

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter array size : ");

		int size = sc.nextInt();

		int[] arr = new int[size];
		System.out.println("Enter array elements : ");
		for(int i=0; i<arr.length; i++)
			arr[i]=sc.nextInt();

		int ans = secondLargeSum(arr, size);
		System.out.println("sum of second largest : "+ans);

	}
}
