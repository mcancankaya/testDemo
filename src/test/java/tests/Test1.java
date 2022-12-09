package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test1 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ebebek.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);


        WebElement searchBox = driver.findElement(By.id("txtSearchBox"));
        searchBox.sendKeys("kaşık maması");
        searchBox.sendKeys(Keys.ENTER);



    }
}
