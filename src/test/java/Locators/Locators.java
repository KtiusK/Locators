package Locators;


import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Test
	public void test() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Katiusca\\MiscelaneosSelenium\\miscelaneos\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/test/newtours/register.php");
	
	
	//Locator: By.name
	driver.findElement(By.name("firstName")).sendKeys("John");
	
	//Locator: By.xpath del elemento
	driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Smith");
	
	//Locator: name
	driver.findElement(By.name("phone")).sendKeys("+913786490");
	
	//Locator: id
	driver.findElement(By.id("userName")).sendKeys("john.smith23@gmail.com");
	
	//Locator: xpath
	driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Street 34 #9-82");
	
	driver.findElement(By.name("city")).sendKeys("Seatle");
	driver.findElement(By.name("state")).sendKeys("Washington");
	driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("3764");
	
	
	//Lista desplegable Locator By.name
	//Almacenamos en una variable el elemento 
	Select country  = new Select (driver.findElement(By.name("country")));
	//Seleccione por el nombre visible 
	country.selectByVisibleText("UNITED STATES");
	 //select por el index
	// country.selectByIndex(1);
	 
	driver.findElement(By.id("email")).sendKeys("john.smith23@gmail.com");
	driver.findElement(By.name("password")).sendKeys("password123");
	driver.findElement(By.name("confirmPassword")).sendKeys("password123");
	driver.findElement(By.xpath("//input[@type='submit']")).click();

	Thread.sleep(3000);
	
	//Valide si existe el nombre de usuario presente en la página
	Assert.assertEquals(driver.getPageSource().contains(" Note: Your user name is john.smith23@gmail.com."), true);

	}
}
