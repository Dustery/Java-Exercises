package jezioroXY;

public class MyPointXY {

	public static void main(String[] args) {
		
		Pointy pa = new Pointy(2,1);
		Pointy p1 = new Pointy(5,7);
		Pointy p2 = new Pointy(12,8);
		Pointy p3 = new Pointy(11,1);
		Pointy p4 = new Pointy(19,2);
		Pointy pb = new Pointy(20,6);
		
		double a, b, c, d, f, g, d1, d2;
		a = p1.dist(pa, p1);
		b = p1.dist(p1, p2);
		c = p1.dist(p2, pb);
		d = p1.dist(pa, p3);
		f = p1.dist(p3, p4);
		g = p1.dist(p4, pb);
		d1 = a + b + c;
		d2 = d + f + g;
		
		System.out.println("Distance 1 = " +d1);
		System.out.println("Distance 2 = " +d2);
		if (d1<d2) {
			System.out.println("Distance 1 is the shortest");
		} else if(d1>d2) {
			System.out.println("Distance 2 is the shortest");
		}
	}

}
