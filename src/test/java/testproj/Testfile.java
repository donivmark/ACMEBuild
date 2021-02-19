package testproj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testfile {
	
	static ChromeDriver driver;

	@Test
	public void testone() throws Exception  {
		// TODO Auto-generated method stub
		
		System.out.println("This is a test file");

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");

	}

}
