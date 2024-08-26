package Lec27;

public class C extends P{  //c class p ko inherit kr rha h
	int d=2;
    int d2=10;
  //fun galat likh gya override na ho 1000 line ka code likh k gya h to kse pta kre  anotation user krte h
    @Override
    public void fun() {
    	System.out.println("Fun in C");
    }
    public void fun2() {
    	System.out.println("Fun2 in C");
    }
}
