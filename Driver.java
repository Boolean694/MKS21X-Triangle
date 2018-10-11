public class Driver {

	public static void main(String[] args) {
		Triangle tri = new Triangle(2.3, 4.6, 0.0, 2.7, 5.2, 4.3);
		System.out.println(tri.getPerimeter());
		System.out.println(tri.getVertex(0).toS());
		tri.setVertex(0, 3.4, 5.4);
		System.out.println(tri.getPerimeter());
	}
}