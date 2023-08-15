class StringDemo1 {

	public static void main (String[] args){

		String str1 = "Core2web";	//SCP
		String str2 = new String ("Core2web");	//heap
		char str3[] = {'C','2','W'}; 		//heap
		String str4 = "Core2web";
		
		System.out.println (System.identityHashCode(str1));
		System.out.println (System.identityHashCode(str2));
		System.out.println (System.identityHashCode(str3));
		System.out.println (System.identityHashCode(str4));		
	}
}
