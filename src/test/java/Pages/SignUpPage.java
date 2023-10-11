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
import org.openqa.selenium.support.FindBy;


public class SignUpPage extends BaseClass{
	
	public static WebDriver driver;
	
	
 /* @FindBy (xpath = "//a[@href='login']")
	WebElement loginButton;
  @FindBy (xpath = "//a[@href='signup']")
 	WebElement NotMamber;*/
  
By loginButton = By.xpath("//a[@href='login']");
	By NotMamber = By.xpath("//a[@href='signup']");
	By EmiilID = By.xpath("//*[@name='email_id']");
	//@FindBy (xpath= "//input[@name='pwd']")
	//WebElement password;
	By Passeord = By.xpath("//input[@name='pwd']");
	By ConPassword = By.xpath("//input[@name='pwd2']");
	By Name = By.xpath("//input[@name='name']");
	By Addres = By.xpath("//input[@name='address']");
	By City = By.xpath("//input[@name='city']");
	By SignUp = By.xpath("//button[text()='Signup']");
	By SigUpValue = By.xpath("//a[@href='login'][2]");
	
	public SignUpPage (WebDriver driver) {
		this.driver=driver;
	}
	
	int i = 6+1;
	
	public By loginbuttonclick() {
		driver.findElement(loginButton).click();
		return loginButton;
		//loginButton.click();
			
		
	}


	public By ClickNotmamber() {
		driver.findElement(NotMamber).click();
		return NotMamber;
	//	NotMamber.click();
	//	return;
	}
	
	public void EMAIL(String emailID) {
		driver.findElement(EmiilID).sendKeys(emailID+i);
		
		return;
	}
	public void Password(String Password) {
	driver.findElement(Passeord).sendKeys(Password+i);
	return;
	
		
	}


	public void ConfirmPassword(String confirm) {
		driver.findElement(ConPassword).sendKeys(confirm+i);
		return;
		
	}
	
	public void Name(String name) {
		driver.findElement(Name).sendKeys(name+i);
		return;
		
	}
	public void Adress(String Adress) {
		driver.findElement(Addres).sendKeys(Adress+i);
		return;
		
	}
	public void City(String city) {
		driver.findElement(City).sendKeys(city+i);
		return;
		
	}
	public void ClickSignUP() {
		driver.findElement(SignUp).click();
		return;
		
	}
	
	public void SigUpValue(String SingUpValue) {
		WebElement Acctualvalue = driver.findElement(SigUpValue);
		String Correct = Acctualvalue.getText();
		Assert.assertEquals(Correct, SingUpValue);
		return;
		
	}
	/*public void DataBaseConnection(String Emaild) throws ClassNotFoundException, SQLException {
		
		Class.forName ("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://jdbc:mysql://127.0.0.1:3308/flyaway", "root", "");
		Statement stmt = con.createStatement();
		ResultSet result = stmt.executeQuery("Select * from  f_user Where ID = 6");
		while(result.next()) {
			
		System.out.println("Your Table is " + result.getString(i));
			
		
		}
		
}*/

	}


