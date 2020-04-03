package com.automation.pages.t2_Fleet;

import com.automation.pages.AbstractPageBase;
import com.automation.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class VehicleServicesLogsPage extends AbstractPageBase {

    @FindBy(css = ".oro-subtitle")
    private WebElement textH1;

    @FindBy(xpath = "//table")
    private WebElement table;

    @FindBy(css = "a[class='btn main-group btn-primary pull-right ']")
    private WebElement createVehicleButton;



    public String textOfH1(){

        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOf(textH1));

        return textH1.getText();


    }

    public Boolean checkIfTableVisible(){

        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOf(table));

        return table.isDisplayed();

    }

    public String textOfCreateVehicle(){

        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOf(createVehicleButton));

        return createVehicleButton.getText();
    }

}
