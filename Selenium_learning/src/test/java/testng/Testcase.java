package testng;

import org.testng.annotations.Test;

public class Testcase {

	@Test(priority=2)
	  public void testcase1() {
		  
		  System.out.println("testcase 1");
	  }
	 @Test(priority=3)
	  public void testcase2() {
		  
		  System.out.println("testcase 2");
	  }
	  @Test(priority=1)
	  public void testcase3() {
		  
		  System.out.println("testcase 3");
	  }


}
