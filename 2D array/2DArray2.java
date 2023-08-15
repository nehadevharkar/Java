class TwoD2 {

	public static void main (String args[]){

		//int arr [][] = new int [3][];		//compilation successful
		//int arr [][] = new int [][3];		// compilation error
		//int arr[][] = new int [][];		//error: array dimension missing
                

		int arr[] = new int [5];
		//System.out.println (arr.length);	// 1D length = number of cols

		int arr1[][] = new int [8][8];
		//System.out.println (arr1.length);	// 2D length = number of rows i.e. no. of objects created

		int arr2[][] = {{10,20,30},{40,50}, {90}};
		for (int i = 0; i < arr2.length; i++){
			for (int j = 0; j < arr2[i].length; j++){
				System.out.print([i][j] + " ");
			}
			System.out.println();
		}
	}
}
