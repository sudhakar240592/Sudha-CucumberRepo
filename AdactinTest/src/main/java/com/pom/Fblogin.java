package com.pom;

import java.awt.print.Pageable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.FunctionalLibraries.Base;

public class Fblogin extends Base {

	@FindBy(name="email")
	private WebElement username;
	
	@FindBy(name="pass")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement login;
	
	@FindBy(xpath="(//span[contains(text(),'Sudhakar')])")
	private WebElement verifyname;

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
	
	public WebElement getVerifyname() {
		return verifyname;
	}

	public void setVerifyname(WebElement verifyname) {
		this.verifyname = verifyname;
	}
	
	public Fblogin() {
PageFactory.initElements(driver, this);
	}

	
	
	
}
