import java.util.*;
class Pass2{

	public static int checkPass(String str,int n){

		if(str == null)
			return 0;

		if(n<4)
			return 0;

		if(str.charAt(0) >= '0' && str.charAt(0) <= '9')
			return 0;

		int num = 0, cap =0;
		for(int i=0; i<n ;i++){

			if(str.charAt(i) == ' ' || str.charAt(i) == '/')
				return 0;

			if(str.charAt(i) >= '0' && str.charAt(i) <= '9')
				num++;

			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
				cap++;
		}

		if(num>0 && cap>0)
			return 1;
		else 
			return 0;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Password : ");
		String pass = sc.nextLine();
		System.out.println();

		int ans = checkPass(pass,pass.length());

		if(ans == 1)
			System.out.println("password is valid");
		else
			System.out.println("password is invalid");
	}
}
