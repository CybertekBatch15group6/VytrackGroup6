package com.automation.tests.vyteck.sprint_01;

import com.automation.pages.LoginPage;
import com.automation.pages.t2_Fleet.VehicleOdometerPage;
import com.automation.tests.vyteck.AbstractTestBase;
import com.automation.utilities.BrowserUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class B06_70 extends AbstractTestBase {

    /*
    Arafat
    User Story:
        #3. As a truck driver, I should be able to access Vehicle Odometer page
    Acceptance Criteria:
        1. Verify that the truck driver should be able to see all vehicle odometer information on the grid. 
        2. Verify that the Truck driver should be able to create a Vehicle odometer or cancel it. 
        3. Verify that the truck driver should be able to delete or edit Vehicle odometer. 
        4.Verify that truck driver should be able to reset grid by click on grid setting

     */

    @Test(description = "AC#1: Verify that the truck driver should be able to see all vehicle odometer information on the grid.")
    public void verifyOdometerInformation() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("user18", "UserUser123");
        BrowserUtils.waitForPageToLoad(10);
        VehicleOdometerPage vehicleOdometerPage = new VehicleOdometerPage();
        vehicleOdometerPage.navigateTo("Fleet", "Vehicle Odometer");
        BrowserUtils.wait(4);

        vehicleOdometerPage.clickToSelectAllOnGridSettings();
        BrowserUtils.wait(5);

        List<String> expected = Arrays.asList("ID","ODOMETER VALUE","DATE","DRIVER","UNIT","MODEL");
        List<String> actual = vehicleOdometerPage.getTableHeader();

        Assert.assertEquals(actual,expected);

    }

    @Test(description = "AC#2: Verify that the Truck driver should be able to create a Vehicle odometer or cancel it.")
    public void createVehicleOdometerAndCancel(){
        verifyOdometerInformation();
        BrowserUtils.waitForPageToLoad(10);

        VehicleOdometerPage vehicleOdometerPage = new VehicleOdometerPage();
        vehicleOdometerPage.createAndCancelVehicleOdometer();

    }

    @Test
    public void deleteVehicleOdometers(){
        LoginPage loginPage = new LoginPage();
        loginPage.login("user18", "UserUser123");
        BrowserUtils.waitForPageToLoad(10);
        VehicleOdometerPage vehicleOdometerPage = new VehicleOdometerPage();
        vehicleOdometerPage.navigateTo("Fleet", "Vehicle Odometer");
        BrowserUtils.wait(8);

        vehicleOdometerPage.deleteVehicleOdometer();
        BrowserUtils.wait(4);
    }

}
