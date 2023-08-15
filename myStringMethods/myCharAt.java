import java.io.*;
class myCharAt{

	static void myCharAt (char arr[], int index) {

		System.out.println (arr[index]);
	}
	
	public static void main (String[] args)throws IOException {

		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println ("Enter string : ");
		String str = br.readLine();

		System.out.println ("Enter index : ");
		int index = Integer.parseInt(br.readLine());

		char arr[] = str.toCharArray();
		myCharAt(arr, index);
	}


}
