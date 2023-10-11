package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login extends BaseClass {
	
public static WebDriver driver;

	
	By SignUp = By.xpath("//a[@href='login']");
	By EmailInput = By.xpath("//input[@name='email_id']");
	By password = By.xpath("//input[@name='pwd']");
	By loginButton = By.xpath("//button[text()='Login']");
	By LogoutText = By.xpath("//a[@href='logout']");

	
	public Login (WebDriver driver) {
		this.driver=driver;
	}
	
	int i = 6+1;
	
	public By SignUpClick() {
		driver.findElement(SignUp).click();
		return SignUp;
		}
	
	public void EMAIL(String EInput) {
		driver.findElement(EmailInput).sendKeys(EInput+i);
		
		return;
	}
	public void Password(String Password) {
		driver.findElement(password).sendKeys(Password+i);
		return;
		}
	public void loginbutton() {
		driver.findElement(loginButton).click();
		return;
	}
	
	public void LogoutTest() {
		
		WebElement Logout = driver.findElement(LogoutText);
		String Actvalue = Logout.getText();
		Assert.assertEquals(Actvalue, "Logout");
	}
	

}
