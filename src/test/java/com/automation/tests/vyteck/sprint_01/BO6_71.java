package com.automation.tests.vyteck.sprint_01;
import com.automation.pages.AbstractPageBase;
import com.automation.pages.LoginPage;
import com.automation.pages.t2_Fleet.VehicleCostsPage;
import com.automation.tests.vyteck.AbstractTestBase;
import com.automation.utilities.BrowserUtils;
import com.automation.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BO6_71 extends AbstractTestBase {

    /*  Alex
1.Verify that truck driver should be able to see all cars' cost informations on the Vehicle Costs
page.
2.Verify that truck driver should be able to create Vehicle cost an cancel it.
3.Verify that truck driver should be able to edit or delet Vehicle cost
4. Verify that truck driver should be able to add Attachement on General information
page by click on any of the car on the grid.
5.Verify that truck driver should be able to Add Event
6.Verify that truck driver should be able to reset the grid by click on Grit setting"
     */

    LoginPage loginPage = new LoginPage();
    VehicleCostsPage vehicleCostsPage = new VehicleCostsPage();

    @Test
    public void LoginWithTrackDriver(){
        loginPage.loginDriver();
        //LoginPage loginPage = new LoginPage();
        //loginPage.login("user15","UserUser123");
        BrowserUtils.waitForPageToLoad(9);
    }

    @Test
    public void getVehicleCoastPage(){
      //LoginWithTrackDriver();
        loginPage.loginDriver();
      BrowserUtils.wait(3);
        //VehicleCostsPage page = new VehicleCostsPage();

      vehicleCostsPage.navigateTo("Fleet","Vehicle Costs");
      BrowserUtils.waitForPageToLoad(5);

      String expactedReult ="Vehicle Costs - Entities - System - Car - Entities - System";
      String actual = Driver.getDriver().getTitle();
        BrowserUtils.wait(3);
        Assert.assertEquals(actual,expactedReult);

    }

    @Test
    public void clickCreateVhiclePage(){
      loginPage.loginDriver();
        BrowserUtils.wait(3);
        //VehicleCostsPage page = new VehicleCostsPage();
        vehicleCostsPage.navigateTo("Fleet","Vehicle Costs");
       vehicleCostsPage.clickCreateVehicleCost();
        BrowserUtils.wait(9);
        //BrowserUtils.waitForPageToLoad(15);

        String expacted= "Create Vehicle Costs";
        Assert.assertEquals(vehicleCostsPage.getCreatePname(),expacted,"not match");

    }

    @Test
    public void editCostPage(){
        loginPage.loginDriver();
        BrowserUtils.wait(3);
        //VehicleCostsPage page = new VehicleCostsPage();
        vehicleCostsPage.navigateTo("Fleet","Vehicle Costs");
        vehicleCostsPage.clickEdit();



    }

}
