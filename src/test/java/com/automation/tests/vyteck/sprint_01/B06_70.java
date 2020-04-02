package com.automation.tests.vyteck.sprint_01;

import com.automation.pages.LoginPage;
import com.automation.pages.t2_Fleet.VehiclesPage;
import com.automation.utilities.BrowserUtils;
import org.testng.annotations.Test;

public class B06_70 {

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

    @Test
    public void verifyAllVehicleInformation() {
        LoginPage loginPage = new LoginPage();
        VehiclesPage vehiclesPage = new VehiclesPage();
        loginPage.login("user18", "UserUser123");
        vehiclesPage.navigateTo("Fleet", "Vehicles Odometer");
        BrowserUtils.wait(4);
    }

}
