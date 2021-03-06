package loops_5_4_21;
// Get one string array in return from a static method and print it in main method

public class Loop_hw2 {
	public static void main (String[]args){
//		System.out.println("in main method");
		display();
	}
	
	static void display (){
		String [] my_name = {"This ","is ","Programming Wing"};
		for (int i = 0; i < my_name.length; i++) {
			System.out.print(my_name[i]+" ");
		}
}
}
// the memory location code is also called as hash code (# code)