package com.unitedairline.base;

import com.unitedairline.utils.BrowserManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Hooks {

    public static WebDriver driver;
    String URL = "https://www.united.com/\n";

    @Before
    public void setUp() {
        driver = BrowserManager.getDriver("");
        driver.get(URL);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @After
    public void tearDown(){
        driver.quit();
    }
}
