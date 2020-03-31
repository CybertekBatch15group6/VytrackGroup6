package com.automation.pages.t4_Sales;

import com.automation.pages.AbstractPageBase;
import com.automation.pages.LoginPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpportunitiesPage extends AbstractPageBase {

    @FindBy(partialLinkText = "Create Opportunity")
    private WebElement createOpportunity;

    public void createOpportunity(){

        wait.until(ExpectedConditions.elementToBeClickable(createOpportunity)).click();

        System.out.println("DONE!");
    }
}
