class StringDemo8 {

	public static void main (String[] args){

		String str1 = "Shashi";
		String str2 = "Bagal";

		String str3 = str1 + str2;		// + operator calls append of class StringBuffer and then calls new String
		System.out.println (System.identityHashCode(str3));

		String str4 = str1.concat(str2);	// concat is a method of class String
		System.out.println (System.identityHashCode(str4));

		System.out.println (str3);
		System.out.println (str4);
	}
}
