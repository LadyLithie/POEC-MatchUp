/**
 * 
 */
package fr.yas.matchuptest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Audrey
 *
 */
public class SoftwareApplicationTest {

	/**
	 * @throws java.lang.Exception
	 */
	//Execute at Class level
	//Prepare configuration for the test
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	//Execute at Class level
	//Suppress configuration of the test
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	//At function level
	// Datas to send
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	//At function level
	//delete something
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
