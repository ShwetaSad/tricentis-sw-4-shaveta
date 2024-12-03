package com.tricentis.demo.pages;

import com.tricentis.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DesktopPage extends Utility {

    By dropdownZToA = By.xpath("//select[@id=\"products-orderby\"]");
    By dropdownAToZ = By.xpath("//select[@id=\"products-orderby\"]");
    By product = By.xpath("//h2[@class='product-title']/a");
    By addcart = By.linkText("Build your own computer");
    By BYOC = By.xpath("//h1[@itemprop=\"name\"]");
    By dualcore = By.id("product_attribute_16_5_4");
    By gb = By.id("product_attribute_16_6_5");
    By radioButton = By.xpath("//input[@id='product_attribute_16_3_6_19']");
    By osRadioButton = By.id("product_attribute_16_4_7_21");
    By microsoftoffice = By.id("product_attribute_16_8_8_22");
    By totalCommander = By.id("product_attribute_16_8_8_24");
    By actualPrice = By.xpath("//span[@class='price-value-16']");
    By addToCart = By.id("add-to-cart-button-16");
    By itemaddMesg = By.xpath("//p[@class='content']");
    By crossButton = By.xpath("//span[@title='Close']");
    By shoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    By cart = By.xpath("//input[@value='Go to cart']");


    public void sortyByPositionZToA() {
        selectByVisibleTextFromDropDown(dropdownZToA, "Name: Z to A");

    }

    public void sortyByPositionAToZ() {
        selectByVisibleTextFromDropDown(dropdownAToZ, "Name: A to Z");

    }

    public List<WebElement> listOfProducts() {
        return driver.findElements(product);

    }

    public void clickOnAddtoCart() {
        clickOnElement(addcart);
    }

    public String textonPage() {
        return getTextFromElement(BYOC);
    }

    public void selectIntelPentiumDualCoreE2200() {
        selectByVisibleTextFromDropDown(dualcore, "2.2 GHz Intel Pentium Dual-Core E2200");
    }

    public void select8GB() {
        selectByVisibleTextFromDropDown(gb, "8GB [+60.00]");
    }

    public void clickOnHDDRadioButton() {
        clickOnElement(radioButton);
    }

    public void clickOnOSRadioButton() {
        clickOnElement(osRadioButton);
    }

    public void clickOnMicrosoftOfficeAndTotalCommanderCheckbox() {
        clickOnElement(totalCommander);
        clickOnElement(microsoftoffice);
    }

    public String actualPrice() {
        return getTextFromElement(actualPrice);
    }

    public void addTOCart() {
        clickOnElement(addToCart);
    }

    public String actualMessage() {
        return getTextFromElement(itemaddMesg);
    }

    public void clickONCrossButton() {
        clickOnElement(crossButton);
    }

    public void ClickOnShoppingCartAndGoTOCart() {
        mouseHoverToElement(shoppingCart);
        clickOnElement(cart);
    }


}