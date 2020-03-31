package com.automation.tests.vyteck.sprint_01;

import com.automation.pages.LoginPage;
import com.automation.pages.t3_Fleet.VehiclesModelPage;
import com.automation.tests.vyteck.AbstractTestBase;
import com.automation.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BO6_81 extends AbstractTestBase {
    /*
    #14 - Canan Arikan
    US: As a store manager or sales manager I should be able to access Vehicle model page
    AC:
    1.Verify that store manager or sales manager should be able to
    access Vehicle model page and able to see all Vehicles model information
    2. Verify that Store manager or Sales manager should be able to
    create new Vehicle model
    3.Verify that during the creation, all required field should be
    displayed and Fuel type drop down should displayed as (Gasoline,Diesel,Electric,Hybird)
    4.Verify that store manager or sales manager should be able to
    Edit or delete the Vehicle model
    5.Verify that store manager or sales manager should be able to
    reset the grid by click on Grid setting */

    @Test (description = "AC 1: Login and see all Vehicles model information")
    public void verifyToSeeAllVehiclesModel(){
        LoginPage loginPage = new LoginPage();
        VehiclesModelPage vehiclesModel = new VehiclesModelPage();

        loginPage.login();
        vehiclesModel.navigateTo("Fleet", "Vehicles Model");

        String expected = "All Vehicles Model";
        String actual = Driver.getDriver().findElement(By.xpath("//h1[@class='oro-subtitle']")).getText();

        Assert.assertEquals(actual,expected);

    }

}
