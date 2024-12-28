package com.batch;

import io.github.bonigarcia.wdm.WebDriverManager; // Import WebDriverManager for managing browser drivers
import org.openqa.selenium.WebDriver; // Import WebDriver interface for controlling the browser
import org.openqa.selenium.chrome.ChromeDriver; // Import ChromeDriver for running tests on Google Chrome
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//This class handles browser operations like opening, navigating to a URL, and closing the browser using Selenium WebDriver.

public class Browser_Handling {

    // Declare a WebDriver instance to control the browser

    WebDriver driver;

    @BeforeSuite
    //This method initializes the Chrome browser and maximizes the browser window.

    public void startChromeBrowser() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    // This method navigates to a specific URL and waits for a few seconds.

    public void openURL() throws InterruptedException {

        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        Thread.sleep(15000);
    }

    @AfterSuite
    // This method closes the Chrome browser.

    public void closeChromeBrowser() {

        driver.close();
    }
}
