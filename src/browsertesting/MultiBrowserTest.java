package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {
    static String browser = "chrome";
    static String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gheko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        } else {
            System.out.println("Wrong Browser Name");

        }
        driver.get(baseUrl);
        //get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is : " + title);
        //get current URL
        System.out.println("Current URL : " + driver.getCurrentUrl());
        //get page source
        System.out.println("Page source : " + driver.getPageSource());
        //Find the email field element and send the email
        WebElement emailField = driver.findElement(By.id("user[email]"));
        //Type email to email field
        emailField.sendKeys("test123@gmail.com");
        //Find the password field element
        WebElement passwordField = driver.findElement(By.name("user[password]"));
        //type password to password field
        passwordField.sendKeys("test123");
        //close the scanner
        driver.quit();

    }
}