package com.automation.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {


    /**
     * causes code to wait a number of seconds based on the param
     * @param numOfSec number of seconds you want the code to wait*/
    public static void wait(int numOfSec){
        try{

            Thread.sleep(numOfSec*1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    /**
     * outputs a list of Strings based on the texts from a list WebElements
     *
     * @param elements input list of WebElements that the method will pull the
     * text from (if it exists)
     **/
    public static List<String> getTextFromWebElements(List<WebElement> elements){

        List<String> textValues = new ArrayList<>();
        for(WebElement element: elements){
            if(!element.getText().isEmpty()) {
                textValues.add(element.getText());
            }
        }
        return textValues;
    }

    /**
     * waits for background processes in the browser to complete
     * @param timeOutInSeconds, This param is the time you are willing to wait for the page to complete it's processes
     */
    public static void waitForPageToLoad (long timeOutInSeconds){
        ExpectedCondition<Boolean> expectation = driver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
        try{
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeOutInSeconds);
            wait.until(expectation);
        }catch(Throwable error){
            error.printStackTrace();
        }
    }
}
