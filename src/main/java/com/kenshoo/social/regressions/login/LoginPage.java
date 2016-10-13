package com.kenshoo.social.regressions.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by nirf on 13/10/16.
 */
public class LoginPage {

    @FindBy(name="email")
    private WebElement email;

    @FindBy(name="password")
    private WebElement password;

    @FindBy(id="submitButton2")
    private WebElement loginButton;

    private WebDriver driver;



    public static LoginPage navigateTo(WebDriver driver) {
        driver.get("http://social.kenshoo.com");
        LoginPage page = PageFactory.initElements(driver,
                LoginPage.class);
        page.setDriver(driver);
        return page;
    }

    public MainPage login(String user, String password){
        this.email.sendKeys(user);
        this.password.sendKeys(password);
        loginButton.submit();
        MainPage.initMain(driver);
        return PageFactory.initElements(driver, MainPage.class);
    }


    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
}
