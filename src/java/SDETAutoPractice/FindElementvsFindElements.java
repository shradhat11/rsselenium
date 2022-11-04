package SDETAutoPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementvsFindElements {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");

        //findElement --- returns single element

        //locator pointing to one webelement
        WebElement searchbox=driver.findElement(By.id("small-searchterms"));
        searchbox.sendKeys("abc");

        //locator pointing to more than one webelement

        WebElement alllinks=driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]//a"));
        System.out.println(alllinks.getText());

        //trying to find webelement which is not present on the page- u get NoSuchELementException

        //WebElement searchbtn=driver.findElement(By.xpath("//*[@id=\"small-search-login-form\"]/button"));

        //findElements()


    }
}