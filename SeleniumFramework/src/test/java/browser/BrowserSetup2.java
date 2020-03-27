package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserSetup2 {
	 public static void main(String args[])throws Exception{
		   
		 /* WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://test.salesforce.com/?pw=Roche1234&un=aumedrep@apac.com.devint");*/
		 
		   WebDriverManager.firefoxdriver().setup();
		   WebDriver driver=new FirefoxDriver();
		   driver.get("https://test.salesforce.com/?pw=Roche1234&un=aumedrep@apac.com.devint");
		   
		  /* WebDriverManager.iedriver().setup();
		   WebDriver driver=new InternetExplorerDriver();*/
		   
		   
		 //  driver.close();
		 //  driver.quit();
	 }
}
