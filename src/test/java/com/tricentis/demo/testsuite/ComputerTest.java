package com.tricentis.demo.testsuite;

import com.tricentis.demo.pages.CheckoutPage;
import com.tricentis.demo.pages.DesktopPage;
import com.tricentis.demo.pages.HomePage;
import com.tricentis.demo.pages.ShoppingCart;
import com.tricentis.demo.testbase.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputerTest extends BaseTest {

    DesktopPage computerPage = new DesktopPage();
    ShoppingCart shoppingCart = new ShoppingCart();
    CheckoutPage checkoutPage = new CheckoutPage();
    HomePage homePage = new HomePage();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() {
        //1.1 Click on the COMPUTERS Menu.
        homePage.clickOnComputers();

        //1.2 Click on Desktop
        homePage.clickOnDesktop();
        //1.3 Select Sort By position "Name: Z to A"
        computerPage.sortyByPositionZToA();

        //1.4 Verify the Product will be arranged in Descending order.
        //  Verify the products are arranged in descending order
        List<String> actualProductNames = new ArrayList<>();
        for (WebElement product : computerPage.listOfProducts()) {
            actualProductNames.add(product.getText());
            // Create a sorted copy of the product names in descending order
            List<String> expectedProductNames = new ArrayList<>(actualProductNames);
            Collections.sort(expectedProductNames, Collections.reverseOrder());

            // Assert that the product names are sorted correctly
            Assert.assertEquals(actualProductNames, expectedProductNames, "Products are not in Descending order");

        }
    }

    // 2. Test name verifyProductAddedToShoppingCartSuccessfully()
    @Test
    public void verifyProductAddedToShoppingCartSuccessfully() {
        //2.1 Click on the COMPUTERS Menu.
        homePage.clickOnComputers();
        //1.2 Click on Desktop
        homePage.clickOnDesktop();
        // 2.3 Select Sort By option "Name: A to Z"
        computerPage.sortyByPositionAToZ();

        //2.4 Click on the "Add To Cart" button of the product name ‘Build your own computer’
        computerPage.clickOnAddtoCart();

        //2.5 Verify the Text "Build your own computer"
        String expectedText = "Build your own computer";
        String actualText = computerPage.textonPage();
        Assert.assertEquals(actualText, expectedText, "Wrong Product");

        //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using the Select class
        computerPage.selectIntelPentiumDualCoreE2200();

        //2.7.Select "8GB [+$60.00]" using the Select class.
        computerPage.select8GB();

        // 2.8 Select HDD radio button "400 GB [+$100.00]"
        computerPage.clickOnHDDRadioButton();

        //2.9 Select the OS radio button "Windows 10 [+$60.00]"
        computerPage.clickOnOSRadioButton();

        //2.10 Check Two Checkboxes "Microsoft Office [+$50.00]" and "Total Commander
        //[+$5.00]"
        computerPage.clickOnMicrosoftOfficeAndTotalCommanderCheckbox();

        //2.11 Verify the price "1200.00"
        Assert.assertEquals(computerPage.actualPrice(), "1200.00", "WrongPage");

        //2.12 Click on the "Add to card" Button.
        computerPage.addTOCart();

        //2.13 Verify the Message "The pro
        // duct has been added to your shopping cart" on the
        //Top green Bar
        Assert.assertEquals(computerPage.actualMessage(), "The product has been added to your shopping cart", "Product not added");

        //2.14 After that close the bar by clicking on the cross button.
        computerPage.clickONCrossButton();

        //2.15 Then MouseHover on "Shopping cart" and click on the "Go to cart" button.
        computerPage.ClickOnShoppingCartAndGoTOCart();

        //2.16 Verify the message "Shopping cart"
        Assert.assertEquals(shoppingCart.getActualText(), "Shopping cart", "WrongPage");

        //2.17 Change the Qty to "2" and Click on "Update shopping cart"
        shoppingCart.clearqyty();
        shoppingCart.changeQuantityTotwo();

        //2.18 Verify the Total "2,950.00"
        Assert.assertEquals(shoppingCart.actualTotal(), "2850.00", "Wrong Total");

        // 2.19 click on the checkbox “I agree with the terms of service”
        shoppingCart.acceptTermsandConditions();

        //2.20 Click on “Checkout”
        shoppingCart.clickOnCheckout();


        //2.21 Verify the Text “Welcome, Please Sign In!”
        Assert.assertEquals(checkoutPage.SignInText(), "Welcome, Please Sign In!", "Wrong Text");

        //2.22 Click on the “Checkout as Guest” Tab
        checkoutPage.checkoutAsGuest();

        //2.23 Enter the First name
        checkoutPage.enterFirstName("Shaveta");

        //2.24 Enter the Last name
        checkoutPage.enterLAstName("Sethi");
        //2.25 Enter the email
        checkoutPage.enterEmail("ss@gmail.com");
        //2.26 Select the Country “United Kingdom” using the select class
        checkoutPage.SelectCountry();
        //2.27 Enter the city
        checkoutPage.enterCity("Reading");
        //2.28 Enter the Address1
        checkoutPage.enterAddress("1,Closemouthed,Reading");
        //2.29 Enter the Zip/Postal code
        checkoutPage.enterZipcode("400101");

        //2.30 Enter the Phone number
        checkoutPage.enterPhoneNumber("7645397381");
        //2.31 Click on the “Continue” button
        checkoutPage.clickonContinue();
        //2.32 Click on the “Continue” button
        checkoutPage.clickonContinueagain();
        //2.33 Click on the Radio Button “Next Day Air($0.00)”
        checkoutPage.GertNextDayDelivery();
        //2.34 Click on the “Continue” button
        checkoutPage.clickOnContinue1();

        //2.35 Select the Radio Button “Credit Card”
        checkoutPage.clickOnCreditCardButton();
        //2.36 Click on the “Continue” button
        checkoutPage.ClickonContinue();
        //2.37 Select “Master card” From the Select credit card dropdown using the Select class
        checkoutPage.enterCreditCardType("Master card");
        //2.38 Enter the Cardholder's name
        checkoutPage.enterCardHolderName("Shaveta");
        //2.39 Enter the Card number
        checkoutPage.enterCardNumber("5451628062666699");
        //2.40 Select the Expiration date using the select class
        checkoutPage.selectExpiryMonth();
        checkoutPage.selectExpiryYear();
        //2.41 Enter the Card code
        checkoutPage.enterCardCode("675");
        //2.42 Click on the “Continue” button
        checkoutPage.clickOnConitnue();

        //2.43 Verify “Payment Method” is “Credit Card”
        Assert.assertEquals(checkoutPage.paymentMethod(), "Credit Card", "wrong method");
        //2.44 Verify “Shipping Method” is “Next Day Air”
        Assert.assertEquals(checkoutPage.shippingMethod(), "Next Day Air", "wrong method");
        //2.45 Verify Total is “2,950.00”
        //  Assert.assertEquals(checkoutPage.);
        //2.46 Click on the “Confirm” button
        checkoutPage.clickOnConfirm();
        //2.47 Verify the Text “Thank You”
        Assert.assertEquals(checkoutPage.thankYouText(), "Thank you","Incorrect Text");

        //2.48 Verify the message “Your order has been successfully processed!”
        Assert.assertEquals(checkoutPage.successfullyProcessedText(),"Your order has been successfully processed!","Order not processed Successfully");
        //2.49 Click on the “Continue” button

     checkoutPage.clickOnFinalContinue();
        //2.50 Verify the text “Welcome to our store”
        Assert.assertEquals(checkoutPage.getStoreText(), "Welcome to our store", "Incorrect Page");

    }
}
