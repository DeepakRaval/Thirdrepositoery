package hm_08_02_21;
//Write a char type array in one instance method, return this array to main method, 
//and in main method print this array in reverse order.

public class Char_array {

	char [] name(){
		char [] my_name = {'A','B','C','D','E'};
		return my_name;
	}
	public static void main (String [] args){
		Char_array c1 = new Char_array();
		char [] final_array = c1.name();
		for (int i = (final_array.length - 1);i>=0 ; i--) {
			System.out.print(final_array[i] + " ");
		}
	}
}
