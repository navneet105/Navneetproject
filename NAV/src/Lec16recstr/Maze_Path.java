package Lec16recstr;

public class Maze_Path {

	public static void main(String[] args) {
		int n=3;
		int m=3;
		print(0,0,n-1,m-1,"");

	}
	//cc=currr col
	//cr==curr row
	//ec-end col
	//er=end row
	public static void print(int cc,int cr,int ec,int er,String ans) {
		if(cc>ec||cr>er) {
			return;
		}
		if(cc==ec && cr==er) {
			System.out.println(ans);
			return;
		}
		print(cc+1,cr,ec,er,ans+"H");
		print(cc,cr+1,ec,er,ans+"V");
	}

}
