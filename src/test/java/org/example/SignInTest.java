package org.example;

import org.example.SignInPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SignInTest {
    private WebDriver driver;
    private SignInPage signInPage;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://example.com/signin");
        signInPage = new SignInPage(driver);
    }

    @Test
    public void testSignIn() {
        signInPage.enterEmail("test@example.com");
        signInPage.enterPassword("password123");
        signInPage.clickSignIn();

        // Assert logic should go here (e.g. check for dashboard page or logout button)
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}