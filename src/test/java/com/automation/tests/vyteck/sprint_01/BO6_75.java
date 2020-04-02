package com.automation.tests.vyteck.sprint_01;

import com.automation.pages.LoginPage;
import com.automation.pages.t2_Fleet.VehiclesModelPage;
import com.automation.tests.vyteck.AbstractTestBase;
import com.automation.utilities.BrowserUtils;
import com.automation.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Jordan Hankison
 *
 * User story :
 * As a authorized user I should be able to access Vehicle Model page
 *
 * Acceptance Criteria :
 * 1.Verify that only authorized user should be able to access Vehicle model page and see all
 * Vehicle modules (Note: Store manager,sales manager , admin)
 * 2.Verify that non authorized user should not be able to access Vehicle model page.
 * (Note: non authorized user = Truck driver)
 **/

public class BO6_75 extends AbstractTestBase {

    private String vehiclesModelTitle = "All - Vehicles Model - Entities - System - Car - Entities - System";

    /**
     * Verify that Store Manager user should be able to access Vehicle model page and should see the All Vehicles Table
     * */
    @Test
    public void verifyStoreManagerAccessAndVisibility(){
        LoginPage loginPage = new LoginPage();
        VehiclesModelPage vehiclesModelPage = new VehiclesModelPage();

        loginPage.login();
        vehiclesModelPage.navigateTo("Fleet", "Vehicles Model");
        BrowserUtils.waitForPageToLoad(10);
        Assert.assertEquals(Driver.getDriver().getTitle(), vehiclesModelTitle);
        Assert.assertTrue(vehiclesModelPage.getAllVehiclesTable().isDisplayed());


    }

    /**
     * Verify that Sales Manager user should be able to access Vehicle model page and should see the All Vehicles Table
     * */
    @Test
    public void verifySalesManagerAccessAndVisibility(){
        LoginPage loginPage = new LoginPage();
        VehiclesModelPage vehiclesModelPage = new VehiclesModelPage();


        loginPage.loginSalesManager();
        vehiclesModelPage.navigateTo("Fleet", "Vehicles Model");
        BrowserUtils.waitForPageToLoad(10);
        Assert.assertEquals(Driver.getDriver().getTitle(), vehiclesModelTitle);
        Assert.assertTrue(vehiclesModelPage.getAllVehiclesTable().isDisplayed());
    }


}
