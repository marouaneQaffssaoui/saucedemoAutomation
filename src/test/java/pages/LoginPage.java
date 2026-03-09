package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "user-name")
    WebElement username;
    @FindBy(id = "password")
    WebElement userPassword;
    @FindBy(id = "login-button")
    WebElement loginButton;

    public void enterUsername(String name){
        username.sendKeys(name);
    }
    public void enterPassword(String password){
        userPassword.sendKeys(password);
    }
    public void clickButton(){
        loginButton.click();
    }

}
