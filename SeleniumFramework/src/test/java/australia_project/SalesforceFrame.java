package australia_project;

import java.util.Set;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesforceFrame {
	  @BeforeClass
	  public void beforeClass() {
		  WebDriverManager.chromedriver().setup();
	  }
	  @Test
	  public void account() throws InterruptedException {

		  ChromeOptions opt=new ChromeOptions();
		  opt.addArguments("--disable-notifications");
		  WebDriver driver=new ChromeDriver(opt);
		  driver.get("https://test.salesforce.com/?pw=Roche1234&un=aumedrep@apac.com.devint");
		  String windowName=driver.getTitle();
		  System.out.println(windowName);
		  Set<String> windowIterator = driver.getWindowHandles();
		  System.out.println("No of windows :  " + windowIterator.size());
		  for (String s : windowIterator) {
			              String windowHandle = s;
			              WebDriver popup = driver.switchTo().window(windowHandle);
			              System.out.println("Window Title : " + popup.getTitle());
			              System.out.println("Window Url : " + popup.getCurrentUrl());
			              if (popup.getTitle().contains(windowName)) { 
			                  System.out.println("Selected Window Title : " + popup.getTitle());
			                  driver = popup;
			                  break;
		       }
	        }
		//driver.close();  
		//driver.quit();
		  
	  }

	
}
