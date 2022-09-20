package com.phptravels.pages;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class LoginPage {
    WebDriver driver;

    By SignUpBtn=By.xpath("/html/body/header/div/nav/a[5]");
    By fname=By.id("inputFirstName");
    By lname=By.name("lastname");
    By email=By.name("email");
    By phoneNum=By.name("phonenumber");
    By companyName=By.name("companyname");
    By addressLine1=By.name("address1");
    By addressLine2=By.name("address2");
    By city=By.name("city");
    By state=By.name("state");
    By postcode=By.name("postcode");
    By addnMobile=By.id("customfield2");
    By password=By.name("password");
    By confirmpassword=By.name("password2");
    By chckboxNotaRobot=By.xpath("//*[@id=\"recaptcha-anchor\"]");
    By registerbtn=By.xpath("//*[@id=\"frmCheckout\"]/p/input");

    public LoginPage(WebDriver driver )
    {
            this.driver=driver;

    }

    public void clickOnSignUpbutton()
    {
        driver.findElement(SignUpBtn).click();
    }

    public void typeFirstName()
    {
        List<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        driver.findElement(fname).sendKeys("tim");
    }

    public void typeLastName()
    {
        driver.findElement(lname).sendKeys("hortons");
    }

    public void typeEmail()
    {
        driver.findElement(email).sendKeys("phptravels001@mailinator.com");
    }

    public void typePhoneNumber()
    {
        driver.findElement(phoneNum).sendKeys("3467878787");
    }
    public void typeCompanyName()
    {
        driver.findElement(companyName).sendKeys("TimHortons");
    }
    public void typeStreetAddress()
    {
        driver.findElement(addressLine1).sendKeys("456,sheikh street");
    }
    public void typeStreetAddress2()
    {
        driver.findElement(addressLine2).sendKeys("Walli nagar");
    }
    public void typeCity()
    {
        driver.findElement(city).sendKeys("Karachi");
    }
    public void typeState()
    {
        driver.findElement(state).sendKeys("Sindh");
    }
    public void typePostcode()
    {
        driver.findElement(postcode).sendKeys("75600");
    }
    public void typeMobileNumber()
    {
        driver.findElement(addnMobile).sendKeys("3467878700");
    }
    public void typePassword()
    {
        driver.findElement(password).sendKeys("admin");
    }
    public void typeConfirmPassword()
    {
        driver.findElement(confirmpassword).sendKeys("admin");
    }
    public void checkboxNotARobot()
    {
        driver.findElement(chckboxNotaRobot).click();
    }
    public void clickRegisterBtn()
    {
        driver.findElement(registerbtn).click();
    }
}
