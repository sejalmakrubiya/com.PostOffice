import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RegisterPage {
    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","C:\\shop\\sejal\\Sejal Testing\\software\\Chrome Driver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.postoffice.co.uk/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(27, TimeUnit.SECONDS);
        //Click on all cookies
        driver.findElement(By.id("ensCloseBanner")).click();
        //Click on Account login button
        driver.findElement(By.xpath("//li/a[@href=\"/Home\"]")).click();
        //Click on Travel insurance
        driver.findElement(By.className("open-new")).click();
        






    }
}
