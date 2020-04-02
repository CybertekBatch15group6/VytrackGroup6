package com.automation.pages.t2_Fleet;

import com.automation.pages.AbstractPageBase;
import com.automation.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class VehiclesFuelLogsPage extends AbstractPageBase {

    @FindBy(partialLinkText = "Vehicle Fuel Logs")
    private WebElement createVehicleFuelLogs;

    public void clickToCreateVehicleFuelLogs(){
        wait.until(ExpectedConditions.elementToBeClickable(createVehicleFuelLogs)).click();
    }




}
