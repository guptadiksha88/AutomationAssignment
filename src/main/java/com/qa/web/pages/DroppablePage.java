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



public class DroppablePage extends TestBase {

    @FindBy(xpath = "//a[contains(text(),'Droppable')]")
    private WebElement droppable;

    @FindBy(xpath = "//*[@id='draggable']")
    private WebElement dragElement;

    @FindBy(xpath = "//*[@id='droppable']")
    private WebElement dropElement;

       public DroppablePage() {
        PageFactory.initElements(driver, this);
    }


    public void selectDroppableInteraction() {
    	clickAt(driver,droppable);

    }
     public void performDragAndDrop() {

    	switchframe();
        Actions action = new Actions(driver);
        action.clickAndHold(dragElement)
                .moveToElement(dropElement)
                .release()
                .build().perform();

    }

}