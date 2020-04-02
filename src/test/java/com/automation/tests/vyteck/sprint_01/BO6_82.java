package com.automation.tests.vyteck.sprint_01;

import com.automation.pages.LoginPage;
import com.automation.pages.t2_Fleet.VehicleServicesLogsPage;
import com.automation.tests.vyteck.AbstractTestBase;
import com.automation.utilities.BrowserUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class BO6_82 extends AbstractTestBase {


    // Samil
    //    USER STORY:
//
//    As a authorized user I should be able to access Vehicle Services Log
//
//    ACCEPTANCE CRITERIA:
//
//    1. Verify that authorized user should be able to access and see all Vehicle service log
//       (Note: authorized:Truck driver, admin)
//    2. Verify that non authorized user should Not be able to access Vehicle service log
//    (non authorize: Store manager, sales manager )

    LoginPage loginPage = new LoginPage();

    VehicleServicesLogsPage vehicleServicesLogsPage = new VehicleServicesLogsPage();

    @Test
    public void checkTextOfH1(){

        loginPage.login("user16","UserUser123");

        BrowserUtils.wait(4);
        vehicleServicesLogsPage.navigateTo("Fleet","Vehicle Services Logs");

        BrowserUtils.waitForPageToLoad(10);

        Assert.assertEquals(vehicleServicesLogsPage.textOfH1(),"VehicleServicesLogs");
        //VERIFY USER SHOULD BE ABLE TO SEE THIS ELEMENT

    }

    @Test
    public void tableVisibility(){

        loginPage.login("user16","UserUser123");
        BrowserUtils.wait(4);
        vehicleServicesLogsPage.navigateTo("Fleet","Vehicle Services Logs");
        BrowserUtils.waitForPageToLoad(10);
        Assert.assertTrue(vehicleServicesLogsPage.checkIfTableVisible());
        //VERIFY THAT SYSTEM DISPLAYS TABLE AND USER SHOULD BE ABLE TO SEE
    }

    @Test
    public void checkTextOfCreateVehicle(){

        loginPage.login("user16","UserUser123");
        BrowserUtils.wait(3);
        vehicleServicesLogsPage.navigateTo("Fleet","Vehicle Services Logs");
        BrowserUtils.waitForPageToLoad(10);
        Assert.assertEquals(vehicleServicesLogsPage.textOfCreateVehicle(),"Create Vehicle Services Logs");
        //VERIFY THAT USER SHOULD BE ABLE TO SEE CREATE_VEHICLE BUTTON
    }



}
