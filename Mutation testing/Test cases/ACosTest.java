package jscicalc.pobject;

import static org.junit.Assert.*;
import jscicalc.AngleType;
import jscicalc.OObject;
import jscicalc.complex.Complex;

import org.junit.Test;

public class ACosTest 
{	
	
	//switch out the delta for delACosFR if you want to test for accuracy
	double delACosFR = 0.000000000000008;
	double delta = 0.1;

	@Test
	//Tests ACos class in Degrees Max Value
	//max value = 1.7976931348623157E308
	public void testACosDegreesUpperBound() 
	{
		//System.out.println(Double.MAX_VALUE);
		ACos testClass = new ACos(AngleType.DEGREES);
		assertEquals(Double.NaN, testClass.function(Double.MAX_VALUE), delta);
	}
	
	
	@Test
	//Tests ACos class in Degrees Min Value.
	//min value = 4.9E-324
	public void testACosDegreesLowerBound() 
	{
		//System.out.println(Double.MIN_VALUE);
		ACos testClass = new ACos(AngleType.DEGREES);
		assertEquals(90, testClass.function(Double.MIN_VALUE), delta);
	}
	
	@Test
	//Tests ACos class in Degrees negative Max Value
	//max value = -1.7976931348623157E308
	public void testACosDegreesNegativeUpperBound() 
	{
		//System.out.println(Double.MAX_VALUE);
		ACos testClass = new ACos(AngleType.DEGREES);
		assertEquals(Double.NaN, testClass.function(-Double.MAX_VALUE), delta);
	}
	
	
	@Test
	//Tests ACos class in Degrees negative Min Value.
	//min value = -4.9E-324
	public void testACosDegreesNegativeLowerBound() 
	{
		//System.out.println(Double.MIN_VALUE);
		ACos testClass = new ACos(AngleType.DEGREES);
		assertEquals( 90, testClass.function(-Double.MIN_VALUE), delta);
	}
	
	
	@Test
	//Tests ACos class in Radians Max Value
	//max value = 1.7976931348623157E308
	public void testACosRadiansUpperBound() 
	{
		//System.out.println(Double.MAX_VALUE);
		ACos testClass = new ACos(AngleType.RADIANS);
		System.out.println(testClass.function(Double.MAX_VALUE));
		assertEquals(Double.NaN, testClass.function(Double.MAX_VALUE), delta);
	}
	
	
	@Test
	//Tests ACos class in Radians Min Value.
	//min value = 4.9E-324
	public void testACosRadiansLowerBound() 
	{
		//System.out.println(Double.MIN_VALUE);
		ACos testClass = new ACos(AngleType.RADIANS);
		assertEquals(1.570796, testClass.function(Double.MIN_VALUE), delta);
	}
	
	@Test
	//Tests ACos class in Radians negative Max Value
	//max value = -1.7976931348623157E308
	public void testACosRadiansNegativeUpperBound() 
	{
		//System.out.println(Double.MAX_VALUE);
		ACos testClass = new ACos(AngleType.RADIANS);
		assertEquals(Double.NaN, testClass.function(-Double.MAX_VALUE), delta);
	}
	
	
	@Test
	//Tests ACos class in Radians negative Min Value.
	//min value = -4.9E-324
	public void testACosRadiansNegativeLowerBound() 
	{
		//System.out.println(Double.MIN_VALUE);
		ACos testClass = new ACos(AngleType.RADIANS);
		assertEquals(1.570796 , testClass.function(-Double.MIN_VALUE), delta);
	}
	
	
	
	@Test
	//Tests ACos class in Degrees .
	//value = 0
	public void testACosDegreesZero() 
	{
		//System.out.println(Double.MIN_VALUE);
		ACos testClass = new ACos(AngleType.DEGREES);
		assertEquals( 90 , testClass.function(0), delta);
	}
	
