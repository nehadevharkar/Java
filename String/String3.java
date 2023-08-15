class StringDemo3 {

	public static void main (String[] args){

		char ch = 'A';	//goes on integer cache
		int x = 65;	//goes on integer cache
				//still identity hash codes are different
				//why??
				//identity hash codes are address like unique numbers given to object
				//as these are primitve data types identity hash code calls valueOf method

		System.out.println (System.identityHashCode(ch));
		System.out.println (System.identityHashCode(x));
	}
}
