package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{

    @FindBy(css = "[data-qa='login-email']")
    WebElement usernameTextBox;

    @FindBy(css = "[data-qa='login-password']")
    WebElement passwordTextBox;

    @FindBy(css = "[data-qa='login-button']")
    WebElement loginButton;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password)
    {
        usernameTextBox.sendKeys(username);
        passwordTextBox.sendKeys(password);
        loginButton.click();

    }
}
