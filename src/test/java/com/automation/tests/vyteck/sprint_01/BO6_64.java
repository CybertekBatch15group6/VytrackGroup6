
package com.automation.tests.vyteck.sprint_01;
import com.automation.pages.*;
import com.automation.pages.t2_Fleet.*;
import com.automation.tests.vyteck.*;
import org.testng.annotations.*;
import java.util.*;
import static org.testng.Assert.*;

public class BO6_64 extends AbstractTestBase {

  /* As A Store Manager Or Sales Manager I Should Be Able To Access Vehicle Costs Page
    1.Verify That Store Manager Or Sales Manager Should Be Able To See Cost Information Of All Vehicles On The Vehicle Costs Page.
    2. Verify That Store Manager Or Sales Manager Should Be Able To Create Vehicle
    Cost Or Cancel It.
    3.Verify That Store Manager Or Sales Manager Should Be Able To Delete Or Edit The Costs.
    4.Verify That Store Manager Or Sales Manager Should Be Able To Do More Actions
    (Add Attachment, Add Note, Add Event)
    5.Verify That Store Manager Or Sales Manager Should Be Able To Reset The Grid
    By Click On Grit Setting.*/
   
    @Test(description = "User Story: 64")
    public void verifyAccessToVehicleCostsPage() {

        LoginPage login = new LoginPage();
        VehicleCostsPage page = new VehicleCostsPage();

        login.login();
        page.navigateTo("Fleet", "Vehicle Costs");

        String actual = page.getVehicleCostsPageText();
        String expected = "Vehicle Costs";

        assertEquals(actual, expected);
    }

    @Test(description = "User Story: 64")
    public void verifyVehicleCostsCreation() {

        LoginPage login = new LoginPage();
        VehicleCostsPage page = new VehicleCostsPage();

        login.login();
        page.navigateTo("Fleet", "Vehicle Costs");
        page.clickToCreate();
        page.submit();

        List<String> expected = Arrays.asList("Road Assistance", "$1,000.00", "Apr 2, 2020", "Flat Tire");
        assertEquals(page.actual(), expected);
    }
}
