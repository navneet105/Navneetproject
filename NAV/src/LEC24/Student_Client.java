package LEC24;

public class Student_Client {
//main bhej dega jvm ko
	public static void main(String[] args)  {//throws Exception
		Student s=new Student("Raj",22);
		System.out.println("Bye");
		s.setAge(-9);
		System.out.println(s.getAge());
		System.out.println("Hello");
	}

}
