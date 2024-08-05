package LEC23Season3;

public class Person {
	//constructor class ke data meber ko intilize krna  class aur const ka name same hota h no return type nad access modifier is public
	//sbse phle contructor nhi chlta h isse phle 2 step aati h(1 memory alloction then parshinng(ager likha hoga uper))
	//private  is with in  class
	//defalut/protecteted package ke baher nhi dikhta h
	private String name="kaju";
	private int age=21;
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
//	public Person() {
//		
//	}
//	public void setName(String name) {
//		this.name=name;
//	}
//	public String getName() {
//		return this.name;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
