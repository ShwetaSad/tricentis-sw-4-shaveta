package com.tricentis.demo.testsuite;

import com.tricentis.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {

    //1.1 create a method with the name "selectMenu" It has one parameter named "menu" of
    //type string
    //1.2 This method should click on the menu whatever name is passed as a parameter.

    public void selectMenu(String menu) {
        clickOnElement(By.linkText(menu));
    }

    //1.3. create the @Test method name verifyPageNavigation(). Use the selectMenu
    //method to select the Menu click on it and verify the page navigation.
    @Test
    public void verifyPageNavigation() {
        selectMenu("Books");

        String expectedText = "Books";
        String actualText = getTextFromElement(By.xpath("//h1[normalize-space()=\"Books\"]"));
        Assert.assertEquals(actualText,expectedText,"Wrong Page navigated!");

    }

}
