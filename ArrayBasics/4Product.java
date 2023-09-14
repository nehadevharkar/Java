import java.util.*;

class Product{

	public static void main (String[] args){

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();

		int[] arr = new int[size];
		System.out.println("Enter array elements : ");
		for(int i=0; i<arr.length; i++){

			arr[i] = sc.nextInt();
		}

		int mult = 1;
		for(int i=0; i<arr.length; i++)
			mult = mult*arr[i];

		System.out.println("product = "+mult);
	}
}
