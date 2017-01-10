package pack1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class DriverTest {
	@BeforeClass
	public static void testSetup(){
	System.out.println("Starting...");

	}

	@AfterClass
	public static void testCleanup(){

	System.out.println("Done!");

	}
	@Test
	public void testDrv() {
		Driver tester = new Driver();
String a="com.mysql.jdbc.JDBC4Connection@104a311";
		assertEquals("Result", a, tester.Drv());
		fail("Not yet implemented");
	}

}
