/*
	      1
	    1 2 1
	  1 2 3 2 1
	1 2 3 4 3 2 1

 * */

import java.util.*;
class Pattern10{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print ("Enter number of rows : ");
		int r = sc.nextInt();

		System.out.print ("Enter number of cols : ");
		int c = sc.nextInt();

		for(int i=1; i<=r; i++){

			for(int j=1; j<=(r-i); j++){

				System.out.print(" ");
			}

			for(int k=1; k<=i; k++){

				System.out.print(k);
			}

			for(int m=(i-1); m>=1; m--){

				System.out.print(m);
			}

			System.out.println();
		}
	}
}
