package com.batch;

import io.github.bonigarcia.wdm.WebDriverManager; // Import WebDriverManager for managing browser drivers
import org.openqa.selenium.WebDriver; // Import WebDriver interface for controlling the browser
import org.openqa.selenium.chrome.ChromeDriver; // Import ChromeDriver for running tests on Chrome
import org.openqa.selenium.chrome.ChromeOptions; // Import ChromeOptions to configure Chrome browser settings
import org.testng.annotations.AfterSuite; // Import TestNG annotation to define a method that runs after all tests
import org.testng.annotations.BeforeSuite; // Import TestNG annotation to define a method that runs before all tests
import org.testng.annotations.Test; // Import TestNG annotation to define test methods

// This class demonstrates using Selenium WebDriver in headless mode to perform browser automation tasks.

public class Headless_Browser_Commands {

    // Declare a WebDriver instance to control the browser
    WebDriver driver;

    //  This method initializes the Chrome browser in headless mode before executing the test suite.

    @BeforeSuite
    public void startChromeBrowser() {
        // Set up ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Create an instance of ChromeOptions to configure Chrome settings
        ChromeOptions options = new ChromeOptions();

        // Add the argument to run the browser in headless mode
        options.addArguments("--headless=new");

        // Instantiate the ChromeDriver with the specified options
        driver = new ChromeDriver(options);

        // Maximize the browser window for optimal testing
        driver.manage().window().maximize();
    }

    // This test method navigates to a URL, retrieves the page title and URL, and prints them.

    @Test
    public void openURL() throws InterruptedException {
        // Navigate to the specified URL
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

        //Thread.sleep(7000);

        // Print the title of the current web page
        System.out.println("Page Title: " + driver.getTitle());

        // Print the current URL of the web page
        System.out.println("Current URL: " + driver.getCurrentUrl());
    }

    // This method closes the browser after the test suite execution is complete.
    @AfterSuite
    public void closeChromeBrowser() {
        // Close the browser window
        driver.close();
    }
}