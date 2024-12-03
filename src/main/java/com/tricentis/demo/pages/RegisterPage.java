package com.tricentis.demo.pages;

import com.tricentis.demo.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By titleText = By.xpath("//h1");
    By gender = By.id("gender-male");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By email = By.id("Email");
    By password = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");
    By registerSuccess = By.xpath("//div[@class='result']");
    By continueBtn = By.xpath("//input[@value='Continue']");

    public String registerPageTitle() {
        return getTextFromElement(titleText);
    }

    public void clickOnGender() {
        clickOnElement(gender);
    }

    public void enterFirstName(String name) {
        sendTextToElement(firstName, name);
    }

    public void enterLastName(String name) {
        sendTextToElement(lastName, name);
    }

    public void enterEmailAddress(String Email) {
        sendTextToElement(email, Email);
    }

    public void enterPassword(String pass) {
        sendTextToElement(password, pass);
    }

    public void enterConfirmPassword(String confirmPass) {
        sendTextToElement(confirmPassword, confirmPass);
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
    }

    public String getRegisterSuccessMessage() {
        return getTextFromElement(registerSuccess);
    }

    public void clickOnContinueButton() {
        clickOnElement(continueBtn);
    }
}

