package selenium;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Project1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\SeleniumProdzekts\\Selenium\\WebDrivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

//Applied wait time
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//maximize window
        driver.manage().window().maximize();

//open browser with desried URL
        driver.get("https://www.meteo.pl");
        String title = driver.getTitle();
        //System.out.println(driver.getTitle());
        driver.findElement(By.id("komentarz")).getText();
        System.out.println(driver.findElement(By.id("komentarz")).getText());

//closing the browser
        driver.close();
        Assert.isTrue(title.equals("METEO.PL"), "BŁĄD");
    }

}
