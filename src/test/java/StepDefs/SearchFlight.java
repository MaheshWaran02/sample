package StepDefs;

import org.openqa.selenium.WebDriver;

import Pages.CBooking;
import Pages.Login;
import Pages.SearchFlightesss;
import Pages.SignUpPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchFlight {
	
	WebDriver driver = Hooks.driver;
	Login login;
	SearchFlightesss Search;
	CBooking book;
	
	
	@When("I click On Login and SingUp button")
	public void i_click_On_Login_and_SingUp_button() {
		login = new Login (driver);
		login.SignUpClick();
		
	}

	@When("I enter User Name {string}")
	public void i_enter_User_Name(String EmailID) {
		
		login = new Login (driver);
		login.EMAIL(EmailID);
	    
		
	}

	@When("I enter Password {string}")
	public void i_enter_Password(String Password) {
		login = new Login (driver);
	   
		login.Password(Password);
	}

	@When("I click on loginbutton")
	public void i_click_on_loginbutton() {
		
		login = new Login (driver);
		login.loginbutton();
		
	}

	@Then("I valided Logoutbutton in my homepage")
	public void i_valided_Logoutbutton_in_my_homepage() {
		login = new Login (driver);
		login.LogoutTest();
		
		
	}
	
	@When("I click on the Home button")
	public void i_click_on_the_Home_button() {
		
		Search = new SearchFlightesss (driver);
		Search.HomeButton();
		
	}

	@When("I select the Departure city")
	public void i_select_the_Departure_city() {
		Search = new SearchFlightesss (driver);
		Search.departure1();
	
		
	}

	@When("I select the Destination city")
	public void i_select_the_Destination_city() {
		Search = new SearchFlightesss (driver);
	    
		Search.Destination();
	}


	@Then("I click the Submit button")
	public void i_click_the_Submit_button() {
	    
		Search = new SearchFlightesss (driver);
		Search.Submited();
	}
	
	@Then("I validate the Booking Flight ID")
	public void i_validate_the_Booking_Flight_ID() {
	    
		
	}

	
	@When("I click on the Book Flight button")
	public void i_click_on_the_Book_Flight_button() {
	   
	    book = new CBooking(driver);
	    book.Book();
	    
	    
	}

	@When("I validate the page")
	public void i_validate_the_page() {
		
		   book = new CBooking(driver);
		   book.valid();
		
	    
	}

	@When("I click on the Complete Booking button")
	public void i_click_on_the_Complete_Booking_button() {
		 book = new CBooking(driver);
		 book.complect1();
	}

	@Then("I validate this page as well")
	public void i_validate_this_page_as_well() 
	
	{
		book = new CBooking(driver);
		book.BookValide();
	}
	

}
