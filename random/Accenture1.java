import java.util.*;

class Demo{

	static int ans(int r, int unit, int n, int[] arr){

		if(arr == null)
			return -1;

		int sum = 0;
		int count = 0;

		int total_food = r*unit;

		for(int i=0; i<n; i++){

			sum = sum+arr[i];
			count++;

			if(total_food<=sum)
				break;
		}


		if(total_food>sum)
			return 0;

		return count;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rats : ");
		int r = sc.nextInt();

		System.out.println("Enter amount of food : ");
		int unit = sc.nextInt();

		System.out.println("Enter no of houses : ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter house number : ");
		for(int i=0; i<n; i++){

			arr[i] = sc.nextInt();

		}
			System.out.println(ans(r,unit,n,arr));
	}
}
