package pl.edu.agh.ki.mwo.e2e;

import org.openqa.selenium.WebDriver;
import pl.edu.agh.ki.mwo.e2e.navigation.Const;

public class BasePage {
    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
    public void navigate(String url) {
        driver.get(Const.BASE_URL + url);
    }
    public WebDriver getDriver() {
        return driver;
    }
    public String getCurrentUrl(){
        return this.driver.getCurrentUrl();
    }
}