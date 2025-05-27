package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends BasePage {
    private By emailInput = By.id("email");
    private By passwordInput = By.id("password");
    private By signInButton = By.id("signInBtn");

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    private void enterEmail(String email) {
        getDriver().findElement(emailInput).sendKeys(email);
    }

    private void enterPassword(String password) {
        getDriver().findElement(passwordInput).sendKeys(password);
    }

    public void signIn(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        getDriver().findElement(signInButton).click();
    }
}