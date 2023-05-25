package pl.edu.agh.ki.mwo.e2e;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginTest {

    @Test
    void firstTest() throws InterruptedException{
        WebDriver driver = WebDriverManager.operadriver().create();
        driver.get("http://localhost:4200/login");

        WebElement mailInputField = driver.findElement(By.cssSelector("[type = 'text']"));
        mailInputField.sendKeys("mail@gmail.com");

        WebElement passInputField = driver.findElement(By.cssSelector("[type = 'password']"));
        passInputField.sendKeys("pass123");

        WebElement signInButton = driver.findElement(By.cssSelector("[type = 'submit']"));
        signInButton.click();

        Thread.sleep(5000);

    }
}
