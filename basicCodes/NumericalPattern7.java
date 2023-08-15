/*
	      1
	    2   2
	  3       3
	4 4 4 4 4 4 4

 * */

import java.util.*;
class Pattern10{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print ("Enter number of rows : ");
		int r = sc.nextInt();

		System.out.print ("Enter number of cols : ");
		int c = sc.nextInt();

		for (int i = 1; i <= r; i++) {

			for(int j=1; j<=r-i; j++){

				System.out.print(" ");
			}

			System.out.print (i);

			for(int j=1; j<(i-1)*2; j++){

				System.out.print(" ");
			}

			if(i != 1){

				System.out.print(i);
			}

			System.out.println();
		}       
	}
}	
