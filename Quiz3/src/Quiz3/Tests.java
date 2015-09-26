package Quiz3;

//imported things needed for the tests
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class Tests {

	//my tests i created for the area and perimeter tests
	Triangle Test1 = new Triangle(20.0, 20.0, 20.0);
	Triangle Test2 = new Triangle(11.0, 20.0, 30.0);
	Triangle Test3 = new Triangle(3.0, 7.0, 5.0);
	
	//this sets my tests to the area and perimeter since they dont have args
	//this is done before my tests are run b/c of the @Before
	@Before
	public void setUp() throws Exception{
		Test1.getArea();
		Test2.getArea();
		Test3.getArea();
		
		Test1.getPerimeter();
		Test2.getPerimeter();
		Test3.getPerimeter();
	}
	
	//my test for the area method
	@Test
	public void testArea() {
		Test1.getArea();
		assertTrue(Test1.getArea() == 173.2051);
		Test2.getArea();
		assertTrue(Test2.getArea() == 55.8788);
		Test3.getArea();
		assertTrue(Test3.getArea() == 6.4952);
		
	}
	//my tests for the perimeter method
	@Test
	public void testPerimeter(){
		Test1.getPerimeter();
		assertTrue(Test1.getPerimeter() == 60.0);
		Test2.getPerimeter();
		assertTrue(Test2.getPerimeter() == 61.0);
		Test3.getPerimeter();
		assertTrue(Test3.getPerimeter() == 15.0);
	}

}
