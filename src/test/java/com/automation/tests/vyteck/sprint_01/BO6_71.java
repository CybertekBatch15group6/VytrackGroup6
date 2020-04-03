package com.automation.tests.vyteck.sprint_01;
import com.automation.pages.AbstractPageBase;
import com.automation.pages.LoginPage;
import com.automation.pages.t2_Fleet.VehicleCostsPage;
import com.automation.tests.vyteck.AbstractTestBase;
import com.automation.utilities.BrowserUtils;
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

    AbstractPageBase abstractPageBase = new AbstractPageBase();

    @Test
    public void LoginWithTrackDriver(){
        LoginPage loginPage = new LoginPage();
        loginPage.login("user15","UserUser123");
        BrowserUtils.wait(3);

    }


    @Test
    public void getVehicleCoastPage(){
      LoginWithTrackDriver();
      BrowserUtils.wait(3);

      abstractPageBase.navigateTo("Fleet","Vehicle Costs");

    }
}
