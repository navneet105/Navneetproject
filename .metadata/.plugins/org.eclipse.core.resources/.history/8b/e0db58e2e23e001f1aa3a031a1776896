package Lec18;

public class Axis_Orbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Palindromesubstring(s));

	}
	public static int Palindromesubstring(String s) {
		int odd=0;
		for (int axis = 0; axis < s.length(); axis++) {
			for (int orbit = 0; axis-orbit >=0 && axis+orbit<s.length(); orbit++) {
				if(s.charAt(axis-orbit)!=s.charAt(axis+orbit)) {
					break;
				}
				odd++;
				
			}
			
		}
		//nsquare
		int even=0;
		for (double axis = 0.5; axis < s.length(); axis++) {
			for (double orbit = 0.5; axis-orbit >=0 && axis+orbit<s.length(); orbit++) {
				if(s.charAt((int)(axis-orbit))!=s.charAt((int)(axis+orbit))) {//index integer hota h type cast
					break;
				}
				even++;
			}
			
		}
		return odd+even;
	}

}
