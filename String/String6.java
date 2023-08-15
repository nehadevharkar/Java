import java.io.*;
class EqualOperatorDemo {

	public static void main (String[] args) throws IOException{

		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		System.out.print ("Enter string one :");
		String str1 = br.readLine();
		System.out.print ("Identity Hash Code of str1 = ");
		System.out.println (System.identityHashCode(str1));

		System.out.print ("Enter string two :");
		String str2 = br.readLine();
		System.out.print ("Identity Hash Code of str2 = ");
		System.out.println (System.identityHashCode(str2));

		if (str1 == str2){

			System.out.println ("Equal");
		}else {

			System.out.println ("Not Equal");
		}
	}
}
