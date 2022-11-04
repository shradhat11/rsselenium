package com.phptravels.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BrowserSelection {

    static WebDriver driver;
    public static WebDriver startBrowser(String BrowserName,String url){

        if(BrowserName.equalsIgnoreCase("Firefox)"))
        {

            driver=new FirefoxDriver();

        }
        else if (BrowserName.equalsIgnoreCase("Chrome"))
        {
            WebDriverManager.chromedriver().setup();
            driver= new ChromeDriver();

        }
        else if (BrowserName.equalsIgnoreCase("Edge"))
        {
            driver = new EdgeDriver();

        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        return driver;
    }
}
