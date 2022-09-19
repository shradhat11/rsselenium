package mypackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class statusofWebElement {

    public static void main(String [] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
            driver.get("https://demo.nopcommerce.com/register");
        driver.manage().window().maximize();

        //isDisplayed isEnabled()

        WebElement searchStore= driver.findElement(By.id("small-searchterms"));
        //boolean flag=searchStore.isDisplayed();

        System.out.println("Display status of the element:"+searchStore.isDisplayed());
        System.out.println("Enable status of the element:"+searchStore.isEnabled());

        //isSelected() mainly for checkbox
        WebElement malecheckbox=driver.findElement(By.id("gender-male"));
        WebElement femalecheckbox=driver.findElement(By.id("gender-female"));

        System.out.println("Initial values of the Male Checkbox :"+malecheckbox.isSelected());
        System.out.println("Initial values of the Female Checkbox :"+femalecheckbox.isSelected());

        //select the male checkbox
        malecheckbox.click();
        System.out.println("The value after clicking:"+malecheckbox.isSelected());
        System.out.println("The value after clicking:"+femalecheckbox.isSelected());

        //select the femalecheckbox
        femalecheckbox.click();
        System.out.println("The value after clicking:"+malecheckbox.isSelected());
        System.out.println("The value after clicking:"+femalecheckbox.isSelected());

    }


}
