package com.automation.pages.t3_Fleet;

import com.automation.pages.AbstractPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class VehiclesModelPage extends AbstractPageBase {

    @FindBy(partialLinkText = "Create Vehicles Model")
    private WebElement createVehiclesModel;

    public void clickToCreateVehiclesModel(){
        wait.until(ExpectedConditions.elementToBeClickable(createVehiclesModel)).click();
    }
}
