import java.util.*;

class Amstrong{

	public static void main (String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no : ");
		int num = sc.nextInt();

		int temp1 = num;
		int temp2 = num;

		int count = 0;
		int sum = 0;

		while(temp1!=0){

			count++;
			temp1 = temp1 / 10;
		}

		while(temp2!=0){

			int rem = temp2 % 10;
			int mult = 1;

			for(int i=1; i<=count; i++)
				mult = mult * rem;

			sum = sum + mult;
			temp2 = temp2 / 10;
		}

		if(num == sum)
			System.out.println("Amstrong");
		else
			System.out.println("Not Amstrong");
	}
}
