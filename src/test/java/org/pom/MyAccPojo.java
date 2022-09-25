package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccPojo extends BaseClass {
	public MyAccPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[text()='My Account'])[1]")
	private WebElement myAcc;
	@FindBy(id = "email")
	private WebElement email;
	@FindBy(name = "login[password]")
	private WebElement pass;
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement submit;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getMyAcc() {
		return myAcc;
	}
}
