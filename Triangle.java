public class Triangle {
    private Point a;
    private Point b;
    private Point c;
    
    public Triangle(Point an, Point bn, Point cn) {
		a = new Point(an.getX(), an.getY());
		b = new Point(bn.getX(), bn.getY());
		c = new Point(cn.getX(), cn.getY());
    }
	public Triangle(double ax, double ay, double bx, double by, double cx, double cy) {
		a = new Point(ax,ay);
		b = new Point(bx,by);
		c = new Point(cx,cy);
	}
	
}
