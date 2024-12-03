package com.tricentis.demo.pages;

import com.tricentis.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCart extends Utility {
    By shoppingcarttext = By.xpath("//h1[normalize-space()='Shopping cart']");
    By inputqty = By.xpath("//input[contains(@name,'itemquantity')]");
    By updatCart = By.xpath("//input[@name='updatecart']");
    By actualTotal = By.xpath("//span[@class='product-subtotal']");
    By termsandCond = By.id("termsofservice");
    By checkout = By.xpath("//button[@id='checkout']");

  //------------------------------------------------------------------------------------------------

    By changeQty2 = By.xpath("//td[@class='qty nobr']/input");
    By updateTheCart = By.xpath("//input[@name='updatecart']");
    By termsOfService = By.xpath("//input[@id='termsofservice']");
    By checkOutTab = By.id("checkout");
    By welcomeText = By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']");
    By registerClick = By.xpath("//body/div[4]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/input[2]");













    public String getActualText() {
        return getTextFromElement(shoppingcarttext);
    }

    public void clearqyty(){
        driver.findElement(inputqty).clear();
    }

    public void changeQuantityTotwo() {

        sendTextToElement(inputqty, "2");
        clickOnElement(updatCart);

    }

    public String actualTotal() {
        return getTextFromElement(actualTotal);
    }

    public void acceptTermsandConditions() {
        clickOnElement(termsandCond);
    }

    public void clickOnCheckout() {
        clickOnElement(checkout);
    }

    //---------------------------------------------------------------------------------------
    public void changeTheQuan(){
        driver.findElement(changeQty2).clear();
        sendTextToElement(changeQty2,"2");
    }
    public void clickOnUpdateShoppingCart(){
        clickOnElement(updateTheCart);
    }
    public void clickOnTheCheckbox(){
        clickOnElement(termsOfService);
    }
    public void clickOnCheckOut(){
        clickOnElement(checkOutTab);
    }
    public String verifyTheWelcomeText(){
        return getTextFromElement(welcomeText);
    }
    public void clickOnRegisterTab() {
        clickOnElement(registerClick);
    }
}
