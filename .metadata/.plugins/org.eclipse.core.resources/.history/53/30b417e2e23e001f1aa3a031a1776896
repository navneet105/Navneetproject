package Lec13Srting;

public class Compare_To {

	public static void main(String[] args) {
		// lexco-graphically means dictonary order
		String s1="komal";
		String s2="kunal";
		String s3="raj";
		String s4="rajesh";
		//System.out.println(s1.compareTo(s2));//postive s1 bda negative s2 chota equal 0    -6is ans (o-u)
		
		System.out.println(Comapre(s1,s2));

	}
     public static int Comapre(String s1,String s2) {
    	 int len=Math.min(s1.length(), s2.length());
    	 for(int i=0;i<len;i++) {
    		 if(s1.charAt(i)!=s2.charAt(i)) {
    			 return s1.charAt(i)-s2.charAt(i);
    		 }
    		 
    	 }
    	 return s1.length()-s2.length();    	 
     }
}
