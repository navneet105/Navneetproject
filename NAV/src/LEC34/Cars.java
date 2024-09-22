package LEC34;

public class Cars{// implements Comparable<Cars>{
	int price;
	 int speed;
	 String color;

	public Cars() {
		// TODO Auto-generated constructor stub
	}

	public Cars(int price, int speed, String color) {
		// TODO Auto-generated constructor stub
		this.price = price;
		this.speed = speed;
		this.color = color;
	}

	public String toString() {
		return "P " + price + " S " + speed + " C " + color;

	}
	//car class juisne likha tha bo chla gya aur code production p chla gya is interface tabhi use nhi krte comparable ko ek hi kaaam kr payege sort krne ke lye code change kr te h
//choti value aage rekhneh this -other
	//badi value aage rakhna other -this
	//@Override
	//public int compareTo(Cars o) {
		//return this.price-o.price;
		//return o.speed-this.speed;
	//	return this.color.compareTo(o.color);
	//}
}
