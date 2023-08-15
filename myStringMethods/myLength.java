import java.io.*;
class myLength {

	static int myLen (String str){

		char arr[] = str.toCharArray();

		int count = 0;
		for (int i=0;i<arr.length;i++){

			count++;
		}

		return count;
	}

	public static void main (String[] args)throws IOException{

		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println ("Enter string : ");
		String str = br.readLine();

		int length = myLen(str);

		System.out.println(length);
	}
}
