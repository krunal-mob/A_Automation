package basicSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WebTableConcepts_14{


	@Test
	public void testMethodSWT() {

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
		driver.get("http://makeseleniumeasy.com/2017/07/14/how-to-handle-a-web-table-in-selenium-webdriver/#comments");

		WebElement closeButton = driver.findElement(By.xpath("//a[@id='fancybox_ns-close']"));

		WebDriverWait wait = new WebDriverWait(driver, 5);


		wait.until(ExpectedConditions.visibilityOf(closeButton));



		closeButton.click();



		//1. Print all headers of web table:
		WebElement table = driver.findElement(By.xpath("(//table[@name='BookTable'])"));

		List<WebElement> rows = table.findElements(By.tagName("tr"));

		int rowCount = rows.size();

		//Prints the number of rows in that table 
		System.out.println("The total number of rows in BookTable is: " + rowCount);

		//Print the number of rows containing the actual data.
		System.out.println("The number of rows in BookTable is with actual Data: " + (rowCount-1));


		for(WebElement r : rows) {


			List<WebElement> header = r.findElements(By.tagName("th"));	


			for(WebElement h : header ) {


				System.out.print(h.getText() + "||");
			}
		}


		// 2. Find number of columns for each row:
		//We need to iterate inside the rows to get to the column, so we have to take again a rows_1 variable.
		List<WebElement> rows_1 = table.findElements(By.tagName("tr"));

		for(WebElement r : rows_1) {

			List<WebElement> columns = r.findElements(By.tagName("td"));
			int columnCount = columns.size();


		}


		System.out.println("");

		// 3. Retrieve name of book whose author is Mukesh:
		//List is taken because there can be more that once element , otherwise if 
		//WebElement is taken then the first element is returned.
		List<WebElement> bookName = driver.findElements(By.xpath("//table[@name='BookTable']//td[contains(text(),'Animesh')]/preceding-sibling::td"));


		for (WebElement bN :bookName ) {


			System.out.println( "The name of the book(s) whose Author is Animesh: " + bN.getText());
		}


		//4. Print all the column values of the last row of table:
		//We can not use a static row number because rows in table will depend on 
		//number of sales. In this case we will use last() method of xpath as shown below:

		System.out.println("Printing the last row of the Table");

		List<WebElement> lastRow =  driver.findElements(By.xpath("//table[@name='BookTable']//tr[last()]"));

		for (WebElement lR : lastRow) {

			List<WebElement> column = lR.findElements(By.tagName("td"));

			for(WebElement c : column) {

				System.out.print(c.getText()+ "||");
			}
		}


		System.out.println("");

		//5. Print total cost of all books listed in table:

		List<WebElement> priceCol = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/td[4]"));

		int totalPrice = 0;
		for(WebElement pC : priceCol) {

			//System.out.println(pC.getText());

			totalPrice = totalPrice + Integer.parseInt(pC.getText());

		}

		System.out.println("The total price is : " + totalPrice);


		//6. Retrieving cell value of specific column of specific row
		//We can locate a particular cell based on row and column number 
		// driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[2]/td[3]"));

	}		

	//7. Print all the data of the table 





}







