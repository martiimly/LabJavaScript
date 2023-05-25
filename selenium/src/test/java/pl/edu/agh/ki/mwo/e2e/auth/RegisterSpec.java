package pl.edu.agh.ki.mwo.e2e.auth;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pl.edu.agh.ki.mwo.e2e.navigation.Const;

import static org.assertj.core.api.Assertions.assertThat;

public class RegisterSpec {
    WebDriver driver;
    AuthPage authPage;

    @BeforeEach
    public void setup() {
        driver = WebDriverManager.operadriver().create();
        authPage = new AuthPage(driver);
    }

    @Test
    @DisplayName("[Register.1] Button is disabled on login page loaded")
    public void buttonIsDisabledOnPageLoad() {
        authPage.navigate(Const.LOGIN_URL);
        WebElement button = authPage.getSubmitButton();

        assertThat(button.isEnabled()).isFalse();
    }
}