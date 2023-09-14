import java.io.*;

class MaxMin{

	public static void main (String[] args)throws IOException{

		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		System.out.println("Enter array size : ");
		int size = Integer.parseInt(br.readLine());

		int[] arr = new int[size];
		System.out.println("Enter array elements : ");
		for(int i=0; i<arr.length; i++){

			arr[i] = Integer.parseInt(br.readLine());
		}

		int max = arr[0];
		int min = arr[0];

		for(int i=0; i<arr.length; i++){

			if(min > arr[i]){

				min = arr[i];
			}
			else if(max < arr[i]){

				max = arr[i];
			}
		}


		System.out.println("Max : "+max);
		System.out.println("Min : "+min);
	}
}
