package com.tricentis.demo.pages;

import com.tricentis.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckoutPage extends Utility {

    By signin = By.xpath("//h1");
    By checkoutAsGuest = By.xpath("//input[@value='Checkout as Guest']");
    By firstName = By.id("BillingNewAddress_FirstName");
    By lastName = By.id("BillingNewAddress_LastName");
    By email = By.id("BillingNewAddress_Email");
    By country = By.id("BillingNewAddress_CountryId");
    By city = By.id("BillingNewAddress_City");
    By address = By.id("BillingNewAddress_Address1");
    By zipcode = By.id("BillingNewAddress_ZipPostalCode");
    By phone = By.id("BillingNewAddress_PhoneNumber");
    By continueButton = By.xpath("//input[@onclick='Billing.save()']");
    By continueagain = By.xpath("//input[@onclick='Shipping.save()']");
    By NextDayRadio = By.id("shippingoption_1");
    By continue1 = By.xpath("//input[@class='button-1 shipping-method-next-step-button']");
    By creditCard = By.id("paymentmethod_2");
    By Creditcontinue = By.xpath("//input[@class=\"button-1 payment-method-next-step-button\"]");
    By creditcardType = By.id("CreditCardType");
    By cardholderName = By.id("CardholderName");
    By cardnumber = By.id("CardNumber");
    By month = By.id("ExpireMonth");
    By year = By.id("ExpireYear");
    By code = By.id("CardCode");
    By continu = By.xpath("//input[@class='button-1 payment-info-next-step-button']");

    By paymentMethod = By.xpath("//li[@class='payment-method']");
    By shippingMethod = By.xpath("//li[@class='shipping-method']");
    By confirmButton = By.xpath("//input[@value='Confirm']");
    By thankYou = By.xpath("//h1[normalize-space()='Thank you']");
    By processedMessage = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
    By continueFinal = By.xpath("//input[@value='Continue']");
    By welcomeStoreText = By.xpath("//h2[normalize-space()='Welcome to our store']");

    By twoNdDayAir = By.id("shippingoption_2");


    public String SignInText() {
        return getTextFromElement(signin);

    }

    public void checkoutAsGuest() {
        clickOnElement(checkoutAsGuest);
    }

    public void enterFirstName(String FirstName) {
        sendTextToElement(firstName, FirstName);
    }

    public void enterLAstName(String LastName) {
        sendTextToElement(lastName, LastName);

    }

    public void enterEmail(String Email) {
        sendTextToElement(email, Email);
    }

    public void SelectCountry() {
        selectByVisibleTextFromDropDown(country, "United Kingdom");
    }

    public void enterCity(String City) {
        sendTextToElement(city, City);
    }

    public void enterAddress(String Address) {
        sendTextToElement(address, Address);
    }

    public void enterZipcode(String Zipcode) {
        sendTextToElement(zipcode, Zipcode);
    }

    public void enterPhoneNumber(String Phonenumber) {
        sendTextToElement(phone, Phonenumber);

    }

    public void clickonContinue() {
        clickOnElement(continueButton);

    }

    public void clickonContinueagain() {
        clickOnElement(continueagain);
    }

    public void GertNextDayDelivery() {
        clickOnElement(NextDayRadio);
    }

    public void setTwoNdDayAir() {
        clickOnElement(twoNdDayAir);
    }

    public void clickOnContinue1() {
        clickOnElement(continue1);
    }

    public void clickOnCreditCardButton() {
        clickOnElement(creditCard);
    }

    public void ClickonContinue() {
        clickOnElement(Creditcontinue);
    }

    public void enterCreditCardType(String Card) {
        selectByVisibleTextFromDropDown(creditcardType, Card);
    }

    public void enterCardHolderName(String name) {
        sendTextToElement(cardholderName, name);

    }

    public void enterCardNumber(String Cardnumber) {
        sendTextToElement(cardnumber, Cardnumber);
    }

    public void selectExpiryMonth() {
        selectByVisibleTextFromDropDown(month, "06");
    }

    public void selectExpiryYear() {
        selectByVisibleTextFromDropDown(year, "2026");

    }

    public void enterCardCode(String Code) {
        sendTextToElement(code, Code);
    }

    public void clickOnConitnue() {
        clickOnElement(continu);
    }


    public String paymentMethod() {
        return getTextFromElement(paymentMethod);
    }

    public String shippingMethod() {
        return getTextFromElement(shippingMethod);
    }

    public void clickOnConfirm() {
        clickOnElement(confirmButton);
    }

    public String thankYouText() {
        return getTextFromElement(thankYou);
    }

    public String successfullyProcessedText() {
        return getTextFromElement(processedMessage);
    }

    public void clickOnFinalContinue() {
        clickOnElement(continueFinal);
    }


    public String getStoreText() {
        return getTextFromElement(welcomeStoreText);
    }


}



