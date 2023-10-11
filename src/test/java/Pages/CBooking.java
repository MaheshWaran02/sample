package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CBooking extends BaseClass {
	public static WebDriver driver;
	
	By BookFlight = By.xpath("//a[text()='Book Flight']");
	By valided = By.xpath("//h3[text()=' FLYAWAY - PAYMENT GATEWAY ']");
	By complectBook = By.xpath("//a[@href='completepurchase']");
	
	public CBooking (WebDriver driver) {
		this.driver=driver;
	}
	
	public void Book() {
		driver.findElement(BookFlight).click();
		return;
	}
	public void valid() {
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "Fly Away - Make Flight Booking");
		driver.findElement(valided).isDisplayed();
		return;
		
		
	}


	public void complect1() {
		driver.findElement(complectBook).click();
		return;
		
	}
	
	public void  BookValide() {
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "Fly Away - Booking Confirmation");
		return;
		
	}

}
