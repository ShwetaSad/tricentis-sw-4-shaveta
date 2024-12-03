package com.tricentis.demo.pages;

import com.tricentis.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By Computer = By.linkText("Computers");
    By deskptop = By.linkText("Desktops");
    By electronivs = By.xpath("//ul[@class='top-menu']//a[normalize-space()='Electronics']");
    By cellPhones = By.xpath("//a[contains(text(), 'Cell phones')]");
    By logOut = By.xpath("//a[normalize-space()='Log out']");


    public void clickOnComputers() {
        clickOnElement(Computer);
    }

    public void clickOnDesktop() {
        clickOnElement(deskptop);
    }

    public void MouseHoverOnElectronics() {
        mouseHoverToElement(electronivs);
    }

    public void clickOnCellPhones() {
        clickOnElement(cellPhones);
    }

    public void clickOnLogOutButton() {
        clickOnElement(logOut);
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }


}
