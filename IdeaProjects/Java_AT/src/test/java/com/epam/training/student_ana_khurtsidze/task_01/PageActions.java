package com.epam.training.student_ana_khurtsidze.task_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static java.lang.Thread.sleep;

public class PageActions extends PageObjects{

    WebDriver driver;
    WebDriverWait wait;


    public PageActions(WebDriver driver1){driver=driver1;}

    public void enterText(String value){
        driver.findElement(textAreaField).sendKeys(value);
    }

    public void choosePasteExpiration()  {
//        driver.findElement(pasteExpirationDropdown).click();
//        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        List<WebElement> pasteExpOption = driver.findElements(pasteExpirationDropdown);
//
//        for(WebElement option :pasteExpOption){
//            if(option.getText().equals("10 Minutes")){
//                option.click();
//                System.out.println(option.getText());
//                return;
//            }
//        }

        driver.findElement(pasteExpirationDropdown).click();

        // Wait until the dropdown options are visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement tenMinutesOption = wait.until(ExpectedConditions.visibilityOfElementLocated(pasteExpirationOption));
        tenMinutesOption.click();

    }

    public void enterPasteName(String name){
        driver.findElement(pasteName).sendKeys(name);
    }

    public void submitPaste(){
        driver.findElement(submitButton).click();
    }

}
