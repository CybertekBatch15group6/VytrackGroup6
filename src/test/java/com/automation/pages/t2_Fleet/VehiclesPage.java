package com.automation.pages.t2_Fleet;

import com.automation.pages.AbstractPageBase;
import com.automation.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.Set;

public class VehiclesPage extends AbstractPageBase {


    @FindBy(partialLinkText = "Create Car")
    private WebElement createCar;


    public void clickToCreateCar(){
        BrowserUtils.waitForPageToLoad(10);
        wait.until(ExpectedConditions.elementToBeClickable(createCar)).click();

    }


    @FindBy(className = "grid-header-cell__label")
    public List<WebElement> columnNames;

    public List<String> getColumnNames(){
        BrowserUtils.waitForPageToLoad(20);
        return BrowserUtils.getTextFromWebElements(columnNames);
    }
}
