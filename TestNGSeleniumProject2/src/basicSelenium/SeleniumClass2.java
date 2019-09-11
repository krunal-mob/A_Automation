package basicSelenium;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SeleniumClass2 { //xPath



	@Test
	public void test2() throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "/Users/asarkar/Desktop/TechBodhi/chromedriver 2");

		ChromeDriver cd = new ChromeDriver();

		cd.get("http://newtours.demoaut.com/");

		cd.manage().window().maximize();


		//Text Box
		cd.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");

		cd.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");

		//Button

		cd.findElement(By.name("login")).click();

		Thread.sleep(3000);

		//Relative xPath --> //tagName[@Attribute='value'][Attribute='value']

		//Radio button  

		cd.findElement(By.xpath("//input[@value='oneway']")).click();

		//Absolute xPath : /html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[1]

		// If changes happen in the page , the script will fail

		//Dropdown

		WebElement wb =  cd.findElement(By.xpath("//select[@name='passCount']"));

		Select sel = new Select(wb);

		sel.selectByIndex(2);

		Thread.sleep(2000);

		sel.selectByValue("2");

		Thread.sleep(2000);

		sel.selectByVisibleText("4");


		//Write code to handle Other dropdowns


		//Click on Continue button

		cd.findElement(By.xpath("//input[@name='findFlights']")).click();


		//WebTable -> table tag -> tbody  ->tr -> td


		WebElement table = cd.findElement(By.xpath("//table[@cellspacing='1'][1]/tbody"));

		List<WebElement> rows =  table.findElements(By.tagName("tr"));

		for (WebElement r : rows) {

			List<WebElement> col = r.findElements(By.tagName("td"));

			for (WebElement c : col) {

				System.out.println(c.getText());
			}

		} 


 
		//Click on continue button

		cd.findElement(By.xpath("//input[@name='reserveFlights']")).click();

		//Country Dropdown

		WebElement country = cd.findElement(By.xpath("//select[@ name='delCountry']"));

		Select S = new Select(country);

		S.selectByIndex(10);



		// Alert

		Alert A = cd.switchTo().alert();

		System.out.println(A.getText());

		A.accept(); 


		//CheckBox
		// We are getting two matches for xpath --> This differentiates 
		WebElement chkbx = cd.findElement(By.xpath("(//input[@name='ticketLess'])[1]"));

		System.out.println(chkbx.isSelected());


		chkbx.click();


		System.out.println(chkbx.isSelected());


		cd.findElement(By.xpath("//input[@name='buyFlights']")).click();

		//

		System.out.println(cd.findElement(By.xpath("//font[@size='+1']")).getText()); 



		//Image

		WebElement img = cd.findElement(By.xpath("//img[@alt='Mercury Tours']"));

		System.out.println(img.getAttribute("height"));
		System.out.println(img.getAttribute("width"));

	}	




}
