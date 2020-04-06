
package com.automation.pages.t2_Fleet;
import com.automation.pages.*;
import com.automation.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;
import java.util.*;

public class VehicleCostsPage extends AbstractPageBase {

    @FindBy(xpath = "(//h1)[2]")
    private WebElement allVehicleCosts;

    @FindBy(css = "[title$='Costs']")
    private WebElement createCost;

    @FindBy(css = "[class='controls'] a")
    private WebElement value;

    @FindBy(xpath = "//ul[2]/li[1]")
    private WebElement road;

    @FindBy(css = "[id*='TotalPrice']")
    private WebElement price;

    @FindBy(css = "[id^='date_']")
    private WebElement date;

    @FindBy(css = "[class*='month']")
    private WebElement month;

    @FindBy(xpath = "//tr[1]/td[5]")
    private WebElement day;

    @FindBy(css = "[id*='Descriptions']")
    private WebElement description;

    @FindBy(css = "[class='row'] div>button")
    private WebElement button;

    @FindBy(xpath = "//h5/../div/div/div")
    private List<WebElement> inputs;
    
    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    private WebElement TrackDriverVehicleCostPage;

    @FindBy(linkText= "Create Vehicle Costs")
    private WebElement CreateVehicleCostPage;

    @FindBy(xpath = "//h1[@class='user-name']")
    private WebElement getCreatePageName;

    @FindBy (xpath = "//tbody//tr/td//div//div//ul//li//ul/li[2]//a[1]")
    private WebElement clickEdit;

    public void clickEdit(){
        BrowserUtils.waitForPageToLoad(7);
        wait.until(ExpectedConditions.elementToBeClickable(clickEdit)).click();

    }

    public String getCreatePname(){
        return getCreatePageName.getText();
    }

    public void clickCreateVehicleCost(){
        BrowserUtils.waitForPageToLoad(6);
        wait.until(ExpectedConditions.elementToBeClickable(CreateVehicleCostPage)).click();
    }


    public String getVehicleCostsPageText() {
        BrowserUtils.waitForPageToLoad(6);
        wait.until(ExpectedConditions.visibilityOf(allVehicleCosts));
        return allVehicleCosts.getText().trim();
    }

    public void clickToCreate() {
        BrowserUtils.waitForPageToLoad(6);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader-mask shown")));
        wait.until(ExpectedConditions.elementToBeClickable(createCost)).click();

    }

    public void chooseValue() {
        BrowserUtils.wait(1);
        value.click();
    }

    public void selectType() {
        BrowserUtils.wait(1);
        road.click();
    }

    public void enterPrice() {
        BrowserUtils.wait(1);
        price.sendKeys("1000");
    }

    public void enterDate() {
        BrowserUtils.wait(1);
        date.click();
        BrowserUtils.wait(2);
        new Select(month).selectByIndex(3);
        BrowserUtils.wait(1);
        day.click();
    }

    public void enterDescription() {
        BrowserUtils.wait(1);
        description.sendKeys("Flat Tire");
    }

    public void submit() {
        chooseValue();
        selectType();
        enterPrice();
        enterDate();
        enterDescription();
        BrowserUtils.wait(1);
        button.click();
    }

    public List<String> actual() {
       BrowserUtils.wait(2);
        List<String> list = new ArrayList<>();
        for (WebElement each : inputs) {
            if(!each.getText().trim().equals("N/A")){
                list.add(each.getText());
            }
        }
      return list;
    }
}
