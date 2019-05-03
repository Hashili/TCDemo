package Sample.DemoProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyDemoClass {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver  = null;
		// TODO Auto-generated method stub
		System.out.println("****************************************************");
		System.out.println("*********hgjh**This is a DemoCLass****************");
		System.out.println("****************************************************");
		//System.setProperty("webdriver.driver.chrome", ".\\chromedriver1.exe");
		driver  = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://executeautomation.com/demosite/Login.html");
		driver.findElement(By.name("UserName")).sendKeys("SomeUserName");
		driver.findElement(By.name("Password")).sendKeys("SomePassword");
		driver.findElement(By.xpath(("//input[@name='Login']"))).click();
		Thread.sleep(5000);
		driver.quit();

	}

}
