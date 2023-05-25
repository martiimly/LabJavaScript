package pl.edu.agh.ki.mwo.e2e.auth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pl.edu.agh.ki.mwo.e2e.BasePage;
import pl.edu.agh.ki.mwo.e2e.navigation.Const;

public class AuthPage extends BasePage {
    @FindBy(css = "[placeholder='Username']")
    private WebElement usernameField;

    @FindBy(css = "[placeholder='Email'")
    private WebElement emailField;

    @FindBy(css = "[placeholder='Password'")
    private WebElement passwordField;

    @FindBy(css = "button[type='submit']")
    private WebElement submitButton;

    @FindBy(css = ".error-messages li")
    private WebElement errorMessage;

    public AuthPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.getDriver(), this);
    }

    public WebElement getUsernameField() {
        return usernameField;
    }

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }


    public boolean submitButtonIsEnabled(){
        return this.submitButton.isEnabled();
    }



    public void loginAs(String mail, String password){
        this.navigate(Const.LOGIN_URL);
        emailField.sendKeys(mail);
        passwordField.sendKeys(password);
        submitButton.click();
    }

    public boolean errorMessageIsDisplayed(){
        return this.errorMessage.isDisplayed();
    }




    public void navigate(String url) {
        this.driver.get(Const.BASE_URL + url);
    }

}