package loops_5_4_21;

public class Example_2 {
	
	 static String[]display (){
		String [] my_name = {"This ","is ","Programming Wing"};
		return my_name;
	}
	
		public static void main (String[]args){
			for (int i = 0; i <display().length; i++) {
				// the way of defining the object directly with the name of class(class.method)
				// but in this case v are taking return value so no need to take a method
				System.out.print(display()[i]+" ");
			}
		}
		
	}
// do the same with the char[] type of variable


