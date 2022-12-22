package Web_testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC004 {
	@BeforeMethod
	public void login() {
		System.out.println("Login completed");
			}
	@AfterMethod
	public void logout() {
		System.out.println("logout completed");
			}
	@Test
	public void add_emp() {
		System.out.println("added new emp");		
	}
	@Test
	public void del_emp() {
		System.out.println("delete Emp");
		
	}

}
