package com.automation.tests.vyteck.sprint_01;

import com.automation.pages.AbstractPageBase;
import com.automation.pages.LoginPage;
import com.automation.pages.t2_Fleet.VehiclesFuelLogsPage;
import com.automation.pages.t2_Fleet.VehiclesModelPage;
import com.automation.tests.vyteck.AbstractTestBase;
import com.automation.utilities.BrowserUtils;
import com.automation.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BO6_84 extends AbstractTestBase {

    /*
    Mukaddes06 US10
    As a truck driver I should be able to access Vehicle Fuel Logs

   Acceptance Criteria:

   1.Verify that truck driver should be able to see all Vehicle Fuel information on the grid
   2.Verify that truck driver should be able to create Vehicle Fuel logs or cancel it
   3.Verify that truck driver should be able to Edit , delete Vehicle Fuel Logs or
   add attachment , add event
   4.Verify that truck driver should be able to reset the grid by clicking on Grid setting
     */

    @Test (description = "AC 1: Login and see all Vehicle fuel logs information")
    public void verifyToVehicleFuelLogs(){

        VehiclesModelPage vehiclesFuelLogs = new VehiclesModelPage();

        LoginPage loginPage = new LoginPage();
        loginPage.login();

        vehiclesFuelLogs.navigateTo("Fleet", "Vehicles Fuel Logs");

        String expected = "Vehicle Fuel Logs";
        String actual = Driver.getDriver().findElement(By.className("oro-subtitle")).getText();

        Assert.assertEquals(actual,expected);

    }

}
