package org.example;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    private final WebDriver driver;

    protected BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver(){
        return driver;
    }
}
