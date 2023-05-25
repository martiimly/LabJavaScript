package pl.edu.agh.ki.mwo.e2e.auth;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pl.edu.agh.ki.mwo.e2e.BaseSpec;
import pl.edu.agh.ki.mwo.e2e.navigation.Const;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginSpec extends BaseSpec {
    WebDriver driver;
    AuthPage authPage;

    @BeforeEach
    public void setup() {
        driver = WebDriverManager.operadriver().create();
        authPage = new AuthPage(driver);
    }

    @Test
    @DisplayName("[Login.1] Button is disabled on login page loaded")
    public void buttonIsDisabledOnPageLoad() {
       authPage.navigate(Const.LOGIN_URL);
        WebElement button = authPage.getSubmitButton();

        assertThat(button.isEnabled()).isFalse();
    }

    @Test@DisplayName("[Login.2] Should display error message on login failure")
    void wrongLoginPassword(){
        this.authPage.loginAs("Piot", "Budynek");

        assertThat(this.authPage.getCurrentUrl()).isEqualTo(Const.BASE_URL + Const.LOGIN_URL);
        assertThat(this.authPage.errorMessageIsDisplayed()).isTrue();
    }

    @Test@DisplayName("[Login.3] Should log in succesfully")
    void correctLoginPassword(){
        this.authPage.loginAs("mwo@gmail.com", "mwo123");

        assertThat(this.authPage.getCurrentUrl()).isEqualTo(Const.BASE_URL + Const.LOGIN_URL);
            }



}