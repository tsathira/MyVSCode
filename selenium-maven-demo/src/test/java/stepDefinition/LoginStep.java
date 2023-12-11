package stepDefinition;

import java.io.File;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginStep {
     WebDriver driver;
      //LoginPage logpage = new LoginPage(driver);
      LoginPage logpage;
      String title;
@Before(order=0)
      public void browserSetUp(){
        System.out.println("Inside setup");
  //  System.setProperty("webdriver.chrome.driver", new File(System.getProperty("user.dir"), "chromedriver.exe").getAbsolutePath());
 // driver = new ChromeDriver();
//System.setProperty("webdriver.gecko.driver","C:/Users/HP/Downloads/geckodriver.exe");
System.setProperty("webdriver.gecko.driver", new File(System.getProperty("user.dir"), "geckodriver.exe").getAbsolutePath());
driver = new FirefoxDriver();
//driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.manage().window().maximize();
}
@Before(order=1)
 public void browserSetUp2(){
        System.out.println("Inside setup2");
 }
 /*@Before(@smoke)
 public void browserSetUp3(){
        System.out.println("Inside setup2");
 }*/
/*@After
public void tearDown(){
  System.out.println("Inside teardown");
  driver.close();
  driver.quit();
}*/
@BeforeStep
public void beforeSteps(){
  System.out.println("Inside beforestep");
}
@AfterStep
public void afterSteps(){
  System.out.println("Inside afterstep");
}

@Given("User is on login page")
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
@When("user gets the title of the page")
public void user_gets_the_title_of_the_page(){
  title = logpage.getLoginPageTitle();
}
@Then("title should be {string}")
  public void title_should_be(String expectedTitle){
Assert.assertTrue(title.contains(expectedTitle));
 }

}

//from local to git
//from git to local
//second changes from local to git
