package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

    protected   WebDriver driver;
    @FindBy(xpath = "//a[contains(., ' Signup / Login')]")
    WebElement loginButton;

    @FindBy(xpath ="//a[contains(., 'Logged in as')]")
    public WebElement loginMessage;


    public PageBase(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void openLoginPage()
    {
        loginButton.click();
    }

}
