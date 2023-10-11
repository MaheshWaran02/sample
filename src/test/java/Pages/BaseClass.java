package Pages;

import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;


public class BaseClass {
	
	public static WebDriver driver;
	public void basepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	


}

