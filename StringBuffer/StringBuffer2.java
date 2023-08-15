class SBDemo2 {

	public static void main (String[] args){

		StringBuffer sb = new StringBuffer ();
		System.out.println (sb.capacity());	//default capacity of StringBuffer is 16
							//StringBuffer is mutable
							//changes can be made in the object of StringBuffer

		sb.append("Neha Nandkishor Devharkar");
		System.out.println (sb.capacity());	//34
							//when data gets appended capactiy increases by (oldCapacity + 1 * 2)
		

		sb.append("Neha Nandkishor Devharkar");
		System.out.println (sb.capacity());	//70
	}
}
