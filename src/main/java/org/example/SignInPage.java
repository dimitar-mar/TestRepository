package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
    private WebDriver driver;

    private By emailInput = By.id("email");
    private By passwordInput = By.id("password");
    private By signInButton = By.id("signInBtn");

    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickSignIn() {
        driver.findElement(signInButton).click();
    }
}