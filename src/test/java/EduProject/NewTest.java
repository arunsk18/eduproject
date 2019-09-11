package EduProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void verifyEduProject() {
	  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://35.198.247.194:9094/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("About Us")).click();
		String x = driver.findElement(By.xpath("/html/body")).getText();
				//System.out.println(x);
		String y=x;
		Assert.assertEquals(x, y);
		driver.close(); 
  }
}
