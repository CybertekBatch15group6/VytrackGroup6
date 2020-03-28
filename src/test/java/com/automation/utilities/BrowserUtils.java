package com.automation.utilities;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {

    public static void wait(int numOfSec){

        try{

            Thread.sleep(numOfSec*1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static List<String> getTextFromWebElements(List<WebElement> elements){

        List<String> textValues = new ArrayList<>();
        for(WebElement element: elements){
            textValues.add(element.getText());
        }
        return textValues;
    }
}
