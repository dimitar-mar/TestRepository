package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateProjectPage extends BasePage {


    private By projectNameInput = By.id("projectName");
    private By projectDescInput = By.id("projectDescription");
    private By createButton = By.id("createBtn");

    public CreateProjectPage(WebDriver driver) {
       super(driver);
    }

    public void enterProjectName(String name) {
        getDriver().findElement(projectNameInput).sendKeys(name);
    }

    public void enterProjectDescription(String description) {
        getDriver().findElement(projectDescInput).sendKeys(description);
    }

    public void clickCreateProject() {
        getDriver().findElement(createButton).click();
    }
}