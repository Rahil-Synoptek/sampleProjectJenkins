package Tester;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tester {
	static WebDriver driver;

	@Test
	public static void main_test() throws InterruptedException {
		System.out.println("Test Started!!!");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--no-sandbox");
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
        driver.get("https://www.google.co.in/");
        System.out.println("Open the URL!!!");
        
        driver.manage().window().maximize();  
        System.out.println("Maximize the browser!!!");
 
        driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("selenium");      
        //getElement("//textarea[@title='Search']").sendKeys("selenium");
        System.out.println("Send value in Searchbox");
        
        driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();   
        //getElement("//input[@value='Google Search']").click();
        System.out.println("Click Search button.");
        
        Thread.sleep(5000);
        System.out.println("Wait 5 seconds...");

        driver.quit();
        
        
        
        
		//System.setProperty("webdriver.http.factory", "jdk-http-client");
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--no-sandbox");
		//options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
        driver.get("https://www.google.co.in/");
        
        Thread.sleep(10000);
        
        driver.quit();
        System.out.println("Quit the browser!!!");

	}
	
//	public static WebElement getElement(String locator){
//		WebElement element=null;
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); 
//		element = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator))); 
//		return element;
//	}

}
