package com.qa.web.test;

import com.qa.web.base.TestBase;
import com.qa.web.pages.DroppablePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DroppableTest extends TestBase {

//1st Test Case
	DroppablePage pageActions;

    public DroppableTest() {
        super();

    }


    @BeforeMethod
    public void setup() {
        Initialization();
        pageActions = new DroppablePage();
    }

    @Test
    public void dragAndDrop() {
        pageActions.selectDroppableInteraction();
        pageActions.performDragAndDrop();
    }


    @AfterMethod
    public void teardown() {
        driver.close();
    }

}
