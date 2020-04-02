package com.automation.pages.t2_Fleet;

import com.automation.pages.*;
import com.automation.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

public class VehicleCostsPage extends AbstractPageBase {

    @FindBy(xpath = "(//h1)[2]")
    private WebElement allVehicleCosts;

    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    private WebElement TrackDriverVehicleCostPage;
    public String getVehicleCostsPageText() {

        BrowserUtils.waitForPageToLoad(6);
        wait.until(ExpectedConditions.visibilityOf(allVehicleCosts));
        return allVehicleCosts.getText().trim();
    }
}
