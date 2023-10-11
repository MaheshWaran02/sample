package StepDefs;

import org.openqa.selenium.WebDriver;

import Pages.SignUpPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class LoginTest {
	
	

WebDriver driver = Hooks.driver;
	SignUpPage Reg;

	@When("I click the Login button")
	public void i_click_the_Login_button() {
		Reg = new SignUpPage(driver);
		Reg.loginbuttonclick();
	   
	}

	@When("I click the New Member button")
	public void i_click_the_New_Member_button() {
		Reg = new SignUpPage(driver);
		Reg.ClickNotmamber();
	   
	}

	@When("I Enter E-Mail ID {string}")
	public void i_Enter_E_Mail_ID(String EmailID) {
		
		 Reg = new SignUpPage(driver);
	  Reg.EMAIL(EmailID);
	}

	@When("I Enter Password {string}")
	public void i_Enter_Password(String password) {
		Reg = new SignUpPage(driver);
		Reg.Password(password);
		
	    
	}

	@When("I Enter Confirm Password {string}")
	public void i_Enter_Confirm_Password(String Confirm) {
		Reg = new SignUpPage(driver);
		Reg.ConfirmPassword(Confirm);
	    
	}

	@When("I Enter Name {string}")
	public void i_Enter_Name(String name) {
		Reg = new SignUpPage(driver);
		Reg.Name(name);
	    
	}

	@When("I Enter Address {string}")
	public void i_Enter_Address(String Adreess) {
		Reg = new SignUpPage(driver);
		Reg.Adress(Adreess);
	    
	}

	@When("I Enter City {string}")
	public void i_Enter_City(String city) {
		Reg = new SignUpPage(driver);
		Reg.City(city);
		
	   
	}

	@When("I Click Sign-up button")
	public void i_Click_Sign_up_button() {
		Reg = new SignUpPage(driver);
		Reg.ClickSignUP();
		
	}
	
	@Then("Validate If I got This MSG {string}")
	public void validate_If_I_got_This_MSG(String Value) {
		Reg = new SignUpPage(driver);
		Reg.SigUpValue(Value);
	   
	}

	@Then("I Validate the Login Value using Database {string}")
	public void i_Validate_the_Login_Value_using_Database(String string) {
	    
		
		
	}
	
	
	
}
