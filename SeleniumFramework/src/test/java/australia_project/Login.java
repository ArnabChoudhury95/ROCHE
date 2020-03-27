package australia_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	 @BeforeClass
	  public void beforeClass() {
		  WebDriverManager.chromedriver().setup();
	  }
	  @Test
	  public void login() {
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://test.salesforce.com/");
		  driver.findElement(By.id("username")).sendKeys("aumedrep@apac.com.devint");
		  driver.findElement(By.id("password")).sendKeys("Roche1234");
		  driver.findElement(By.id("Login")).click();
		  
	  }
}
