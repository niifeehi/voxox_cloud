package qacloud;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Footer {
	 private WebDriver driver;
	
	private String baseUrl;

  @BeforeClass
  public void beforeClass() {
	  driver = new FirefoxDriver();
	    baseUrl = "http://qa.www.cloudphone.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  

  @Test
  public void C62172() {
  
    driver.get(baseUrl);
    driver.findElement(By.cssSelector("div.footer-logo > a.logo > img[alt=\"Voxox\"]")).click();
  
   
	String exp1;
	String exp1a;
	exp1a = driver.findElement(By.cssSelector("div.footer-logo > a.logo > img[alt=\"Voxox\"]")).getText();
	
	exp1 = driver.getCurrentUrl();
	System.out.println("Expected Result: " +exp1a);
	System.out.println("Expected Result: " +exp1);
	
  }
  
  @Test
  public void C62173() {
	  
	
	driver.get(baseUrl);
	driver.findElement(By.linkText("Support")).click();
   
	String exp1;
	exp1 = driver.getCurrentUrl();
	System.out.println("Expected Result: " +exp1);
  }
  
  @Test
  public void C62174() {

    driver.get(baseUrl);
    driver.findElement(By.linkText("Terms Of Use")).click();
   
	String exp1;
	
	exp1 = driver.getCurrentUrl();
	System.out.println("Expected Result: " +exp1);
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
