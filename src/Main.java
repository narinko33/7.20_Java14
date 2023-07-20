
public class Main {
	public static void main(String[] args) {
		Hero h = new Hero();
		h.name = "なりた";

		Hero h2 = new Hero();
		h2.name = "なりた";
		System.out.println(h.equals(h2));
	}

}
