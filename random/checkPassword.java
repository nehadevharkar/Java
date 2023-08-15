import java.util.*;
class Pass {

	static int checkPass(String str, int len){

		if(str == null)
			return 0;

		if(len<4)
			return 0;

		if(str.charAt(0) >= 0 && str.charAt(0) <= 9)
			return 0;

		int num = 0, cap = 0;

		for(int i=0; i<len; i++){

			if (str.charAt(i) == ' ' || str.charAt(i) == '/')
				return 0;

			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
				cap++;

			if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
				num++;
		}

		if(cap>0 && num > 0)
			return 1;
		else
			return 0;

	}

	public static void main (String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter password : ");
		String str = sc.next();
		int len = str.length();

		int ans = checkPass(str, len);

		if(ans == 0)
			System.out.println("Invalid");
		else
			System.out.println("Valid");
	}
}
