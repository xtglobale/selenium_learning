package testng;

import org.testng.annotations.Test;

public class Grp_in_testcase {
 
	@Test(groups= {"regression_testing","smoke_testing"})
	  public void testcase1() {
		  
		  System.out.println("testcase 1");
	  }
	 @Test(groups= {"sanity_testing","smoke_testing"})
	  public void testcase2() {
		  
		  System.out.println("testcase 2");
	  }
	  @Test(groups= {"sanity_testing","funtional_testing"})
	  public void testcase3() {
		  
		  System.out.println("testcase 3");
	  }
}
