import java.util.*;

class DiffOfSum{

	static int diffOfSum(int n, int m){

		int sum1 = 0;
		int sum2 = 0;

		for(int i=0; i<=m; i++){

			if(i%n==0)
				sum1 = sum1 + i;
			else
				sum2 = sum2 + i;
		}

		int diff = sum2 - sum1;
		return diff;
	}

	public static void main (String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n : ");
		int n = sc.nextInt();

		System.out.println("Enter m : ");
		int m = sc.nextInt();

		int ans = diffOfSum(n,m);

		System.out.println("Difference between sums : ");
		System.out.println(ans);

	}
}
