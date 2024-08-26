package Lec27;

public class Client {

	public static void main(String[] args) {
//		P obj1=new P();
//		C obj2=new C();
//		obj1.
		//case 1
//		P obj=new P();
//		System.out.println(obj.d);//1
//		System.out.println(obj.d1);//10
//		obj.fun();
//		obj.fun1();
		//case-2
		//ref varible ka type p ka h object c ka h
//		P obj =new  C();//object in heap memory object create of cand p  obj ka data type p h
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		System.out.println(((C)obj).d2);
//		System.out.println(((C)obj).d);
		//method ke case m new  C()(BLUE PRINT main jake dekhte h) isme ho ta h jisme phlr h
		//method overriding--- 2 method jo paarent m bhi h class m bhi h with same name menthod same return type arumnet (must p 2 classs,extends) run time p p ha complie time c 
//		obj.fun();//abhi bi access p ho ho rha h lekin run time p c ka ho rha h fun name ka method dono m
//		//is trke ke object creation m kabhi p ka nhi call kr sakte
//		obj.fun1();
//		((C)obj).fun2();
		
		// ,case 3   ye hum use nhi kr sakte indian constitu  ye inharitance allow hi nhi kiya kisi bhi launguage m
//		C obj=new P();
//      		System.out.println(obj.d);
//         	System.out.println(obj.d1);
//         	System.out.println(obj.d2);
   		//Case-4
		C obj=new C();
		System.out.println(obj.d);//2
     	System.out.println(obj.d1);//10
     	System.out.println(obj.d2);//20
     	System.out.println(((P)obj).d);//1
     	obj.fun();//c
     	obj.fun1();//p
     	obj.fun2();//c
     	((P)obj).fun();//c
     	
     	
     	//multi lable c p a e f
     	//multiplr inha a--->b   and c   ye allow nhi h in java 
     	//--------java me her call ka parent class h object class--------
     	
     	
	}

}
