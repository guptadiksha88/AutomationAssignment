package com.qa.web.pages;

import static com.qa.web.utils.TestUtil.click;
import static com.qa.web.utils.TestUtil.clickAt;
import static com.qa.web.utils.TestUtil.type;
import static com.qa.web.utils.TestUtil.switchframe;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.web.base.TestBase;



public class SelectablePage extends TestBase {

    
    @FindBy(xpath = "//a[contains(text(),'Selectable')]")
    private WebElement selectable;

    @FindBy(xpath = "//li[contains(text(),'Item 1')]")
    private WebElement Item1;

    @FindBy(xpath = "//li[contains(text(),'Item 3')]")
    private WebElement Item3;

    @FindBy(xpath = "//li[contains(text(),'Item 7')]")
    private WebElement Item7;

   
    public SelectablePage() {
        PageFactory.initElements(driver, this);
    }

    public void selectSelectableInteraction() {
    	clickAt(driver,selectable);
    }


    public void selectOptions() {
    	switchframe();
        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL);
        Item1.click();
        Item3.click();
        Item7.click();
        action.build().perform();

    }
}
   