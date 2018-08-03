package Thucydides.pages;

/*import java.util.List;
import java.util.ArrayList;*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import net.thucydides.core.pages.PageObject;
//import net.thucydides.core.pages.WebElementFacade;

public class CloudLogInPage extends PageObject {
	
	Actions actions;

	
	public void login(String username, String password) {
		WebElement usernameInput = find(By.xpath("//*[@id=\'username\']"));
		WebElement passwordInput = find(By.xpath("//*[@id=\'password\']/span/input"));
		usernameInput.sendKeys(username);
		passwordInput.sendKeys(password);

	}
	
	public void clickLoginBtn() throws Exception {
		find(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/form/div[3]/div/div/button")).click();
		Thread.sleep(30000);
	}
	
	public void clickLoginBtnThree() throws Exception {
		find(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/form/div[3]/div/div/button")).click();
		Thread.sleep(1700);
	}
	
	public void clickLoginBtnFour() throws Exception {
		find(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/form/div[3]/div/div/button")).click();
		Thread.sleep(1700);
	}
	
	public void clickLoginBtnFive() throws Exception {
		find(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/form/div[3]/div/div/button")).click();
		Thread.sleep(1700);
	}
	
	public void assertLoginStatus() throws Exception {
		if(!getDriver().getCurrentUrl().contains("login")) {
			System.out.println("=====》当前登录成功《=====");
		}else {
			
			if(find(By.id("username")).getAttribute("value").length()>0 && find(By.xpath("//*[@id=\'password\']/span/input")).getAttribute("value").length()>0) {
				System.out.println("=====》当前登录提示用户名或密码错误《=====");
			}else if(find(By.id("username")).getAttribute("value").length()==0 && find(By.xpath("//*[@id=\'password\']/span/input")).getAttribute("value").length()>0) {
				System.out.println("=====》当前登录提示请输入用户帐号《=====");
			}else if(find(By.id("username")).getAttribute("value").length()>0 && find(By.xpath("//*[@id=\'password\']/span/input")).getAttribute("value").length()==0) {
				System.out.println("=====》当前登录提示请输入用户密码《=====");
			}
			
		}
	}
	
	public void ClickLogoutBtn() throws Exception {
		find(By.xpath(".//*[@id='page-container']/div[1]/div[1]/div[2]/div[1]/span")).click();
		Thread.sleep(20000);
	}
	
	public void ClearText() throws Exception {
		find(By.id("username")).clear();
		find(By.xpath("//*[@id=\"password\"]/span/input")).clear();
	}
}
