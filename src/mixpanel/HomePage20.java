package mixpanel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class HomePage20 {
	 private WebDriver driver;
	 
	private String baseUrl;
	

  @BeforeClass
  public void beforeClass() {
	  driver = new FirefoxDriver();
	    baseUrl = "http://www.cloudphone.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  
  


  
  @Test
  public void C62191c() {
	     String text2;
		driver.get(baseUrl);
		driver.findElement(By.cssSelector(".home-hero-one")).click();
		
		
		text2 = driver.findElement(By.cssSelector(".home-hero-one")).getText();
		System.out.println("Expected Result : " +text2);
  }
  
 

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
