package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    
    WebDriver driver;

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void getUrl(WebDriver driver)
    {
        driver.get("https://www.saucedemo.com/");
    }  
By txt_username = By.id("user-name");
By txt_password = By.id("password");
By btn_login = By.id("login-button");
By btn_cart = By.id("shopping_cart_container");

public void enterUsername(String username){
driver.findElement(txt_username).sendKeys(username);
}
public void enterPassword(String password){
driver.findElement(txt_password).sendKeys(password);
}
public void clickLogin(){
driver.findElement(btn_login).click();
}

/*public void loginValidUser(String username,String password){
    driver.findElement(txt_username).sendKeys(username);
    driver.findElement(txt_password).sendKeys(password);
    driver.findElement(btn_login).click();
}*/
public void checkCartbuttonIsDisplayed(){
driver.findElement(btn_cart).isDisplayed();
}
public String getLoginPageTitle(){
return driver.getTitle();
}

}
