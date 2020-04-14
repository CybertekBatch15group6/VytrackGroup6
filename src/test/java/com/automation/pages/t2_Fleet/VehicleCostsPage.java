
package com.automation.pages.t2_Fleet;
import com.automation.pages.*;
import com.automation.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
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
    @FindBy(xpath="//tbody//tr[1]//td[4]")
    private WebElement selectionOption;

    @FindBy(css = "//table[@class='grid table-hover table table-bordered table-condensed']//tbody//tr[2]//a[@title='Delete']")
    private WebElement deleteBtn;
    //table[@class='grid table-hover table table-bordered table-condensed']//tbody//tr[2]//a[@title='Delete']
    @FindBy (xpath = "//td[contains(text(),'Summer tires')]")
    private WebElement clicksummerTires;


    @FindBy(xpath = "//a[contains(text(),'Add attachment')]")
    private WebElement clickAddAttachment;

    @FindBy(xpath = "//span[text()='Add attachment']")
    private WebElement attachementTitle;
//body[@class='desktop-version lang-en']/div[@id='page']/div[@class='app-page__content']/div[@class='app-page__main']/div[@id='central-panel']/div[@id='container']/div[@id='grid-custom-entity-grid-515156839']/div[@class='oro-datagrid']/div[@class='other-scroll-container']/div[@class='grid-scrollable-container']/div[@class='grid-container']/table[@class='grid table-hover table table-bordered table-condensed']/tbody[@class='grid-body']/tr[1]/td[4]/div[1]/div[1]/a[1]

    public void setDeleteBtn(){
        BrowserUtils.waitForPageToLoad(7);
        Actions actions = new Actions(driver);

        BrowserUtils.wait(3);

        actions.moveToElement(selectionOption).perform();
        BrowserUtils.wait(3);

        actions.click(deleteBtn).build().perform();

//=====================================
//        actions.moveToElement(selectionOption).
//                pause(2000).
//                click(deleteBtn).
//                pause(2000).
//                build().perform();
       wait.until(ExpectedConditions.elementToBeClickable(selectionOption)).click();
       BrowserUtils.wait(3);


    }
    public String verifyAttachmentTitle(){
        BrowserUtils.wait(5);
        return attachementTitle.getText();
    }
//    WebElement upload1 = Driver.getDriver().findElement(By.xpath("//span[text()='Add attachment']"));
//    String checkTitile = "Add Attachment";
//        BrowserUtils.wait(5);


    public void clickAttachment(){
        BrowserUtils.waitForPageToLoad(10);
        wait.until(ExpectedConditions.elementToBeClickable(clickAddAttachment)).click();

    }

    public void clickTheSummerTires(){
        BrowserUtils.waitForPageToLoad(10);
        wait.until(ExpectedConditions.elementToBeClickable(clicksummerTires)).click();

    }

    public String getCreatePname(){
        return getCreatePageName.getText();
    }

    public void clickCreateVehicleCost(){
        BrowserUtils.waitForPageToLoad(20);
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
