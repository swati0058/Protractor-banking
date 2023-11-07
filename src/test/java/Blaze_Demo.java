import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Blaze_Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.demoblaze.com/index.html");
		driver.findElement(By.id("signin2")).click();
		Thread.sleep(800);
		driver.findElement(By.id("sign-username")).sendKeys("jackson6");
		driver.findElement(By.id("sign-password")).sendKeys("jackson6");
		driver.findElement(By.xpath("//button[text()='Sign up']")).click();

Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		String alertMessage= driver.switchTo().alert().getText();
		//String alertext=alert.getText();
		System.out.println("alertMessage---------------"+alertMessage);
		
		alert.accept();
		
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		// Login functionality 
		
		driver.findElement(By.id("login2")).click();
		Thread.sleep(100);
		String loginame="jackson6";
		String  loginpassword="jackson6";
		driver.findElement(By.id("loginusername")).sendKeys(loginame);
		
		driver.findElement(By.id("loginpassword")).sendKeys(loginpassword);
		Thread.sleep(100);
		
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		
		Thread.sleep(6000);
		
	String username=	driver.findElement(By.id("nameofuser")).getText();
	System.out.println(username);
	
	
	if(loginame.equals(username));
	System.out.println("login successful with user "+username);
		

		
		//button[text()='Log in']
		
		
		
		//Sign up successful.
		
		
	}

}
