package com.automation.tests.vyteck.sprint_01;

import com.automation.tests.vyteck.FirstTest;
import com.automation.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class BO6_66 extends FirstTest {
    /*

    Rauf

    As a store manager and Sales manager I should be able to create Vehicle

1.Verify that Store manager or sales manager should be able to see all vehicle information once
navigate to a Vehicle page
2. Verify that Store manager or sales manager should be able to create and cancel car
3.Verify that Store manager or sales manager should be able to add Vehicle Module and Vehicle Make
4.Verify that Store manager or sales manager should be able to edit or delete the car
5.Verify that Store manager or sales manager should be able to add an event
6. Verify that Store manager or sales manager should be able to reset Grid by click on Grid setting
     */




    @FindBy(partialLinkText = "Create Car")
    private WebElement createCar;


    public void clickToCreateCar(){
        BrowserUtils.waitForPageToLoad(10);
        wait.until(ExpectedConditions.elementToBeClickable(createCar)).click();

    }
}
