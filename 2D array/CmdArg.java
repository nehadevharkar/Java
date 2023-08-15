
class CmdDemo {

	public static void main (String[] args){

		String str[] = {"aaa", "bbb", "ccc", "dddd"};
		for (String str1:str){

			System.out.println (str1);
		}

		for (int i=0; i<args.length; i++){

			System.out.println (args[i]);
		}
	}	
}
