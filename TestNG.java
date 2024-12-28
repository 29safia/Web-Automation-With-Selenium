package com.batch;
import org.testng.annotations.*; // Import TestNG annotations

//This class demonstrates the use of various TestNG annotations to define the sequence of test execution.
public class TestNG {

    //This method is executed after the entire suite ends.
    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite");
    }

    @Test(priority = 1)
    public void test(){
        System.out.println("Test");
    }

    @Test(priority = 0)
    public void test2(){
        System.out.println("Test 2");
    }

    //This method is executed before the tests in the current class are executed.
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }

    //This method is executed after all the tests in the current class have been executed.
    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }

    //This method is executed before the entire suite starts.
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite");
    }

    //Runs once before any test methods in the current class.
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }

    //Runs once before any test methods in the current class.
    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }

    //Runs once before any test methods in the current class.
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }

    //Runs after each test method in the class.
    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }
}
