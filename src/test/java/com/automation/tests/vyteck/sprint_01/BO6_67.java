package com.automation.tests.vyteck.sprint_01;

import com.automation.pages.LoginPage;
import com.automation.pages.t2_Fleet.VehiclesPage;
import com.automation.tests.vyteck.AbstractTestBase;
import com.automation.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;

public class BO6_67 extends AbstractTestBase {

/* OLGA
1.Verify that truck driver should be able to see all Vehicle information once navigate to Vehicle page.
2.Verify that when user click on any car on the grid , system should display general information
about the car
3.Verify that truck driver can add Event and it should display under Activity tab and General
information page as well .
4.Verify that Truck driver can reset the Grid by click on Grid setting"
*/


    @Test
    public void verifyAllVehicleInformation() {
        // 1.Verify that truck driver should be able to see all
        // Vehicle information once navigate to Vehicle page.

        LoginPage loginPage = new LoginPage();
        VehiclesPage vehiclesPage = new VehiclesPage();
        loginPage.login("user16", "UserUser123");
        vehiclesPage.navigateTo("Fleet", "Vehicles");
        BrowserUtils.wait(4);

        List<String> expected = Arrays.asList("LICENSE PLATE", "TAGS", "DRIVER", "LOCATION",
                "CHASSIS NUMBER", "MODEL YEAR", "LAST ODOMETER", "IMMATRICULATION DATE",
                "FIRST CONTRACT DATE", "CVVI", "SEATS NUMBER", "DOORS NUMBER", "COLOR",
                "TRANSMISSION", "FUEL TYPE", "CO2 EMISSIONS", "HORSEPOWER", "HORSEPOWER TAXATION", "POWER (KW)", "CVVI" );

        List<String> actual = vehiclesPage.getColumnNames();

        Assert.assertEquals(actual, expected);

        }

    }

