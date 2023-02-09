package com.insure.util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonUtils {

    public static WebDriver driver;

    public static WebDriver openBrowserURL(String browser) {
        try {
            switch (browser.toUpperCase()) {
                case "CHROME":
                    ChromeOptions chromeOptions = new ChromeOptions();

                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(chromeOptions);
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
                    driver.get("https://d3j8nuwp74eyml.cloudfront.net/5U5PU/S2xbn/UGFnZV8xMg==");
                    driver.manage().window().maximize();
                    break;
                default:
                    break;
            }

        } catch (Exception ex) {

        }
        return driver;
    }


    public static void click(By loc){
        //  waitForElementToClickable(driver,5,loc);
        driver.findElement(loc).click();
    }

    public static void type(By loc, String str){
        //  waitForElementToClickable(driver,5,loc);
        driver.findElement(loc).sendKeys(str);
    }

    public static void type(By loc, Keys strKeys){
        //  waitForElementToClickable(driver,5,loc);
        driver.findElement(loc).sendKeys(strKeys);
    }
}
