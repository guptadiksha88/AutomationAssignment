package com.qa.web.test;

import com.qa.web.base.TestBase;
import com.qa.web.pages.ControlGroupPage;

import io.appium.java_client.PerformsActions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ControlGroupTest extends TestBase {

//3rd Test case
	ControlGroupPage pageActions;

    public ControlGroupTest() {
        super();

    }

    @BeforeMethod
    public void setup() {
        Initialization();
        pageActions = new ControlGroupPage();
    }


    @Test
    public void performaction() {
        pageActions.selectWidget();
        pageActions.chooseSUV();
        pageActions.SUVDetails();
        pageActions.chooseTruck();
        pageActions.TruckDetails();
        pageActions.BookNow();

    }


    @AfterMethod
    public void teardown() {
        driver.close();
    }

}
