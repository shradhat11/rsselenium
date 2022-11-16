package com.phptravels.testcases;

import com.phptravels.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SignUp {

    public void dummyTest(){
        //dummy test
    }
    
    @Test
    public void verifySignUp()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://phptravels.com/demo/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.close();
        //driver.switchTo().window(tabs2.get(0));

        LoginPage login=new LoginPage(driver);
        login.clickOnSignUpbutton();
        login.typeFirstName();
        login.typeLastName();
        login.typeEmail();
        login.typePhoneNumber();
        login.typeCompanyName();
        login.typeStreetAddress();
        login.typeStreetAddress2();
        login.typeCity();
        login.typeState();
        login.typePostcode();
        login.typeMobileNumber();
        login.typePassword();
        login.typeConfirmPassword();
        login.checkboxNotARobot();
        login.clickRegisterBtn();

        driver.quit();

    }
}
