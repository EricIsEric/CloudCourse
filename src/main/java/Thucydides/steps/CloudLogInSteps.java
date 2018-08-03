package Thucydides.steps;

import Thucydides.pages.BrowserObjectAndCommon2MethodPage;
import Thucydides.pages.CloudLogInPage;
import net.thucydides.core.annotations.Step;

public class CloudLogInSteps {
	
	BrowserObjectAndCommon2MethodPage browserObjectAndCommonMethodPage;
	
	CloudLogInPage cloudloginpage;
	
	@Step
	public void deleteAllCookies() throws Exception{
		browserObjectAndCommonMethodPage.deleteAllCookies();
		System.out.println("No Cookies Deleted1");
	}
	
	@Step
	public void EnterUnPwd(String username, String password) throws Exception {
		cloudloginpage.login(username, password);
	}
	
	@Step
	public void ClickSubmitBtn() throws Exception {
		cloudloginpage.clickLoginBtn();
	}
	
	@Step
	public void ClickSubmitBtnThree() throws Exception {
		cloudloginpage.clickLoginBtnThree();
	}
	
	@Step
	public void ClickSubmitBtnFour() throws Exception {
		cloudloginpage.clickLoginBtnFour();
	}
	
	@Step
	public void ClickSubmitBtnFive() throws Exception {
		cloudloginpage.clickLoginBtnFive();
	}
	
	@Step
	public void LoginAssertion() throws Exception {
		cloudloginpage.assertLoginStatus();
	}
	
	@Step
	public void LogOut() throws Exception {
		cloudloginpage.ClickLogoutBtn();
	}
	
	@Step
	public void ClearContents() throws Exception {
		cloudloginpage.ClearText();
	}
	
	@Step
	public void openURL(String url) throws Exception {
		browserObjectAndCommonMethodPage.openURL(url);
	}
	
	

}
