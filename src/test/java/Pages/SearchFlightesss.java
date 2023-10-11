package Pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchFlightesss extends BaseClass {


	public static WebDriver driver;

	By Home = By.xpath("//a[@href='home']");
	By  Departure = By.xpath("//select[@name='source']");    
	By Destination = By.xpath("//select[@name='destination']");
	By Submitted = By.xpath("//button[text()='Submit']");
	By validated = By.xpath("//a[@href='bookflight?id=3']");
	By BookFlight = By.xpath("//a[@href='bookflight?id=3']");
	By valided = By.xpath("//h3[text()=' FLYAWAY - PAYMENT GATEWAY ']");
	By complectBook = By.xpath("//a[@href='completepurchase']");
	
	public SearchFlightesss (WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void HomeButton () {
		driver.findElement(Home).click();
		return;
	}
	

	

	public void departure1() {
		
		WebElement Depart = driver.findElement(Departure);
		
		Select DepartureStates = new Select(Depart);
		
		DepartureStates.selectByVisibleText("Bangalore");
		return;
	}
	
	public void Destination() {
		WebElement  Destini = driver.findElement(Destination);
		Select DestinationStates = new Select(Destini);
		DestinationStates.selectByVisibleText("Chennai");
		return;
	}
	
	public void Submited() {
		driver.findElement(Submitted).click();
		return;
	}
	
	public void BookflighID() throws ClassNotFoundException, SQLException {
		
		WebElement bookId = driver.findElement(validated);
		
		System.out.println(bookId.isDisplayed());
		
		String href = bookId.getAttribute("href");
		System.out.println(href);
		String[] ID = href.split("\\=");
		System.out.println(ID[1]);
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/flyaway", "root", "");

		Statement stmt = con.createStatement();
		
		ResultSet  Result = stmt.executeQuery("Select Id from  f_flights ID where source=1 and destination=4;");
		System.out.println(Result);
		System.out.println(Result);
		
		while (Result.next()) {
			
			String Acual = Result.getString(href);
			System.out.println(Acual);
			Assert.assertEquals(Acual, ID[1]);
		}
		return;
	}
	public void Book() {
		driver.findElement(BookFlight).clear();
		return;
	}
	public void valid() {
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, " FLYAWAY - PAYMENT GATEWAY ");
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
		
	

	