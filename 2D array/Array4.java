class Demo {

	public static void main (String[] args){

	/*	int arr[] = new int[]{2000,20,30,40,50};
		System.out.println (arr);
		System.out.println (System.identityHashCode(arr[0]));

		int arr1[] = new int[]{2000,20,30,40,50};
		System.out.println (arr1);
		System.out.println (System.identityHashCode(arr1[0]));
*/

		int arr2[] = new int[]{65,66,67};
		System.out.println (System.identityHashCode(arr2[0]));
		System.out.println (System.identityHashCode(arr2[1]));
		System.out.println (System.identityHashCode(arr2[2]));


		int arr3[] = new int[]{'A','B','C'};
		System.out.println (System.identityHashCode(arr3[0]));
		System.out.println (System.identityHashCode(arr3[1]));
		System.out.println (System.identityHashCode(arr3[2]));

		
	}

}
