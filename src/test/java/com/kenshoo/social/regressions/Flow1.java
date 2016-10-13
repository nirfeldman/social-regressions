package com.kenshoo.social.regressions;

import com.kenshoo.social.regressions.login.LoginPage;
import com.kenshoo.social.regressions.login.MainPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by nirf on 13/10/16.
 */
public class Flow1 {

    @Test
    public void testFlow1(){
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "/dev/social-regressions/chromedriver");
        LoginPage loginPage = LoginPage.navigateTo(driver);
        MainPage page = loginPage.login("nir.feldman@kenshoo.com", "oZCtiQu");
        page.chooseMaster("Agency1 Kenshoo");
    }
}
