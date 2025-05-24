package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateProjectPage {
    private WebDriver driver;

    private By projectNameInput = By.id("projectName");
    private By projectDescInput = By.id("projectDescription");
    private By createButton = By.id("createBtn");

    public CreateProjectPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterProjectName(String name) {
        driver.findElement(projectNameInput).sendKeys(name);
    }

    public void enterProjectDescription(String description) {
        driver.findElement(projectDescInput).sendKeys(description);
    }

    public void clickCreateProject() {
        driver.findElement(createButton).click();
    }
}