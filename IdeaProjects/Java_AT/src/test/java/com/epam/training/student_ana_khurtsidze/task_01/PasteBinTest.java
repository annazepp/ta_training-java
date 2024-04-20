package com.epam.training.student_ana_khurtsidze.task_01;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PasteBinTest extends BrowserActions{


    String pasteValue = "Hello from WebDriver";
    String pasteName = "helloweb";


    @Test
    public void pasteTest() {
        PageActions obj = new PageActions(driver);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        obj.enterText(pasteValue);

        js.executeScript("window.scrollBy(0,250)", "");
        obj.choosePasteExpiration();
        obj.enterPasteName(pasteName);
        js.executeScript("window.scrollBy(0,250)", "");

        obj.submitPaste();
    }
}
