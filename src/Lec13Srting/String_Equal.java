package Lec13Srting;

public class String_Equal {

	public static void main(String[] args) {
		// lexco-graphically means dictonary order
		String s1="Hello";
		String s2=new String("Hello");
		//  System.out.println(s1.equals(s2));  // content krta h ki nhi ==(method)
        System.out.println(Equal(s1,s2));
	}
	public static boolean Equal(String s1,String s2) {
		if(s1==s2) {
			return true;
		}
		if(s1.length()!=s2.length()) {
			return false;
		}
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				return false ;
			}
		}
		return true;
	}

}
