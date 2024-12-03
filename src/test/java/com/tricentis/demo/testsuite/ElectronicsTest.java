package com.tricentis.demo.testsuite;

import com.tricentis.demo.pages.*;
import com.tricentis.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends BaseTest {
    HomePage homePage = new HomePage();
    CellPhonePage cellPhonePage = new CellPhonePage();
    SmartPhonePage smartPhonePage = new SmartPhonePage();
    ShoppingCart shoppingCart = new ShoppingCart();
    RegisterPage registerPage = new RegisterPage();
    CheckoutPage checkoutPage = new CheckoutPage();

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {


        //1.1 Mouse Hover on the “ELECTRONICS” Tab
        homePage.MouseHoverOnElectronics();

        //1.2 Mouse Hover on the “Cell phones” and click
        homePage.clickOnCellPhones();

        //1.3 Verify the text “Cell phones”
        Assert.assertEquals(cellPhonePage.getCellPhoneText(), "Cell phones", "Wrong page");
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() {

        //2.1 Mouse Hover on the “ELECTRONICS” Tab
        homePage.MouseHoverOnElectronics();
        //2.2 Mouse Hover on the “Cell phones” and click
        homePage.clickOnCellPhones();
        //2.3 Verify the text “Cell phones”
        Assert.assertEquals(cellPhonePage.getCellPhoneText(), "Cell phones", "Wrong page");

        //2.4 Select View as option ‘List’
        cellPhonePage.selectViewAsList();
        //2.5 Click on the product name “Smartphone” link
        cellPhonePage.clickOnSmartPhoneLink();

        //2.6 Verify the text “Smartphone”
        Assert.assertEquals(smartPhonePage.verifyTextSmartPhone(), "Smartphone", "Wrong Text");

        //2.7 Verify the price “100.00”
        Assert.assertEquals(smartPhonePage.verifyThePrice(), "100.00", "Wrong Price");

        //2.8 Change the quantity to 2
        smartPhonePage.clearTheQty();
        smartPhonePage.changeTheQtyy();

        //2.9 Click on the “Add to cart” tab
        smartPhonePage.addToCartButton();

        //2.10 Verify the Message "The product has been added to your shopping cart" on
        //Top green Bar
        Assert.assertEquals(smartPhonePage.verifyTheMessage(), "The product has been added to your shopping cart", "invalid message");

        //2.11 After that close the bar by clicking on the cross button.
        smartPhonePage.clickOnCrossButton();

        //2.12 Then MouseHover on "Shopping cart" and click on the "Go to cart" button.
        smartPhonePage.mouseHoveOnShoppingCartAndClick();

        //2.13 Verify the message "Shopping cart"
        Assert.assertEquals(smartPhonePage.verifyTheShoppingCart(), "Shopping cart", "Wrong Page");

        //2.14 Verify the quantity is 2
        shoppingCart.changeTheQuan();
        //2.15 Verify the Total “200.00”

        //2.16 click on the checkbox “I agree with the terms of service”
        shoppingCart.clickOnTheCheckbox();

        //2.17 Click on the “Checkout” button
        shoppingCart.clickOnCheckOut();

        //2.18 Verify the Text “Welcome, Please Sign In!”
        shoppingCart.verifyTheWelcomeText();

        //2.19 Click on the “Register” tab
        shoppingCart.clickOnRegisterTab();

        //2.20 Verify the text “Register”
        Assert.assertEquals(registerPage.registerPageTitle(), "Register", "Wrong Page");

        //2.21 Select the Male radio button
        registerPage.clickOnGender();

        //2.22 Enter the First name
        registerPage.enterFirstName("shaveta");

        //2.23 Enter the Last name
        registerPage.enterLastName("Sethi");
        //2.24 Enter the Email
        registerPage.enterEmailAddress("shavsss@gmail.com");
        //2.25 Enter the Password
        registerPage.enterPassword("prime123");
        //2.26 Enter the Confirm password
        registerPage.enterConfirmPassword("prime123");
        //2.27 Click on the “Register” button
        registerPage.clickOnRegisterButton();
        //2.28 Verify the message “Your registration completed”
        Assert.assertEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed",
                "Register completed title mismatch!");
        //2.29 Click on the “Continue” button
        registerPage.clickOnContinueButton();
        //2.30 Verify the text “Shopping cart”
        Assert.assertEquals(shoppingCart.getActualText(), "Shopping cart", "Wrong Page");
        //2.31 click on the checkbox “I agree with the terms of service”
        shoppingCart.acceptTermsandConditions();
        //2.32 Click on the “Checkout”
        shoppingCart.clickOnCheckOut();

        //2.33 Select the Country “United Kingdom” using the select class
        checkoutPage.SelectCountry();
        //2.34 Enter the city
        checkoutPage.enterCity("Reading");
        //2.35 Enter the Address1
        checkoutPage.enterAddress("1,LythamClose");
        //2.36 Enter the Zip/Postal code
        checkoutPage.enterZipcode("400101");
        //2.37 Enter the Phone number
        checkoutPage.enterPhoneNumber("757647647");
        //2.38 Click on the “Continue” button
        checkoutPage.clickonContinue();
        //2.39 Click on the “Continue” button
        checkoutPage.clickonContinueagain();
        //2.40 Click on the Radio Button “2nd Day Air ($0.00)”
        checkoutPage.setTwoNdDayAir();
        //2.41 Click on the “Continue” button
        checkoutPage.clickOnContinue1();
        //2.42 Select the Radio Button “Credit Card”
        checkoutPage.clickOnCreditCardButton();
        //2.43 Click on the “Continue” button
        checkoutPage.ClickonContinue();
        //2.44 Select the “Visa” From Select credit card dropdown
        checkoutPage.enterCreditCardType("Visa");
        //2.45 Enter the Cardholder's name
        checkoutPage.enterCardHolderName("Shaveta");
        //2.46 Enter the Card number
        checkoutPage.enterCardNumber("5451628062666699");
        //2.47 Select the Expiration date using the select class
        checkoutPage.selectExpiryMonth();
        //2.48 Enter the Card code
        checkoutPage.enterCardCode("234");
        //2.49 Click on the “Continue” button
        checkoutPage.clickOnConitnue();
        //2.50 Verify the “Payment Method” is “Credit Card”
        Assert.assertEquals(checkoutPage.paymentMethod(), "Credit Card", "wrong method");
        //2.51 Verify the “Shipping Method” is “2nd Day Air”
        Assert.assertEquals(checkoutPage.shippingMethod(), "2nd Day Air", "wrong method");
        //2.52 Verify the Total is “200.00”

        //2.53 Click on the “Confirm” button
        checkoutPage.clickOnConfirm();
        //2.54 Verify the Text “Thank You”
        Assert.assertEquals(checkoutPage.thankYouText(), "Thank you", "Incorrect Text");
        //2.55 Verify the message “Your order has been successfully processed!”
        Assert.assertEquals(checkoutPage.successfullyProcessedText(), "Your order has been successfully processed!", "Order not processed Successfully");
        //2.56 Click on the “Continue” button
        checkoutPage.clickOnFinalContinue();
        //2.57 Verify the text “Welcome to our store”
        Assert.assertEquals(checkoutPage.getStoreText(), "Welcome to our store", "Incorrect Page");
        //2.58 Click on the “Logout” link
        homePage.clickOnLogOutButton();
        Assert.assertTrue(homePage.getCurrentUrl().contains("https://demowebshop.tricentis.com"),
                "Url is not match!");

        //2.59 Verify the URL is “https://demowebshop.tricentis.com/”


    }

}
