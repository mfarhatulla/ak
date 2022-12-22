package Web_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WD_TestNG {
	WebDriver driver;
	@BeforeClass
	public void startUp() throws Exception{
		System.setProperty("webdriver.chrome.driver", "D:\\farhat@ash..f\\chromedriver_win32"
				+ "\\chromedriver.exe");
	}
		 @AfterClass
		 		 public void tearDown() {
			 driver.close();
			 		 
		 }
		 @Test
		 public void tc001() throws Exception {
			driver.navigate().to("http://183.82.103.245/nareshit/login.php");
			System.out.println("Application opened");// console
			System.out.println("Application Opened");//html  report
			driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
			driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
			driver.findElement(By.name("Submit")).click();
			Thread.sleep(3000);
			Reporter.log("Login Completed");
			driver.findElement(By.linkText("Logout")).click();
			Reporter.log("logout completed");
			
		 }
		 
		
	}


