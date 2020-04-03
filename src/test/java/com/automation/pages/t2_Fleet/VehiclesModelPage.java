package com.automation.pages.t2_Fleet;

import com.automation.pages.AbstractPageBase;
import com.automation.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class VehiclesModelPage extends AbstractPageBase {

    @FindBy(partialLinkText = "Create Vehicles Model")
    private WebElement createVehiclesModel;

    @FindBy(className = "grid-header")
    private WebElement allVehiclesTable;

    public WebElement getAllVehiclesTable(){
        BrowserUtils.waitForPageToLoad(20);
        return allVehiclesTable;
    }

    public void clickToCreateVehiclesModel(){
        wait.until(ExpectedConditions.elementToBeClickable(createVehiclesModel)).click();
    }
}
