package cloud;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class PricingAndSignUp {
	 private WebDriver driver;
	 private String baseUrl;

	
  @BeforeClass
  public void beforeClass() {
	  driver = new FirefoxDriver();
	  baseUrl = "http://qa.www.voxox.com";
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

  }
  
  @Test
  public void C62197() {
	  
	driver.get(baseUrl + "/cloud");
	driver.findElement(By.linkText("Menu")).click();
	driver.findElement(By.linkText("Pricing & Signup")).click();

	String exp1;
	exp1 = driver.getCurrentUrl();
	System.out.println("Expected Result: " +exp1);
  }
  
  @Test
  public void C62198() {

	  driver.get(baseUrl + "/cloud");
      driver.findElement(By.linkText("Menu")).click();
	  driver.findElement(By.linkText("Pricing & Signup")).click();
	  driver.findElement(By.className("btn-dark")).click();

	String exp1;
	exp1 = driver.getCurrentUrl();
	System.out.println("Expected Result: " +exp1);
  }
  
  @Test
  public void C62199() {
	  
	  driver.get(baseUrl + "/cloud");
      driver.findElement(By.linkText("Menu")).click();
	  driver.findElement(By.linkText("Pricing & Signup")).click();
	  driver.findElement(By.xpath("(//a[contains(text(),'Sign Up')])[2]")).click();

	String exp1;
	exp1 = driver.getCurrentUrl();
	System.out.println("Expected Result: " +exp1);
  }
  
  @Test
  public void C62200() {

	  driver.get(baseUrl + "/cloud");
      driver.findElement(By.linkText("Menu")).click();
	  driver.findElement(By.linkText("Pricing & Signup")).click();
	  driver.findElement(By.xpath("(//a[contains(text(),'Sign Up')])[3]")).click();

	String exp1;
	exp1 = driver.getCurrentUrl();
	System.out.println("Expected Result: " +exp1);
  }
  
  
  @Test
  public void C62201() {

	driver.get(baseUrl + "/cloud");
    driver.findElement(By.linkText("Menu")).click();
	driver.findElement(By.linkText("Pricing & Signup")).click();
	driver.findElement(By.className("btn-blank")).click();

	String exp1;
	exp1 = driver.getCurrentUrl();
	System.out.println("Expected Result: " +exp1);
  }
 

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
