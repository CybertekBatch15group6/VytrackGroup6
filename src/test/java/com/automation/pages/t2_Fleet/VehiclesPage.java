package com.automation.pages.t2_Fleet;

import com.automation.pages.AbstractPageBase;
import com.automation.utilities.BrowserUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.Set;

public class VehiclesPage extends AbstractPageBase {


    @FindBy(partialLinkText = "Create Car")
    private WebElement createCar;

    @FindBy(xpath = "//button[@class='btn btn-success action-button']")
    private WebElement saveCarCreated;

    @FindBy(xpath = "//div[@class='flash-messages-holder']")
    private WebElement popup;

    @FindBy(className = "grid-header-cell__label")
    public List<WebElement> columnNames;

    public List<String> getColumnNames(){
        BrowserUtils.waitForPageToLoad(20);
        return BrowserUtils.getTextFromWebElements(columnNames);
    }

    public void clickToCreateCar(){
        BrowserUtils.waitForPageToLoad(15);
        wait.until(ExpectedConditions.elementToBeClickable(createCar)).click();
    }


    public void saveCar(){
        BrowserUtils.waitForPageToLoad(10);
        wait.until(ExpectedConditions.elementToBeClickable(saveCarCreated)).click();
    }

    public String popupMsg(){
       String msg= wait.until(ExpectedConditions.visibilityOf(popup)).getText();
        return msg;
    }




}
