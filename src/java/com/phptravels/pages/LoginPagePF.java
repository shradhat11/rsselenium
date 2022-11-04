package com.phptravels.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class LoginPagePF {

    WebDriver driver;
    public LoginPagePF(WebDriver d){
        this.driver=d;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath ="/html/body/header/div/nav/a[5]")
    WebElement SignUpBtn;

    @FindBy(name="firstname")
    WebElement fname;

    @FindBy(name="lastname")
    WebElement lname;

    @FindBy(name="email")
    WebElement email;

    @FindBy(name="phonenumber")
    WebElement phoneNum;

    @FindBy(name="companyname")
    WebElement companyName;

    @FindBy(name="address1")
    WebElement addressLine1;

    @FindBy(name="address2")
    WebElement addressLine2;

    @FindBy(name="city")
    WebElement city;

    @FindBy(name="state")
    WebElement state;

    @FindBy(name="postcode")
    WebElement postcode;

    @FindBy(id="customfield2")
    WebElement addnMobile;

    @FindBy(name="password")
    WebElement password;

    @FindBy(name="password2")
    WebElement confirmPassword;

    @FindBy(xpath="//*[@id=\"recaptcha-anchor\"]")
    WebElement checkBoxNotARobot;

    @FindBy(xpath = "//*[@id=\"frmCheckout\"]/p/input")
    WebElement registerBtn;

    public void clickOnSignUpButtonPF()
    {
        SignUpBtn.click();
    }

    public void typeFirstName()
    {
        List<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        fname.sendKeys("tim");
    }

    public void typeLastName()
    {
        lname.sendKeys("hortons");
    }

    public void typeEmail()
    {
        email.sendKeys("phptravels001@mailinator.com");
    }

    public void typePhoneNumber()
    {
        phoneNum.sendKeys("3467878787");
    }
    public void typeCompanyName()
    {
        companyName.sendKeys("TimHortons");
    }
    public void typeStreetAddress()
    {
        addressLine1.sendKeys("456,sheikh street");
    }
    public void typeStreetAddress2()
    {
        addressLine2.sendKeys("Walli nagar");
    }
    public void typeCity()
    {
        city.sendKeys("Karachi");
    }
    public void typeState()
    {
        state.sendKeys("Sindh");
    }
    public void typePostcode()
    {
        postcode.sendKeys("75600");
    }
    public void typeMobileNumber()
    {
        addnMobile.sendKeys("3467878700");
    }
    public void typePassword()
    {
        password.sendKeys("admin");
    }
    public void typeConfirmPassword()
    {
        confirmPassword.sendKeys("admin");
    }
    public void checkboxNotARobot()
    {
        checkBoxNotARobot.click();
    }
    public void clickRegisterBtn()
    {
        registerBtn.click();
    }
}
