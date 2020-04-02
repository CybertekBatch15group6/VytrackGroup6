package com.automation.tests.vyteck.sprint_01;

import com.automation.pages.LoginPage;
import com.automation.utilities.BrowserUtils;
import org.testng.annotations.Test;

public class BO6_84 {

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

    @Test
    public void LoginWithTrackDriver(){

        LoginPage loginPage = new LoginPage();
        loginPage.login("user16","UserUser123");
        BrowserUtils.wait(2);


    }
}
