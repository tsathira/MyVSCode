package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }
    By btn_addtocart = By.name("add-to-cart-sauce-labs-backpack");
    By btn_cartbtn = By.xpath("//a[@class = 'shopping_cart_link']");
    public void addtocart(){
driver.findElement(btn_addtocart).click();
    }
public void cartbtnclick(){
    driver.findElement(btn_cartbtn).click();
}
}
