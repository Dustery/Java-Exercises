package jezioroXY;

	public class Pointy {
		double x;
		double y;
		
		Pointy (double x1, double y1){
			x=x1;
			y=y1;
		}
		Pointy(){
			x=0;
			y=0;
		}
		double dist(Pointy p1, Pointy p2) {
			double dx, dy, d;
			dx = p1.x - p2.x;
			dy = p1.y - p2.y;
			d = Math.sqrt(dx*dx+dy*dy);
			return d;
		}
		
	} //end class
