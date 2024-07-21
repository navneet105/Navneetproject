package Lec13Srting;

public class Reverse_151 {

	public static void main(String[] args) {
		String s="  a good   example  ";
		//186
		System.out.println(s);
		//System.out.println(s.trim());
		s=s.trim();
		
		String []arr=s.split(" \s+");//  \s
		String ans="";
//		System.out.println(arr.length);
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]+" ");
//		}
		for(int i=arr.length-1;i>=0;i--) {
			ans+=arr[i]+" ";
		}
		System.out.println(ans);

	}

}
