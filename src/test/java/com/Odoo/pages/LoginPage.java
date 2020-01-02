package com.Odoo.pages;

import com.Odoo.utilities.BrowserUtils;
import com.Odoo.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{
    @FindBy(linkText="Sign in")
    public WebElement signinButton;

    @FindBy(id="login")
    public WebElement userNameInput;

    @FindBy(id="password")
    public WebElement passwordInput;

    @FindBy(css=".alert.alert-danger")
    public WebElement warningMessage;


    public void login(String userName, String password){
        userNameInput.sendKeys(userName);
        passwordInput.sendKeys(password, Keys.ENTER);
    }
}
