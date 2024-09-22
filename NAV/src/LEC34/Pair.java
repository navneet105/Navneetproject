package LEC34;

public class Pair<P,Q> {
//	Pint x;
//	boolean y;
	P x;
	Q y;
	public Pair() {
		
	}
	public Pair(P x,Q y) {
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString() {
		return x+" "+y;
	}

}
