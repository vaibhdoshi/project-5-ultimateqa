package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        //Launch the URL
        driver.get(baseUrl);
        //Get the title of the page
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
