package mypackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

    public static void main(String[]  args){

        //Chrome driver
        /*System.setProperty("webdriver.chrome.driver","E:\\technology\\Shradha2020-workplace\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://frontend.nopcommerce.com/");*/

        //firefox driver
        /*System.setProperty("webdriver.gecko.driver","E:\\technology\\Shradha2020-workplace\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://frontend.nopcommerce.com/");*/

        /* using WebDrivermanager*/

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://frontend.nopcommerce.com/");
        driver.manage().window().maximize();

        //to get the title of the page
        String title=driver.getTitle();
        System.out.println("The title of the web page is :"+title);

        //to get the Currenturl
        String currentUrl = driver.getCurrentUrl();
        System.out.println("The current Url of the webpage is:"+currentUrl);

        //to get the pagesource
        String pageSource= driver.getPageSource();
        System.out.println("The Page source of the webpage is:"+pageSource);

    }
}
