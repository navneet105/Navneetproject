package Lec13Srting;

public class Max_str {

	public static void main(String[] args) {
		String s="sucess";
		System.out.println(max_fre_char(s));

	}
	public static char max_fre_char(String str) {
		int []a=new int[256];
		for (int i = 0; i < str.length(); i++) {
			a[str.charAt(i)]++;
		}
		int maxcount=0;
		char maxfreq=str.charAt(0);
		for (int i = 0; i < str.length(); i++) {
			if(a[str.charAt(i)]>maxcount) {
				maxcount=a[str.charAt(i)];//2
				maxfreq=str.charAt(i);//l
			}
		}
		return maxfreq;
	}

}
