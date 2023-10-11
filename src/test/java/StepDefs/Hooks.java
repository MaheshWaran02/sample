package StepDefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
	
	public static WebDriver driver;
	
	@Before
	public void setup( ) {
		
		WebDriverManager.chromedriver().setup();
	      
		this.driver = new ChromeDriver();
		driver.get("http://localhost:8080/FlyAway/home");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
	}
	@Before
	public void beforeScenario() {
		System.out.println("This will run before the scenario");
	}
	@After
	public void afterScenario(io.cucumber.java.Scenario sc) {
		System.out.println("This will run after the scenario");
		if(sc.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot)driver;
			byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
			sc.embed(screenshot, "image/png");
		}else {
			TakesScreenshot ts = (TakesScreenshot)driver;
			byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
			sc.embed(screenshot, "image/png");
		}
	}
	@After
	public void teardown() {
		driver.quit();
	}
}
