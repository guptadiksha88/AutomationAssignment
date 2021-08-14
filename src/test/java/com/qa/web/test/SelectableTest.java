package com.qa.web.test;

import com.qa.web.base.TestBase;
import com.qa.web.pages.SelectablePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectableTest extends TestBase {

//2nd Test
	SelectablePage pageActions;
    public SelectableTest() {
        super();
    }

    @BeforeMethod
    public void setup() {
        Initialization();
        pageActions = new SelectablePage();
    }

    @Test
    public void selectItems() {
        pageActions.selectSelectableInteraction();
        pageActions.selectOptions();
    }

    @AfterMethod
    public void teardown() {
        driver.close();
    }

}
