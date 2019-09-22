package basicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptExecutorConcept_12 {

	@Test
	public void testMethodJSE() {



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
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


		//Open any Url (Two Ways)
		driver.get("https://phptravels.com/demo/");
		//driver.navigate().to("https://phptravels.com/demo/");


		scrollPageDown(driver);
	}

	//We can perform the following actions using JavaScriptExecutor Interface
	
	//1. Highlight an Element
	//2. DrawBorder around an Element
	//3. Generate custom Alert during Test Execution
	//4. Click on an Element by using JaveScript
	//5. Refresh browser by using JavaScript
	//6. Get Title by using JavaScript
	//7. Get InnerText of page by using JavaScript
	//8. Scroll Into View and Scroll Page Down

	//To flash/Highlight any method
	public static void flash(WebElement element , WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgcolor  = element.getCssValue("backgroundColor");
		for (int i = 0; i <  10; i++) {
			changeColor("rgb(0,200,0)", element,driver);//1
			changeColor(bgcolor, element,driver);//2
		}
	}

	//To change the color of any element
	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor = '"+color+"'",  element);

		try {
			Thread.sleep(20);
		}  catch (InterruptedException e) {
		}
	}


	//To draw border across any element
	public static void drawBorder(WebElement element, WebDriver driver){
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}

	//Generate custom Alert during Test Execution
	public static void generateAlert(WebDriver driver, String message){
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('"+message+"')");

	}
	//Click on an Element by using JaveScript
	public static void clickElementByJS(WebElement element, WebDriver driver){
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);


	}
	//Refresh browser by using JavaScript
	public static void refreshBrowserByJS(WebDriver driver){
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");

	}

	//Get Title by using JavaScript
	public static String getTitleByJS(WebDriver driver){
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String title = js.executeScript("return document.title;").toString();
		return title;

	}
	//Get Page InnerText
	public static String getPageInnerText(WebDriver driver){
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
    	String pageText = js.executeScript("return document.documentElement.innerText;").toString();
    	return pageText;
    	}
	
	// Scroll Page Down
	
	public static void scrollPageDown(WebDriver driver){
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("scroll(0,900)");
    }
	//Scroll Into View till that element is found
	public static void scrollIntoView(WebElement element, WebDriver driver){
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

}
