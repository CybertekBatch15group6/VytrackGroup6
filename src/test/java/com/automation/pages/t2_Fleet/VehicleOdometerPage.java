package com.automation.pages.t2_Fleet;

import com.automation.pages.AbstractPageBase;
import com.automation.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class VehicleOdometerPage extends AbstractPageBase {

    @FindBy(xpath = "//div[@class='column-manager dropdown']//a[1]")
    private WebElement gridSettings;

    @FindBy(xpath = "//a[@class='pull-right']")
    private WebElement selectAll;

    @FindBy(className = "grid-header-cell__label")
    private List<WebElement> tableHeader;

    @FindBy(xpath = "//a[contains(@class,'btn main-group btn-primary pull-right')]")
    private WebElement createVehicleOdometer;

    @FindBy(xpath = "//a[contains(@class,'btn back icons-holder-text')]")
    private WebElement cancelBtn;

    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    private WebElement headerOfVehiclesOdometers;

    @FindBy(xpath="//tr[1]//td[7]//div[1]//div[1]//a")
    private WebElement selectionOption;

    @FindBy(xpath = "//a[@href='entity/view/Extend_Entity_VehiclesOdometer/item/426'] |//a[@title='Delete']")
    private WebElement deleteBtn;

    public void clickToSelectAllOnGridSettings(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        gridSettings.click();
        BrowserUtils.wait(3);
        wait.until(ExpectedConditions.elementToBeClickable(selectAll)).click();
    }

    public List<String> getTableHeader(){
        BrowserUtils.waitForPageToLoad(20);
        return BrowserUtils.getTextFromWebElements(tableHeader);
    }

    public void createAndCancelVehicleOdometer(){
        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(createVehicleOdometer)).click();
        BrowserUtils.waitForPageToLoad(10);
        wait.until(ExpectedConditions.elementToBeClickable(cancelBtn)).click();
        BrowserUtils.wait(3);

        String expectedHeaderText=headerOfVehiclesOdometers.getText();
        Assert.assertEquals("Vehicles Odometers", expectedHeaderText);
    }

    public void  deleteVehicleOdometer(){
        WebDriverWait wait = new WebDriverWait(driver, 10);

        Actions actions = new Actions(driver);
        actions.moveToElement(selectionOption).
                pause(5000).
                click(deleteBtn).
                pause(5000).
                build().perform();

        wait.until(ExpectedConditions.visibilityOf(deleteBtn));
        wait.until(ExpectedConditions.elementToBeClickable(deleteBtn));

    }

}
