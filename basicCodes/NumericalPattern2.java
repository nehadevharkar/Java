/*
 1 2 3 4 5
 1 2 3 4 5 
 1 2 3 4 5 
 1 2 3 4 5
 1 2 3 4 5

 * */

import java.util.*;
class Pattern7{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print ("Enter number of rows : ");
		int r = sc.nextInt();

		System.out.print ("Enter number of cols : ");
		int c = sc.nextInt();

		for(int i=1; i<=r; i++){

			for(int j=1; j<=c; j++){

				System.out.print(j+" ");
			}

			System.out.println();
		}
	}
}
