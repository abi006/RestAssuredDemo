package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition {

	
	@Given("im in login page")
	public void im_in_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("im in login page");
	}

	@When("ill give my debit\\/credit card details username {string} password {string}")
	public void ill_give_my_debit_credit_card_details_username_password(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(string+string2);
	}
	

	 @When("^ill give my debit/credit card multiple details (.+) (.+)$")
	    public void ill_give_my_debitcredit_card_multiple_details(String username, String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println(username+password);
		
	}


	@When("ill move to deposit page")
	public void ill_move_to_deposit_page() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("in deposit page");
	}

	@Then("i validate my balance")
	public void i_validate_my_balance() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("checking my balance");
	}

	@Then("check my cards")
	public void check_my_cards() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("checking my cards");
	}

}
