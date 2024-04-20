package com.epam.training.student_ana_khurtsidze.task_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class BrowserActions {

    public static WebDriver driver;

    @BeforeClass
    public void openBrows(){
        driver = new ChromeDriver();


        driver.manage().window().maximize();
        driver.get("https://pastebin.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }


    @AfterClass
    public void closeBrows(){
        driver.quit();
    }

}
