package browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSetup1 {
	 public static void main(String args[]) {
		   String projectPath=System.getProperty("user.dir");
		   System.out.println("project Path:"+projectPath);
		  
		   
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\arnab.choudhury\\eclipse-workspace\\SeleniumFramework\\drivers\\chromedriver\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("http://google.com");
		   
		   /*System.setProperty("webdriver.ie.driver","C:\\Users\\arnab.choudhury\\eclipse-workspace\\SeleniumFramework\\drivers\\IEdriver\\IEDriverServer.exe");
		   WebDriver driver=new InternetExplorerDriver(); 
		   driver.get("https://test.salesforce.com/?pw=Roche1234&un=aumedrep@apac.com.devint");*/ 
		   
		   /* System.setProperty("webdriver.gecko.driver","C:\\Users\\arnab.choudhury\\eclipse-workspace\\SeleniumFramework\\drivers\\geckodriver\\geckodriver.exe");
		   WebDriver driver=new FirefoxDriver();*/
		   
		   List<WebElement> links=driver.findElements(By.tagName("a"));
		   for(WebElement ele:links) {
			   System.out.println(ele.getAttribute("href"));
		   }
		   // driver.close();
		   //driver.quit();
		   }
}
