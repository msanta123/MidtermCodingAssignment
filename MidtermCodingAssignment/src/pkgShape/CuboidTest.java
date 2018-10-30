package pkgShape;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.junit.jupiter.api.Test;

import pkgShape.Cuboid.SortByArea;
import pkgShape.Cuboid.SortByVolume;

class CuboidTest {
	@Test
	public void constructorTest() {
		Cuboid myCube = new Cuboid(2,3,4);
		assertEquals(true, myCube instanceof Cuboid);
	}
	@Test
	public void getDepthTest() {
		Cuboid myCube = new Cuboid(2,3,4);
		assertEquals(myCube.getDepth(),4);
	}
	@Test
	public void setDepthTest() {
		Cuboid myCube = new Cuboid(2,3,4);
		myCube.setDepth(8);
		assertEquals(myCube.getDepth(), 8);
	}
	@Test
	public void volumeTest() {
		Cuboid myCube = new Cuboid(2,3,4);
		assertEquals(myCube.volume(),24);
	}
	@Test
	public void areaTest() {
		Cuboid myCube = new Cuboid(2,3,4);
		assertEquals(myCube.area(), 52);
	}
	@Test
	public void perimeterThrowsUnsupportedOperationExceptionTest() {
		try{
			Cuboid myCube = new Cuboid(2,3,4);
			myCube.perimeter();
		}
		catch(UnsupportedOperationException e) {
			
		}
	}
	@Test 
	public void sortByAreaTest() {
		Cuboid myCube = new Cuboid(2,3,4);
		Cuboid myOtherCube = new Cuboid(4,5,6);
		SortByArea mySort = myCube.new SortByArea();
		
		assertTrue(mySort.compare(myCube, myOtherCube) > 0);
		assertTrue(mySort.compare(myOtherCube, myCube) < 0);
		assertTrue(mySort.compare(myCube, myCube) == 0);
	}
	@Test
	public void sortByVolumeTest() {
		Cuboid myCube = new Cuboid(2,3,4);
		Cuboid myOtherCube = new Cuboid(4,5,6);
		SortByVolume mySort = myCube.new SortByVolume();
		
		assertTrue(mySort.compare(myCube, myOtherCube) < 0);
		assertTrue(mySort.compare(myOtherCube, myCube) > 0);
		assertTrue(mySort.compare(myCube, myCube) == 0);
	}
}
