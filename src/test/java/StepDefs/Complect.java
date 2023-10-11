/*package StepDefs;

import org.openqa.selenium.WebDriver;

import Pages.CBooking;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Complect {
	
	WebDriver driver = Hooks.driver;
	CBooking book;
	
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



}*/
