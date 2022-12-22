package Web_testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC003 {
    @BeforeClass
    public void login() {
    	System.out.println("login completed");
    	    }
    @AfterClass
    public void logout() {
    	System.out.println("logout completed");
    	    }
    @Test(priority =2)
    public void addemp() {
    	System.out.println("added new emp");
    	    }
    @Test(priority =1)
    public void deleteemp() {
    	System.out.println("delete emp");
    	
    }
}
