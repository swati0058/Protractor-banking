import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.way2automation.com/angularjs-protractor/banking/#/login");
		Thread.sleep(500);

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.xpath("//button[text()='Bank Manager Login']")).click();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(400);

		

		driver.findElement(By.xpath("//button[normalize-space()='Open Account']")).click();
		
//	driver.findElement(By.id("userSelect")).click();
		Thread.sleep(900);

		Select select1 = new Select(driver.findElement(By.name("userSelect")));
		select1.selectByIndex(1);
		
	//	select.selectByVisibleText("");
		
		Thread.sleep(600);

		Select select2 = new Select(driver.findElement(By.name("currency")));
		select2.selectByIndex(1);
		
		
		driver.findElement(By.xpath("//button[normalize-space()='Process']")).click();
		

		Alert alert_account = driver.switchTo().alert();
		;
		String alertMessage2 = driver.switchTo().alert().getText();
		System.out.println("alertMessage2------------------"+alertMessage2);
		Thread.sleep(800);
		alert_account.accept();
		
		String message="Account created successfully with account Number";
		
		if(alertMessage2.contains(message))
			System.out.println("*********************Account opened successfully ********************************");
		
		
		else {
			
			System.out.println("*******account not created*******************");
		}
		Thread.sleep(1000);
		driver.quit();

	}

}
