package LEC23Season3;

public class Student {

	String name;
	int age;
	
	public void Intro_yourSelf() {
		System.out.println("My name is"+name+"age is "+age);
		
	}
	public void SayHey(String name) {
		System.out.println(this.name +" Say hay "+name);
	}

	public void SayHey1(String a) {
		System.out.println(name +" Say hay "+a);
	}

     public static void Mentorname() {
    //	 name ="Raj";
    	 System.out.println("Monu Bhiya");
     }
     static {
       	 System.out.println("Static Block in block hello ");
        }
}
