package com.automation.pages;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractPageBase {

    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver,15);

    /**
     * Locator for the current user WebElement
     * that is always displayed in the upper right hand
     * corner of all Vytrack page modules (except login page)
     **/
    @FindBy(css = "#user-menu > a")
    protected WebElement currentUser;

    public AbstractPageBase(){ // <-- Constructor
        //PageFactory allows us to use @FindBy annotations and other useful things
        PageFactory.initElements(Driver.getDriver(), this);
    }

    /**
     * Method for Vytrack navigation. just put in the tab and module name into the params to navigate to the correct page
     * @param tabName, based on the tabs at the top of the page (like vehicle or sales)
     * @param moduleName, based on the elements under each tab, (such as Table under Dashboards tab, or Calls under Activities Tab)
     * */
    public void navigateTo(String tabName, String moduleName){

        wait = new WebDriverWait(driver, 15);

        String tabNameXpath ="//span[@class='title title-level-1' and contains(text(),'"+tabName+"')]";
        String moduleXpath = "//span[@class='title title-level-2' and contains(text(),'"+moduleName+"')]";

        WebElement tabElement = driver.findElement(By.xpath(tabNameXpath));
        WebElement moduleElement = driver.findElement(By.xpath(moduleXpath));

        Actions actions = new Actions(driver);

        BrowserUtils.wait(3);

        actions.moveToElement(tabElement).
                pause(500).
                click(moduleElement).
                pause(2000).
                build().perform();
    }



    public String getCurrentUserName(){
        BrowserUtils.waitForPageToLoad(10);
        wait.until(ExpectedConditions.visibilityOf(currentUser));
        return currentUser.getText().trim();
    }

}
