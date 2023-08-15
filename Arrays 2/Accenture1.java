import java.util.*;

class ArrayDemo{

	static int secondLargest(int[] arr, int[] evenArr, int[] oddArr, int size){

		int n = arr.length;
		int even_max = 0;
		int odd_max = 0;
		int sum = 0;

		for(int i=0; i<n; i++){

			if(evenArr[i] > even_max){

				even_max = evenArr[i];
			}
		}

		for(int i=0; i<n; i++){

			if(oddArr[i] > odd_max){

				odd_max = oddArr[i];
			}
		}

		sum = even_max + odd_max;
		return sum;
	}

	public static void main (String[] args){

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();

		int[] arr = new int[size];
		System.out.println("Enter array elements : ");
		for(int i=0; i<arr.length; i++){

			arr[i] = sc.nextInt();
		}

		int[] evenArr = new int[size];
		int[] oddArr = new int[size];

		for(int i=0; i<arr.length; i++){
		
			if(i%2==0){

				evenArr[i] = arr[i];
			}

			if(i%2 == 1){
				oddArr[i] = arr[i];
			}
		}

		Arrays.sort(evenArr);
		Arrays.sort(oddArr);
		System.out.print("Even array : ");
		for(int x: evenArr){

			System.out.print(x+" ");
		}

		System.out.println();
		System.out.print("Odd array : ");
		for(int y : oddArr){

			System.out.print(y+" ");
		}

		System.out.println();

		int sum = secondLargest(arr, evenArr, oddArr, size);
		System.out.println("Sum of second largest elements from both arrays is : "+ sum);
	}
}
