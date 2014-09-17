package precloud;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Features {
	 private WebDriver driver;
	private String baseUrl;


  @BeforeClass
  public void beforeClass() {
	  driver = new FirefoxDriver();
	  baseUrl = "http://pre.www.cloudphone.com/";  
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void C62195() {

   driver.get(baseUrl);
    driver.findElement(By.linkText("Menu")).click();
    driver.findElement(By.linkText("Features")).click();

	String exp1;
	exp1 = driver.getCurrentUrl();
	System.out.println("Expected Result: " +exp1);
  }
  
  @Test
  public void C62196() {

    driver.get(baseUrl);
    driver.findElement(By.linkText("Menu")).click();
    driver.findElement(By.linkText("Features")).click();
    driver.findElement(By.className("btn-dark")).click();
    
	String exp1;
	exp1 = driver.getCurrentUrl();
	System.out.println("Expected Result: " +exp1);
  }
  
  
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
