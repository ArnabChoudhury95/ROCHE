package australia_project;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import log4j.Log4j;


public class Interaction {
	
    static Logger logger=(Logger) LogManager.getLogger(Interaction.class);
	
	@BeforeClass
	  public void beforeClass() {
		
		  WebDriverManager.chromedriver().setup();
	  }
	  @Test
	  public void account() throws InterruptedException {
		
		  ChromeOptions opt=new ChromeOptions();
		  //FirefoxOptions opt=new FirefoxOptions();
		  opt.addArguments("--disable-notifications");
		  WebDriver driver=new ChromeDriver(opt);
		  driver.get("https://test.salesforce.com/?pw=Roche1234&un=aumedrep@apac.com.devint");
		  driver.findElement( By.xpath("//a[contains(text(),'Thomas Cook')]")).click(); 
		  
	  }
}
