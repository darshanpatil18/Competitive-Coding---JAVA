interface Colorable {

	public void howToColor();

}

class GeometricObject {

	private String color = "white";
	private boolean filled;
	private final java.util.Date dateCreated;

	protected GeometricObject() {

		dateCreated = new java.util.Date();
	}

	protected GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled(){

		return filled;
	}

	public void setFilled(boolean filled) {

		this.filled = filled;
	}

	public java.util.Date getDateCreated() {

		return dateCreated;
	}

	public String toString() {

		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;

	}

	public double getArea(){

		return 0.0;
	}
}


class Square extends GeometricObject implements Colorable {

	public double side;

	public Square() {

		side=0.0;

	}

	public Square(double side) {

		this.side = side;
	
	}
	
	public void howToColor() {

		System.out.println("The Color of all four sides in Square");

	}

	public double getSide() {

		return side;

	}
	public void setSide(double side) {

		this.side = side;

	}

	public double getArea() {

		double area = side * side;

		return area;

	}

}

public class GeoColor{

	public static void main(String[] args) {

		GeometricObject[] output = {new Square(5), new GeometricObject(), new Square(9), new GeometricObject(), new Square(14)};

		for (int i = 0; i < output.length; i++) {

			System.out.println("The Area : " + output[i].getArea());

			if (output[i] instanceof Colorable) {

				((Colorable) output[i]).howToColor();
			}
		}
	}
}