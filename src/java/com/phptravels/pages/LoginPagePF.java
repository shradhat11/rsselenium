package com.phptravels.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPagePF {

    @FindBy(linkText = "https://phptravels.org/register.php")
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
    WebElement confirmpassword;

    @FindBy(xpath="//*[@id=\"recaptcha-anchor\"]")
    WebElement chckboxNotaRobot;

    @FindBy(xpath = "//*[@id=\"frmCheckout\"]/p/input")
    WebElement registerbtn;



}
