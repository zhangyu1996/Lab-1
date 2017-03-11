package test.cn.tju;

import static org.junit.Assert.*;

import org.junit.Test;

import test.cn.*;

public class TriangleTest {
   
	@Test
	public void testTriangle() {
		 Triangle t = new Triangle();
		assertEquals("non-triangle", t.junit(1,2,3));
		assertEquals("equilateral", t.junit(2,2,2));
		assertEquals("isosceles", t.junit(2,2,3));
		assertEquals("scalene", t.junit(4,2,3));
	}

}
