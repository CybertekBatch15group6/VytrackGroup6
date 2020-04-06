package com.automation.pages;

import com.automation.utilities.ConfigurationReader;
import com.automation.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(id = "prependedInput")
    private WebElement username;

    @FindBy(id = "prependedInput2")
    private WebElement password;

    @FindBy(id = "_submit")
    private WebElement login;

    @FindBy(linkText = "Forgot your password?")
    private WebElement forgotPassword;

    @FindBy(xpath = "//div[contains(text(),'Invalid user name or password.')]")
    private WebElement warningMessage;

    /**
     * Constructor
     * Instantiates PageFactory Class with Driver.getDriver and this Class as params
     * */
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    public String getWarningMessageText(){
        return warningMessage.getText();
    }

    /**
     * Method to login, version 1
     * login as a specific user
     * @param usernameValue
     * @param passwordValue
     */
    public void login(String usernameValue, String passwordValue){
        username.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);
    }

    /**
     * Method to login, version #2
     * login as a Store Manager user
     * Credentials will be retrieved from configuration.properties file
     */
    public void login(){
        username.sendKeys(ConfigurationReader.getProperty("store_manager"));
        password.sendKeys(ConfigurationReader.getProperty("manager_password"), Keys.ENTER);
    }


    /**
     * Method to login, version #3
     * login as a Sales Manager user
     * Credentials will be retrieved from configuration.properties file
     * */
    public void loginSalesManager(){
        username.sendKeys(ConfigurationReader.getProperty("sales_manager"));
        password.sendKeys(ConfigurationReader.getProperty("sales_passw"), Keys.ENTER);
    }

    /**
     * Method to login, version #4
     * login as a Truck Driver user
     * Credentials will be retrieved from configuration.properties file
     * */
    public void loginDriver(){
        username.sendKeys(ConfigurationReader.getProperty("Track_Driver"));
        password.sendKeys(ConfigurationReader.getProperty("Track_password"), Keys.ENTER);
    }



}
