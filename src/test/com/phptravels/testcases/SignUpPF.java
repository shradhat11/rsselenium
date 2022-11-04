package com.phptravels.testcases;


import com.phptravels.base.BrowserSelection;
import com.phptravels.pages.LoginPagePF;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SignUpPF {

    @Test
    public void verifySignupPF(){

        WebDriver driver = BrowserSelection.startBrowser("chrome","https://phptravels.com/demo/");

        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();
        //driver.get("https://phptravels.com/demo/");
        //driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        LoginPagePF login1= new LoginPagePF(driver);
                login1.clickOnSignUpButtonPF();
        login1.typeFirstName();
        login1.typeLastName();
        login1.typeEmail();
        login1.typePhoneNumber();
        login1.typeCompanyName();
        login1.typeStreetAddress();
        login1.typeStreetAddress2();
        login1.typeCity();
        login1.typeState();
        login1.typePostcode();
        login1.typeMobileNumber();
        login1.typePassword();
        login1.typeConfirmPassword();
        login1.checkboxNotARobot();
        login1.clickRegisterBtn();

        driver.quit();

    }
}
