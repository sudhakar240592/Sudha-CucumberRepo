package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.FunctionalLibraries.Base;

public class VerifyLogin extends Base{

	
	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement login;

	@FindBy(xpath="//*[@id=\"username_show\"]")
	private WebElement loginname;
	
	@FindBy(className="login_forgot")	
	private WebElement logincheck;
	
	@FindBy(xpath="//*[contains(text(),'Invalid')]")
	private WebElement loginerror;
	
	public WebElement getLoginerror() {
		return loginerror;
	}

	public void setLoginerror(WebElement loginerror) {
		this.loginerror = loginerror;
	}

	public WebElement getLogincheck() {
		return logincheck;
	}

	public void setLogincheck(WebElement logincheck) {
		this.logincheck = logincheck;
	}

	public WebElement getUsername() {
		return username;
	}

	public void setUsername(WebElement username) {
		this.username = username;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}
	public WebElement getLogin() {
		return login;
	}

	public void setLogin(WebElement login) {
		this.login = login;
	}
	
	public WebElement getLoginname() {
		return loginname;
	}

	public void setLoginname(WebElement loginname) {
		this.loginname = loginname;
	}

	public VerifyLogin() {
PageFactory.initElements(driver,this);
	}

}
