package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(id = "inputEmail")
    public WebElement emailInput;

    @FindBy(id = "inputPassword")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signIn;


    public  void login(String username, String password){
        emailInput.sendKeys(username);
        passwordInput.sendKeys(password);
        signIn.click();
    }
}
