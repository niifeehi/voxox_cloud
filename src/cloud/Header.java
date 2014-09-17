package cloud;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Header {
	 private WebDriver driver;
	 private String baseUrl;

  @BeforeClass
  public void beforeClass() {
	  driver = new FirefoxDriver();
	    baseUrl = "http://qa.www.voxox.com";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  
  @Test
  public void C62165() {
    driver.get(baseUrl + "/cloud");
   
    driver.findElement(By.cssSelector("img[alt=\"Voxox\"]")).click();
   
	String exp1;
	String exp1a;
	exp1a = driver.findElement(By.xpath("//*[@id='reset-one']/h5")).getText();
	
	exp1 = driver.getCurrentUrl();
	System.out.println("Expected Result: " +exp1a);
	System.out.println("Expected Result: " +exp1);
  }
  
  
  @Test
  public void C62166() {
    driver.get(baseUrl + "/cloud");
    driver.findElement(By.linkText("Menu")).click();
    driver.findElement(By.linkText("Home")).click();
   
	String exp2;
	String exp2a;
	exp2a = driver.findElement(By.xpath("//*[@id='reset-one']/h5")).getText();
	exp2 = driver.getCurrentUrl();
    driver.findElement(By.linkText("Menu")).click();
	System.out.println("Expected Result: " + exp2);
	System.out.println("Expected Result: " +exp2a);
  }
  
  @Test
  public void C62167() {
    driver.get(baseUrl + "/cloud");
    driver.findElement(By.linkText("Menu")).click();
    driver.findElement(By.linkText("Features")).click();
 
	String exp3;
	String exp2a;
	exp2a = driver.findElement(By.xpath("//*[@id='reset-one']/h5")).getText();
	exp3 = driver.getCurrentUrl();
	System.out.println("Expected Result: " + exp3);
	System.out.println("Expected Result: " + exp2a);
  }
  
  @Test
  public void C62168() {
    driver.get(baseUrl + "/cloud");
    driver.findElement(By.linkText("Menu")).click();
    driver.findElement(By.linkText("Pricing & Signup")).click();
    driver.findElement(By.linkText("Get a 30 Day Free Trial")).click();
    
	String exp4;

	exp4 = driver.getCurrentUrl();
	System.out.println("Expected Result: " + exp4);

  }
  

  @Test
  public void C62170() {
    driver.get(baseUrl + "/cloud");
    driver.findElement(By.linkText("Menu")).click();
    driver.findElement(By.linkText("Sign in")).click();
 
	String exp6;
	String exp6a;
	
	exp6a = driver.findElement(By.xpath("//*[@id='Form-Login']/h2")).getText();
	exp6 = driver.getCurrentUrl();
	
	System.out.println("Expected Result: " + exp6);
	System.out.println("Expected Result: " + exp6a);
  }
  
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
