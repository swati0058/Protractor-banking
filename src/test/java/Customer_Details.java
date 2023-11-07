import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Customer_Details {
	
	public static Logger log;
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		log = LogManager.getLogger("Customer_Details");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.way2automation.com/angularjs-protractor/banking/#/login");
		Thread.sleep(800);

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.xpath("//button[text()='Bank Manager Login']")).click();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(500);
		
		
		driver.findElement(By.xpath("//button[normalize-space()='Customers']")).click();
		Thread.sleep(800);
		log.info("user clicked on Customers link.");
		
		//driver.findElement(By.xpath("//input[@placeholder='Search Customer']")).sendKeys("H");
		//Thread.sleep(800);
		
List<WebElement> customer_names=driver.findElements(By.xpath("//table[@class='table table-bordered table-striped']//tbody//tr//td[1]"));
		
		//System.out.println();
		
		for(int i=0;i<customer_names.size();i++) {
			
			String names=customer_names.get(i).getText();
			
			System.out.println("customer_names------------"+names);
			System.out.println(names+"is going to be deleted ");
			//syso(customer_names+"is going to be deleted ");
		

			
				
				//System.out.println(names+"***************************deleting the customer***************** ");
				
		
		}
		//deleting the last customer
		
		driver.findElement(By.xpath("//tbody//tr[1]/td[5]//button[text()='Delete']")).click();
		
		Thread.sleep(3000);
		
		
		//Thread.sleep(500);
		//Delete
		//driver.findElement(By.xpath("//table[@class='table table-bordered table-striped']//tbody//tr//td[5]//button")).click();
		

		driver.quit();
		//button[text()='Delete']
		
	}

}
