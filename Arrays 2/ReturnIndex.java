import java.util.*;

class ArrayDemo{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter array elements : ");
		for(int i=0; i<arr.length; i++){

			arr[i] = sc.nextInt();
		}

		System.out.print("Enter the element to be searched : ");
		int search = sc.nextInt();

		System.out.println("Searching......");

		for(int i=0; i<arr.length; i++){

			if(search == arr[i]){

				System.out.println("Element "+arr[i]+" found at index "+i);
			}
		}
			
	}
}
