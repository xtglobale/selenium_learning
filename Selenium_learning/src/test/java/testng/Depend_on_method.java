package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Depend_on_method {
	@Test(description="login")
	  public void testcase1() {
		  
		  System.out.println("testcase 1");
	  }
	 @Test(dependsOnMethods="testcase1",description="search")
	  public void testcase2() {
		  
		 Assert.assertEquals("abc", "xyz");
		  System.out.println("testcase 2");
		  
	  }
	  @Test(dependsOnMethods="testcase2",description="submit")
	  public void testcase3() {
		  
		  System.out.println("testcase 3");
	  }
}
