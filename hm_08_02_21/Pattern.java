package hm_08_02_21;

public class Pattern {
static char [] design = {'*','*','*','*','*','*','*'};
 
	public static void main(String[] args) {
		int n = 0;
		do{
			System.out.println("\n");
			int l = design.length - n;
		for (int i = 0; i<l; i++) {
			System.out.print(design[i]);
		}
		n++;
		}while(n<design.length);
	}

}
