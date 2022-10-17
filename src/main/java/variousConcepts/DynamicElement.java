package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicElement {
	
WebDriver driver;
	
	@Before
	public void init () {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.cnn.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void locateElements() throws InterruptedException {
		driver.findElement(By.xpath("//section[@id='homepage1-zone-1']/descendant::h3[1]")).click();
		
		//Thread.sleep(3000);
		
	}
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
