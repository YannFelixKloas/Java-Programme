public class primrechner {

	public static void main(String[] args) {
		int x = 1;
		while (x <= 100000) {
			if (prim (x)) {
				System.out.print (x+", ");
			}
			x++;
		}
	}
	static boolean durchzweiteilbar (int a) {
		int b = a / 2;
		b = b*2;
		if (b == a) {
		 	return true;
		}
		else {
			return false;
		}
	}
	static boolean prim (int a) {
		int zähler = 2;
		while (zähler <= a/2) {
			int b = a / zähler;
			b = b*zähler;	
			if (b == a) {
			 	return false;
			}
			zähler++;
		}
		return true;
	}
}
