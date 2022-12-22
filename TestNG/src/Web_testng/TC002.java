package Web_testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC002 {
	@BeforeClass
	public void login() {
		System.out.println("login completed");
		}
	@AfterClass
	public void logout() {
		System.out.println("logout completed");
			
	}
	@Test
	public void Addemp() {
		System.out.println("added emp");
			
	}
	@Test
	public void delemp() {
		System.out.println("del emp");
			}
	

}
