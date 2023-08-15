import java.io.*;

class myConcat {

	static void myConcat(String str1,String str2){

		String str3 = str1+str2;
		System.out.println ("Concatenated String = "+str3);
	}

	public static void main (String[] args) throws IOException{

		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println ("Enter string 1: ");
		String str1 = br.readLine();

		System.out.println ("Enter string 2: ");
		String str2 = br.readLine();

		myConcat(str1, str2);
	}
}
