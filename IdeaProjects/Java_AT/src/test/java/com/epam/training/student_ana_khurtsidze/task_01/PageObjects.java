package com.epam.training.student_ana_khurtsidze.task_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageObjects {


    protected By

    textAreaField = By.id("postform-text"),
            pasteName = By.id("postform-name"),
    submitButton = By.xpath("//button[text() = 'Create New Paste']"),
    pasteExpirationDropdown = By.xpath("//span[@id='select2-postform-expiration-container']"),

    pasteExpirationOption = By.xpath("//li[text()='10 Minutes']");


}
