/*
 1 2 1 2 1
 2 1 2 1 2 
 1 2 1 2 1 
 2 1 2 1 2
 1 2 1 2 1

 * */

import java.util.*;
class Pattern9{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print ("Enter number of rows : ");
		int r = sc.nextInt();

		System.out.print ("Enter number of cols : ");
		int c = sc.nextInt();

		for(int i=1; i<=r; i++){

			for(int j=1; j<=c; j++){

				if((i+j)%2 == 0)
					System.out.print(1+" ");

				else
					System.out.print(2+" ");
			}

			System.out.println();
		}
	}
}
