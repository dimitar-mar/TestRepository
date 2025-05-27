package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CreateProjectTest {
    private WebDriver driver;
    private SignInPage signInPage;
    private CreateProjectPage createProjectPage;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://example.com/signin");

        signInPage = new SignInPage(driver);
        createProjectPage = new CreateProjectPage(driver);

        // Sign in before creating project
        signInPage.signIn("test@examole.com","password123");
    }

    @Test
    public void testCreateProject() {
        driver.get("https://example.com/create-project");

        createProjectPage.enterProjectName("Test Project");
        createProjectPage.enterProjectDescription("This is a test project.");
        createProjectPage.clickCreateProject();

        // Assert logic should go here (e.g. confirmation message or redirection)
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}