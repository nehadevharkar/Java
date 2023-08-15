import java.util.*;

class Autobiography{

		static int findAutoCount(String str){

			//1210 is autobiographical number
			//0 occurs 1 time
			//1 occurs 2 times
			//2 occurs 1 times
			//0 occurs 0 times
			//return count of distinct digits
			
			if(str==null)
				return 0;

			int[] arr = new int[10];
			int count = 0;

			for(int i=0; i<str.length(); i++){
				
				char digChar = str.charAt(i);
				int digit = digChar - '0';

				if(digit<0 || digit>9)
					return 0;

				count[digit]++;
			}

			for(int i=0; i<str.length(); i++){

				int digit = str.charAt(i)-'0';

				if(digit != count)
					return 0;

				if(count > digit)
					count++;
			}

			return count;

		}
	
	public static void main(String[] args){

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the string : ");
		String str = sc.next();

		int ans = findAutoCount(str);
		System.out.println(ans);
	}
}
