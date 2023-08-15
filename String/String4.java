class StringDemo4 {

	public static void main (String[] args){

		int arr1[] = {10,20,300,400};
		Integer arr2[] = {10,20,300,400};

		System.out.println (System.identityHashCode(arr1[0]));		//calls valueOf function
		System.out.println (System.identityHashCode(arr1[1]));
		System.out.println (System.identityHashCode(arr1[2]));
		System.out.println (System.identityHashCode(arr1[3]));

		System.out.println (System.identityHashCode(arr2[0]));		// doesn't calls valueOf function
		System.out.println (System.identityHashCode(arr2[1]));		//Integer itself is a CLASS, hence object is created
		System.out.println (System.identityHashCode(arr2[2]));
		System.out.println (System.identityHashCode(arr2[3]));
	}
}
