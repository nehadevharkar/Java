import java.util.*;
class EqualsDemo {

	public static void main (String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print ("Enter string one = ");
		String str1 = sc.next();

		System.out.print ("Enter string two = ");
		String str2 = sc.next();

		if (str1.equals(str2)){			//compares the content

			System.out.println ("Equal");
		}else {

			System.out.println ("Not Equal");
		}
	}
}
