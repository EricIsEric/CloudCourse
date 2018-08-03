package Thucydides.jbehave;
import org.jbehave.core.annotations.*;

import Thucydides.steps.CloudLogInSteps;
import net.thucydides.core.annotations.Steps;
public class CloudLogIn{
	
	@Steps
	CloudLogInSteps steps;
	
	
	@Given("Delete all cookies before start testing")
	public void DeleteCookies() throws Exception{
		steps.deleteAllCookies();
		System.out.println("No Cookies Detected2"); 
	}
	
	@When("the user has opened the CloudCourse webpage $url")
	public void AccessURL(String url) throws Exception{
		steps.openURL(url);
	}
	
	@Then("the user enters username admin and password 123456 to CloudCourse login page")
	public void LoginOne() throws Exception{
		Thread.sleep(30000);
		 steps.EnterUnPwd("admin", "123456");
	}
	
	@Then("click login button for one")
	public void ClickLoginBtnOne() throws Exception {
		steps.ClickSubmitBtn();
	}
	
	@Then("check login statusOne")
	public void LoginOneAssertion() throws Exception{
		 steps.LoginAssertion();
	}
	
	@Then("Click Logout button for One")
	public void LogoutOne() throws Exception{
		 steps.LogOut();
	}
	
	@Then("the user enters username chaoji and password 123456 to CloudCourse login page")
	public void LogInTwo() throws Exception{
		steps.EnterUnPwd("chaoji", "123456"); 
	}
	
	@Then("click login button for two")
	public void ClickLoginBtnTwo() throws Exception {
		steps.ClickSubmitBtn();
	}
	
	@Then("check login statusTwo")
	public void LogInTwoAssertion() throws Exception{
		steps.LoginAssertion();
	}
	
	@Then("Click Logout button for Two")
	public void LogoutTwo() throws Exception{
		steps.LogOut();
	}
	
	@Then("the user enters username 21321 and password 124324 to CloudCourse login page")
	public void LoginThree() throws Exception{
		steps.EnterUnPwd("21321", "124324"); 
	}
	
	@Then("click login button for three")
	public void ClickLoginBtnThree() throws Exception {
		steps.ClickSubmitBtnThree();
	}
	
	@Then("check login statusThree")
	public void LoginThreeAssertion() throws Exception{
		steps.LoginAssertion(); 
	}
	
	@Then("clear text content for Three")
	public void ClearTextThree() throws Exception{
		 steps.ClearContents();
	}
	
	@Then("the user enters username 21321 and password with blank to CloudCourse login page")
	public void LoginFour() throws Exception{
		steps.EnterUnPwd("21321", "");
	}
	
	@Then("click login button for four")
	public void ClickLoginBtnFour() throws Exception {
		steps.ClickSubmitBtnFour();
	}
	
	@Then("check login statusFour")
	public void LoginFourAssertion() throws Exception{
		steps.LoginAssertion();
	}
	
	@Then("clear text content for Four")
	public void ClearTextFour() throws Exception{
		steps.ClearContents(); 
	}
	
	@Then("the user enters username with blank and password 123456 to CloudCourse login page")
	public void LoginFive() throws Exception{
		steps.EnterUnPwd("", "123456"); 
	}
	
	@Then("click login button for five")
	public void ClickLoginBtnFive() throws Exception {
		steps.ClickSubmitBtnFive();
	}
	
	@Then("check login statusFive")
	public void LoginFiveAssertion() throws Exception{
		steps.LoginAssertion(); 
	}
	
	@Then("clear text content for Five")
	public void ClearTextFive() throws Exception{
		steps.ClearContents(); 
	}
	
}