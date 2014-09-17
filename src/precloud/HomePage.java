package precloud;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class HomePage {
	 private WebDriver driver;
	 
	private String baseUrl;

  @BeforeClass
  public void beforeClass() {
	  driver = new FirefoxDriver();
	    baseUrl = "http://pre.www.cloudphone.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  
  
  @Test
  public void C62191() {
	  
	driver.get(baseUrl);
	driver.findElement(By.linkText("Menu")).click();
	driver.findElement(By.linkText("Home")).click();

	String exp1;
	
	exp1 = driver.getCurrentUrl();
	System.out.println("Expected Result: " +exp1);
  }
  
  @Test
  public void C62192() {

    driver.get(baseUrl);
 
    driver.findElement(By.linkText("Test It Out!")).click();
   
	String exp1;
	exp1 = driver.getCurrentUrl();
	System.out.println("Expected Result: " +exp1);
  }
  
  @Test
  public void C62193() {

    driver.get(baseUrl);
    driver.findElement(By.linkText("Choose a Plan Best For You.")).click();
   
	String exp1;
	
	exp1 = driver.getCurrentUrl();
	System.out.println("Expected Result: " +exp1);
  }
  
  @Test
  public void C62194() {

    driver.get(baseUrl);
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
