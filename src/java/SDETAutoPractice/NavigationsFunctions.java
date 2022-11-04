package SDETAutoPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationsFunctions {

    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.snapdeal.com/");
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

        driver.navigate().back();//goes back to snapdeal
        driver.navigate().forward();//goes to amazon

        driver.navigate().refresh();//refreshes the amazon page
    }
}
