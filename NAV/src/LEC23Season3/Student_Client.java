package LEC23Season3;

import java.util.ArrayList;

public class Student_Client {

	public static void main(String[] args) {
		//ArrayList<Integer>ll=new ArrayList<>();
		System.out.println("Hello");
		Student s=new Student();
		//rhs (instance)or(object) creation in heap memory whre name is null and age 0
		//s name ka variable stack m jha adress 2k create hoga 
		//s is the reference variable
		//when any calss run be chek the dependecy of the that calss on the other class 
		System.out.println(s.name);
		System.out.println(s.age);
		s.name="Kaju";
		s.age=20;
		System.out.println(s.name);
		System.out.println(s.age);
		s.Intro_yourSelf();//s.Intro_yourSelf(); kerne is intenallly adress pass hota h  this keyaword m jata 
	//refrenecr variable ka adress this keyaword m pass hoga 
		//this key use access for the class ka data member -- variable if class ka loacl varable and function ka loacal varaivle same name ke to acess krne m
		Student s1=new Student();
		s1.name="Raju";
		s1.age=21;
		s1.Intro_yourSelf();
		s.SayHey("Amit");
		//non satitc field object orinted  hota h (her object ke lye alg deta)
		//static is related to class not object
		Student.Mentorname();
		//S1.Mentorname();
	}
	static {
   	 System.out.println("Static Block in block ");
    }

}