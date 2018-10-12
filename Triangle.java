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
	
	public String toString() {
		return "Triangle: A:(" + a.getX() + "," + a.getY() + ") B: (" + b.getX() + "," + b.getY() + ") C: (" + c.getX() + "," + c.getY() + ")";
	}
	public Point getVertex(int vp) {
		if(vp == 0) {return a;}
		else if(vp == 1) {return b;}
		else {return c;}
	}
	public double getPerimeter() {
		return a.distanceTo(b) + b.distanceTo(c) + c.distanceTo(a);
	}
	public void setVertex(int n, Point p) {
		if(n == 0){a = new Point(p.getX(), p.getY());}
		if(n == 1){b = new Point(p.getX(), p.getY());}
		if(n == 2){c = new Point(p.getX(), p.getY());}
	}
	public void setVertex(int n, double nx, double ny) {
		if(n == 0){a = new Point(nx, ny);}
		if(n == 1){b = new Point(nx, ny);}
		if(n == 2){c = new Point(nx, ny);}
	}
	
	
}
