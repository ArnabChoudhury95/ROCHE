package australia_project;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class Account {
	
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
	  Thread.sleep(20000);
	  WebElement accountProflie= driver.findElement( By.xpath("//span[contains(text(),'Accounts')]"));
      accountProflie.click();	 
	  
  }

}