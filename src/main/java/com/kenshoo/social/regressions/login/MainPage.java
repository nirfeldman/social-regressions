package com.kenshoo.social.regressions.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by nirf on 13/10/16.
 */
public class MainPage {

    @FindBy(id="master-selection-combo-inputEl")
    WebElement mastersCombo;

    @FindBy(className = "master-combo-list-item")
    List<WebElement> masters;

    public void chooseMaster(String master) {
        mastersCombo.click();
        for (WebElement element: masters){
            if (element.findElement(By.tagName("span")).getText().startsWith("Agency 1 Kenshoo")){
                element.click();
            }
        }

    }

    public static void initMain(WebDriver driver) {
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(By.id("master-selection-combo-inputEl")) );
    }
}
