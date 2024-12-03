package com.tricentis.demo.pages;

import com.tricentis.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CellPhonePage extends Utility {

    By CellPhoneText = By.xpath("//h1[normalize-space()='Cell phones']");
    By View = By.xpath("//select[@id='products-viewmode']");
    By smartPhoneLink = By.xpath("//a[contains(text(),'Smartphone')]");


    public String getCellPhoneText() {
        return getTextFromElement(CellPhoneText);
    }

    public void selectViewAsList() {
        selectByVisibleTextFromDropDown(View, "List");
    }

    public void clickOnSmartPhoneLink() {
        clickOnElement(smartPhoneLink);
    }
}