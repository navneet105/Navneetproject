package Lec33;

public class Payment_method extends Abstract_demo {
// ye jitne bhi unipmlemented method h unko overrride krega  means abstract_demo is parent class and payment_method is child class child class payment class ki sare property(metod ko) access krgega 
	public boolean recharge() {
		  System.out.println("Rechagre done");
		  return true;
	  }
	 public boolean movie() {
		  System.out.println("Movie done");
		  return true;
	  }
	@Override
	public void Payment() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int No_of_item() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
