package com.tricentis.demo.pages;

import com.tricentis.demo.utilities.Utility;
import org.openqa.selenium.By;

public class SmartPhonePage extends Utility {

    By smartphoneText = By.xpath("//h1[contains(text(),'Smartphone')]");
    By priceText = By.xpath("//span[contains(text(),'100.00')]");
    By changeQty = By.xpath("//input[@id='addtocart_43_EnteredQuantity']");
    By addToCart = By.xpath("//input[@id='add-to-cart-button-43']");
    By messageFoeVerifyText = By.xpath("//p[@class='content']");
    By crossButton = By.xpath("//span[@title='Close']");
    By mouseHoverClick = By.xpath("//span[contains(text(),'Shopping cart')]");
    By goToCart = By.xpath("//h1[normalize-space()='Shopping cart']");




    public String verifyTextSmartPhone(){
        return getTextFromElement(smartphoneText);
    }
    public String verifyThePrice(){
        return  getTextFromElement(priceText);
    }
    public void clearTheQty(){
        driver.findElement(changeQty).clear();
    }
    public void changeTheQtyy(){
        sendTextToElement(changeQty,"2");
    }
    public void addToCartButton() {
        clickOnElement(addToCart);
    }
    public String verifyTheMessage(){
        return getTextFromElement(messageFoeVerifyText);
    }
    public void clickOnCrossButton(){
        clickOnElement(crossButton);
    }
    public void mouseHoveOnShoppingCartAndClick(){
        mouseHoverToElementAndClick(mouseHoverClick);
    }
    public String verifyTheShoppingCart() {
        return getTextFromElement(goToCart);
    }
}
