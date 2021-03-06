package constructor_this;

public class Bank {
 String user_name;
 int acount_no ;
 int bal ;
 String location;
public Bank(String name, int acount_no, int bal) {
//	super();
	this("L_O_C");// Thus V can call another constructor from one constructor.
	this.user_name = name;
	this.acount_no = acount_no;
	this.bal = bal;
}

 
public Bank(String location) {
	super();
	this.location = location;
}


public static void main(String[]arg){
	Bank b1  = new Bank("ABC_XYZ",76453,1299876);
	System.out.println("User name : "+b1.user_name);
	System.out.println("Account no : "+b1.acount_no);
	System.out.println("Available balance : "+b1.bal+" Rs.");
	System.out.println("Branch :"+ b1.location);
}

}
