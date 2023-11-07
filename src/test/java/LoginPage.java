import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

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

		driver.findElement(By.xpath("//button[@class='btn btn-lg tab'][1]")).click();

		Thread.sleep(500);

		// driver.findElement(By.xpath("//button[normalize-space()='Add
		// Customer']")).click();
		// button[normalize-space()='Add Customer']

		//
		// driver.findElement(By.xpath("//button[normalize-space()='Open
		// Account'")).click();

//button[normalize-space()='Open Account']

		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("John");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("hudson");

		driver.findElement(By.xpath("//input[@placeholder='Post Code']")).sendKeys("1265");

		driver.findElement(By.xpath("//button[text()='Add Customer']")).click();

		Alert alert = driver.switchTo().alert();
		;
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println("alertMessage----------"+alertMessage);
		Thread.sleep(500);
		alert.accept();
		
		

// To check customers in dropdown 

		Thread.sleep(500);

		driver.findElement(By.xpath("//button[normalize-space()='Open Account']")).click();
		
//	driver.findElement(By.id("userSelect")).click();
		Thread.sleep(500);

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
		alert.accept();
		
		
		// Customers in table
		
		//Customers
		
		
		
		
		
		
		
		//table[@class='table table-bordered table-striped']//tbody//tr[1]//td[1]
		
		
		//input[@placeholder='Search Customer']
		//table table-bordered table-striped
		
	//String customer_name=	driver.findElement(By.xpath("//table[@class='table table-bordered table-striped']//tbody//tr//td[1]")).getText();
	//System.out.println("customer_name---------------------"+customer_name);
		
		
		Thread.sleep(800);
		driver.quit();
	}

}

