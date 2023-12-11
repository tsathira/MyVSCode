package stepDefinition;

import org.openqa.selenium.WebDriver;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;


public class HomeStep {
    WebDriver driver;
    HomePage home;
    LoginPage logpage;

    

/*@Given("user is on login page")
public void user_is_on_login_page(){
logpage = new LoginPage(driver);
logpage.getUrl(driver);
}

@When("^user enters correct (.*) and (.*)$")
public void user_enters_correct_username_and_password(String username, String password){
  logpage.enterUsername(username);
  logpage.enterPassword(password);
}
@And("clicks on Login button")
public void clicks_on_Login_button(){
  // LoginPage logpage = new LoginPage(driver);
  logpage.clickLogin();
}

@Then("User successfully navigated to home page")
public void user_is_successfully_navigated_to_home_page() throws InterruptedException{
  logpage.checkCartbuttonIsDisplayed();
  Thread.sleep(2000);
}

 @Given("user is on home page")
 public void user_is_on_home_page(){
 home = new HomePage(driver);
 }
@When("user clicks on add to cart button")
    public void user_clicks_on_add_to_cart_button(){
home.addtocart();
System.out.println("INSIDE WHEN");
    }
@Then("Item is added to cart")
public void item_is_added_to_cart(){
home.cartbtnclick();
System.out.println("INSIDE THEN");
}
*/

}
