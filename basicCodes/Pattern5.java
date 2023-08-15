/*
 
_ _ _ * _ _ _		i	Spaces		Stars
_ _ * * * _ _		1	3 = 4-1		1 = 2*1-1
_ * * * * * _		2	2 = 4-2		3 = 2*2-1
* * * * * * *		3	1 = 4-3		5 = 2*3-1
			4	0 = 4-4		7 = 2*4-1
				= r-i		=2*i-1
 * */

import java.util.*;
class Pattern5 {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int r = sc.nextInt();

		System.out.print("Enter number of columns : ");
		int c = sc.nextInt();

		for(int i=1; i<=r; i++){

			for(int j=1; j<=(r-i); j++){

				System.out.print (" ");

			}

			for(int k=1; k<=(2*i-1); k++){
				
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
