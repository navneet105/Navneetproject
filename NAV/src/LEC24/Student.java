package LEC24;

public class Student {
	private String name="Kaju";
	private int age=21;
	
	public Student(String name,int age) {
		this.name=name;
		this.age=age;
	}
//incapsulation 
	//erroe we cannot resolve not recover
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age)  {
		try {
		if(age<0) {
			throw new Exception("age is negative");//generating exception
		}
		this.age = age;
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("I am a final block");
		}
		//throws exception se code terminate ho jata h try and catch se code kabhi terminate nhi hota h
		//finally ki line alwayes chlte h
	}

//	public void setAge(int age) throws Exception {
//		if(age<0) {
//			throw new Exception("age is negative");//generating exception
//		}
//		this.age = age;
//	}
	//throws method ka signature 

}
