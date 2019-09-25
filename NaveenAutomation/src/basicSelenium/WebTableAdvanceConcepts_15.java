package basicSelenium;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hwpf.model.types.LSTFAbstractType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WebTableAdvanceConcepts_15 {

	//To find the maximum  form A WEBTABLE and other combinations like > < != etc


	//Refer--> https://stackoverflow.com/questions/43737364/how-to-find-maximum-value-in-a-web-table-column-using-selenium
	@Test
	public void testMethodWT() {

		System.setProperty("webdriver.chrome.driver", "/Users/asarkar/Desktop/TechBodhi/Drivers/chromedriver 2");

		// Instantiate the Chrome Browser by taking WebDriver reference and ChromeDriver Object
		WebDriver driver = new ChromeDriver();

		//Delete All Cookies
		driver.manage().deleteAllCookies();

		//Maximize the Window
		driver.manage().window().maximize();

		//Put PageloadTimeout -->To wait for the page to load properly
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		//Put Implicit timeout for all the elements of the script 
		driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);


		//Open any Url (Two Ways)
		driver.get("htt p://makeseleniumeasy.com/2017/07/14/how-to-handle-a-web-table-in-selenium-webdriver/#comments");

		WebElement closeButton = driver.findElement(By.xpath("//a[@id='fancybox_ns-close']"));

		WebDriverWait wait = new WebDriverWait(driver, 5);


		wait.until(ExpectedConditions.visibilityOf(closeButton));



		closeButton.click();


		// 1.TO DISPLAY THE BOOK NAME WITH THE HIGHEST PRICE

		WebElement table = driver.findElement(By.xpath("(//table[@name='BookTable'])"));


		List<WebElement> rows = table.findElements(By.tagName("tr"));

		int maxValue=0;
		String BookName="";
		for(int i=2;i<=rows.size();i++) {

			WebElement price=driver.findElement(By.xpath("(//table[@name='BookTable'])//tr["+i+"]//td[4]"));
			WebElement Book=driver.findElement(By.xpath("(//table[@name='BookTable'])//tr["+i+"]//td[1]"));

			
			
			
			if(Integer.parseInt(price.getText()) > 1000){

			
			maxValue=Integer.parseInt(price.getText());
				
			BookName=Book.getText();
			
			System.out.println("book:"+BookName);
			System.out.println("price: "+maxValue);
		}

		}
		
		
		//System.out.println("price: "+maxValue);
		//System.out.println("book:"+BookName);


	}
}
//Minimum , other conditions





