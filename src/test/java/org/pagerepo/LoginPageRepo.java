package org.pagerepo;

import org.baseutils.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageRepo extends BaseClass {

	public LoginPageRepo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement username;
	
	@FindBy(id = "pass")
	private WebElement password;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}
}