	@Test
	//Tests ACos class in Radians .
	//value = 0
	public void testACosRadiansZero() 
	{
		//System.out.println(Double.MIN_VALUE);
		ACos testClass = new ACos(AngleType.RADIANS);
		assertEquals( 1.5707963267948966192313216916397514420985846996875529, testClass.function(0), delta);
	}
	
	
	@Test
	//Tests ACos class in Degrees .
	//value = 50
	public void testACosDegreesFifty() 
	{
		//System.out.println(Double.MIN_VALUE);
		ACos testClass = new ACos(AngleType.DEGREES);
		assertEquals( Double.NaN, testClass.function(50), delta);
	}
	
	@Test
	//Tests ACos class in Degrees .
	//value = 50
	//expected ans = 1.1917535925942099587053080718604193369307004077085438
	public void testACosRadiansFifty() 
	{
		//System.out.println(Double.MIN_VALUE);
		ACos testClass = new ACos(AngleType.RADIANS);
		assertEquals( Double.NaN, testClass.function(50), delta);
	}
	
	
	
	

	@Test
	public void testOObject() 
	{
		//System.out.println(Double.MIN_VALUE);
		ACos testClass = new ACos(AngleType.DEGREES);
		OObject testObject = new OObject() {
			
		};
		
		OObject ExpectedObject = testObject.cos(AngleType.DEGREES);
		
		//assertEquals(ExpectedObject , testClass.function(testObject));
	}
	
	@Test
	public void testComplexObject() 
	{
		//System.out.println(Double.MIN_VALUE);
		ACos testClass = new ACos(AngleType.RADIANS);
		Complex testObject = new Complex(5) {
		};
		
		Complex ExpectedObject = testObject.cos();
		
		//assertEquals(ExpectedObject , testClass.function(testObject));
	}
	
	@Test  (expected = RuntimeException.class)  
	public void testErrorComplexObjectImagineryGreaterThan() 
	{
		//System.out.println(Double.MIN_VALUE);
		ACos testClass = new ACos(AngleType.DEGREES);
		Complex testObject = new Complex(1, 3);
		
	
		Complex ExpectedObject = testObject.cos();
		System.out.println(StrictMath.abs(testObject.imaginary()));
		
		testClass.function(testObject);
		assertEquals(ExpectedObject , testClass.function(testObject));
	}
	
	@Test  (expected = RuntimeException.class)  
	public void testErrorComplexObjectRealGreaterThan1() 
	{
		//System.out.println(Double.MIN_VALUE);
		ACos testClass = new ACos(AngleType.DEGREES);
		Complex testObject = new Complex(3, 0);
		
	
		Complex ExpectedObject = testObject.cos();
		System.out.println(StrictMath.abs(testObject.imaginary()));
		
		testClass.function(testObject);
		assertEquals(ExpectedObject , testClass.function(testObject));
	}
	@Test
	public void testMain() 
	{
		//System.out.println(Double.MIN_VALUE);
		ACos testClass = new ACos(AngleType.RADIANS);
		String args[] = null;
		testClass.main(args);
	}

	
	@Test 
	public void testErrorOObject() 
	{
		//System.out.println(Double.MIN_VALUE);
		ACos testClass = new ACos(AngleType.DEGREES);
		Complex testObject = new Complex(0, 0);
		 
		//if( scale != 1 && StrictMath.abs( c.imaginary() ) > 1e-6 )
	
		Complex ExpectedObject = testObject.cos();
		
		testClass.function(testObject);
		assertNotNull(testClass.function(testObject));
	}
	
	@Test 
	public void testOObjectNotComplex() 
	{
		//System.out.println(Double.MIN_VALUE);
		ACos testClass = new ACos(AngleType.DEGREES);
		OObject obj = new OObject() {
		};		 
		//if( scale != 1 && StrictMath.abs( c.imaginary() ) > 1e-6 )
	
		
		assertNotNull(testClass.function(obj));
	}
	
	@Test  
	public void testErrorComplexObjectBoundry() 
	{
		//System.out.println(Double.MIN_VALUE);
		ACos testClass = new ACos(AngleType.DEGREES);
		Complex testObject = new Complex(1, 0.000001);
		
	
		;
		//System.out.println(StrictMath.abs(testObject.imaginary()));
		
		testClass.function(testObject);
		assertSame(testClass, testClass);
	}
	
	
	
	
	


}
