public class Point {
	private double x;
	private double y;
	public Point(double xc, double yc) {
		x = xc;
		y = yc;
	}
	public Point(Point p) {
		x = p.x;
		y = p.y;
	}
	
	public String toString() {
		return "Point: (" + x + "," + y + ")";
	}
	public double getX() {return x;}
	public double getY() {return y;}
	public double distanceTo(Point a) {
		return Math.sqrt((Math.abs(x - a.getX()) * Math.abs(x - a.getX())) + (Math.abs(y - a.getY()) * Math.abs(y - a.getY())));
	}
	public static double distance(Point a, Point b) {
		return Math.sqrt((Math.abs(b.getX() - a.getX()) * Math.abs(b.getX() - a.getX())) + (Math.abs(b.getY() - a.getY()) * Math.abs(b.getY() - a.getY())));
	}
	
	public String toS() {
		return "(" + x + "," + y + ")";
	}
}