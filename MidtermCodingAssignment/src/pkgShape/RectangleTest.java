package pkgShape;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTest {

	@Test
	public void constructorTest() {
		Rectangle myRectangle = new Rectangle(2,3);
		assertEquals(true, myRectangle instanceof Rectangle);
	}
	@Test
	public void getLengthTest() {
		Rectangle myRectangle = new Rectangle(2,3);
		assertEquals(3,myRectangle.getLength());
	}
	public void getWidthTest() {
		Rectangle myRectangle = new Rectangle(2,3);
		assertEquals(2,myRectangle.getWidth());
	}
	public void setLengthTest() {
		Rectangle myRectangle = new Rectangle(2,3);
		myRectangle.setLength(5);
		assertTrue(5 == myRectangle.getLength());
	}
	public void setWidthTest() {
		Rectangle myRectangle = new Rectangle(2,3);
		myRectangle.setWidth(7);
		assertTrue(7 == myRectangle.getWidth());
	}
	public void areaTest() {
		Rectangle myRectangle = new Rectangle(2,3);
		assertEquals(6, myRectangle.area());
	}
	public void perimeterTest() {
		Rectangle myRectangle = new Rectangle(2,3);
		assertEquals(10, myRectangle.perimeter());
	}
	public void compareToTest() {
		Rectangle myRectangle = new Rectangle(2,3);
		Rectangle mySecondRectangle = new Rectangle(7,3);
		assertTrue(myRectangle.compareTo(mySecondRectangle) < 0);
		assertTrue(mySecondRectangle.compareTo(myRectangle) > 0);
		assertTrue(myRectangle.compareTo(myRectangle) == 0);
	}
}
