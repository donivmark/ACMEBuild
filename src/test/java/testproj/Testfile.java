package testproj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Testfile {
	
	static ChromeDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("This is a test file");

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");

	}

}
