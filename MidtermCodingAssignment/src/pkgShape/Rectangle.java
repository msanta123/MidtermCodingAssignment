package pkgShape;

public class Rectangle extends Shape {
	private int iWidth;
	private int iLength;
	
	public Rectangle(int width, int length) {
		this.iWidth = width;
		this.iLength = length;
	}
	public int getWidth() {
		return iWidth;
	}
	public void setWidth(int newWidth) {
		this.iWidth = newWidth;
	}
	public int getLength() {
		return iLength;
	}
	public void setLength(int newLength) {
		this.iLength = newLength;
	}
	@Override
	public double area() {
		double area = (double) iWidth * iLength;
		return area;
	}
	@Override
	public double perimeter() {
		double perimeter = (double) 2 * (iWidth + iLength);
		return perimeter;
	}
	public int compareTo(Object myObject) {
		Rectangle myRectangle = (Rectangle) myObject;
		return(Double.compare(this.area(),myRectangle.area()));
	}

}
