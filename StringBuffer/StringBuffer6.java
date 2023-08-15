class SBDemo6 {

	 public static void main (String[] args){
		 String str1 = "Shashi";
		 String str2 = new String ("Bagal");
		 StringBuffer str3 = new StringBuffer ("Core2Web");

		 StringBuffer str4 = str3.append(str1);        //error: incompatible types: StringBuffer cannot be converted into String
							       //append calls new StringBuffer();

		 System.out.println (str1);
		 System.out.println (System.identityHashCode(str1));
		 System.out.println (str2);
		 System.out.println (System.identityHashCode(str2));
		 System.out.println (str3);
		 System.out.println (System.identityHashCode(str3));	//same identity hash code
		 System.out.println (str4);
		 System.out.println (System.identityHashCode(str4)); 	//same identity hash code
	 }
}
