package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import controller.VerifyController;
import view.*;

public class FrameTest
{

	private VerifyFrame testFrame;
	@Before
	public void setUp() throws Exception
	{
		testFrame = new VerifyFrame(new VerifyController());
	}

	@After
	public void tearDown() throws Exception
	{
		testFrame = null;
	}

	@Test
	public void testFrameRequirements()
	{
		assertNotNull("Data member not initialized", testFrame.getBaseController());
		assertTrue("Data member is of incorrect type", testFrame.getBaseController() instanceof VerifyController);
		assertNotNull("Data member not initialized", testFrame.getContentPane());
	}

}
