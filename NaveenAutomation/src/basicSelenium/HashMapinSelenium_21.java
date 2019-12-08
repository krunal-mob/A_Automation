package basicSelenium;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HashMapinSelenium_21 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/asarkar/Desktop/Abhishek Sarkar/TechBodhi/Drivers/chromedriver 3");

		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		driver.get("https://classic.crmpro.com/index.html?e=2");


		//Practical implementation of this would be storing the Username and password for 
		//different roles. Role/Permission based use case

		//1. Customer
		//2. Admin User
		//3. Seller
		//4. Distributor
		//5. Delivery Boy 

		driver.findElement(By.id("username")).sendKeys(getUserName("admin"));
		driver.findElement(By.id("password")).sendKeys(getPassword("admin"));

	}




	public static Map<String, String> getCredsMap() {

		Map<String, String> userMap = new HashMap<String, String>();

		userMap.put("admin", "adminUsername:admin@123");
		userMap.put("Customer", "customerUsername:Customer@123");
		userMap.put("seller", "sellerUsername:seller@123");

		return userMap;

	}	

	public static String getUserName(String role) {

		String credentials = getCredsMap().get(role);
		return credentials.split(":")[0]; // return the userName

	}

	public static String getPassword(String role) {

		String credentials = getCredsMap().get(role);
		return credentials.split(":")[1]; // return the password

	}


	

}
