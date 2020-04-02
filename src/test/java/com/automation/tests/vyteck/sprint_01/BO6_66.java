package com.automation.tests.vyteck.sprint_01;

import com.automation.pages.LoginPage;
import com.automation.pages.t2_Fleet.VehiclesPage;
import com.automation.tests.vyteck.AbstractTestBase;
import com.automation.utilities.BrowserUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BO6_66 extends AbstractTestBase {
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



    @Test
    public void verifyTitle(){
        LoginPage loginPage = new LoginPage();
        VehiclesPage vehiclesPage = new VehiclesPage();

        loginPage.login();
        vehiclesPage.navigateTo("Fleet", "Vehicles");

        BrowserUtils.wait(3);
        vehiclesPage.clickToCreateCar();
        BrowserUtils.wait(3);
        vehiclesPage.saveCar();
        BrowserUtils.wait(5);

        String actual=vehiclesPage.popupMsg();
        String expected ="Entity saved";

        Assert.assertTrue(actual.contains(expected));


    }





}
