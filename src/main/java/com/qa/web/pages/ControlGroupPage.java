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



public class ControlGroupPage extends TestBase {

    @FindBy(xpath = "//a[contains(text(),'Controlgroup')]")
    private WebElement controlGroup;


    @FindBy(xpath = "//span[@id=\"car-type-button\"]")
    private WebElement rentalCar1;

    @FindBy(xpath = "//span[@id=\"ui-id-8-button\"]")
    private WebElement rentalCar2;

    @FindBy(xpath = "//div[contains(text(),\"SUV\") and @id=\"ui-id-4\"]")
    private WebElement SUV;

    @FindBy(xpath = "//div[contains(text(),\"Truck\") and @id=\"ui-id-14\"]")
    private WebElement Truck;


    @FindBy(xpath = "//span[@class=\"ui-checkboxradio-icon ui-corner-all ui-icon ui-icon-background ui-icon-blank\"]//parent::label[@for=\"transmission-automatic\"]")
    private WebElement suvAutomatic;

    @FindBy(xpath = "//label[@for=\"insurance\"]")
    private WebElement suvInsurance;

    @FindBy(xpath = "//label[@for=\"insurance-v\"]")
    private WebElement truckInsurance;

    @FindBy(xpath = "//input[@id=\"horizontal-spinner\"]")
    private WebElement numberOfSUV;

    @FindBy(xpath = "//input[@id='vertical-spinner']")
    private WebElement numberOfTrucks;

    @FindBy(xpath = "//span[@class=\"ui-checkboxradio-icon ui-corner-all ui-icon ui-icon-background ui-icon-blank\"]//parent::label[@for=\"transmission-standard-v\"]")
    private WebElement truckStandard;

    @FindBy(xpath = "//button[@id=\"book\"]")
    private WebElement bookNow;


    public ControlGroupPage() {
        PageFactory.initElements(driver, this);
    }

       public void selectWidget() {
    	clickAt(driver,controlGroup);
    	switchframe();
          }

    public void chooseSUV() {
    	click(rentalCar1);
    	click(SUV);
    	}

    public void chooseTruck() {
    	click(rentalCar2);
    	click(Truck);
    	}

    public void SUVDetails() {
    	click(suvAutomatic);
    	click(suvInsurance);
           type(numberOfSUV, "2");
    }

    public void TruckDetails() {
    	click(truckStandard);
    	click(truckInsurance);
    	type(numberOfTrucks,"1");
          }

    public void BookNow() {
    	click(bookNow);
         }


}
