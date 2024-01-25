package tests;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.io.IOException;

import static utils.jsonReader.getTestData;

public class LoginTests extends TestBase{
    LoginPage loginPageObject;

    String testFilePath = "src/test/java/data/login.json";
    String username = getTestData(testFilePath,"username");
    String password = getTestData(testFilePath,"password");
    String expectedMessage = getTestData(testFilePath,"expectedMessage");
    public LoginTests() throws IOException, ParseException {
    }


    @Test(priority = 0)
    public void ValidateThatAppLoginSuccessfullyWhenEnteringValidUsernameAndPassword() throws InterruptedException {
    loginPageObject = new LoginPage(driver);
    loginPageObject.openLoginPage();
    loginPageObject.login(username,password);
    softAssert.assertEquals(loginPageObject.loginMessage.getText(),expectedMessage);


    }

}
