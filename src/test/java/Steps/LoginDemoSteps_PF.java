package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pagefactory.HomePage_PF;
import pagefactory.LoginPage_PF;
import pages.loginPage;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class LoginDemoSteps_PF {
    WebDriver driver = null;
    LoginPage_PF login;
    HomePage_PF home;

    @Given("browser is open")
    public void browser_is_open(){
        System.out.println("=== I am inside browser_is_open =====");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().window().maximize();
    }

    @And("user is on login page")
    public void user_is_on_login_page(){
      driver.navigate().to("https:example.testProject.io/web/");
    }

    @When("^user enters(.*) and (.*)$")
    public void user_enters_username_and_password(String username, String password) throws InterruptedException {
        login = new LoginPage_PF(driver);
        login.enterUsername(username);
        login.enterPassword(password);
        Thread.sleep(2000);
    }
    @And("user clicks on login")
    public void user_clicks_on_login(){
        login.clickOnLogin();
    }

    @Then("User is navigated to the home page")
    public void user_is_navigated_to_the_home_page() throws InterruptedException{
   home = new HomePage_PF(driver);
   Assert.assertTrue(home.checkLogoutIsDisplayed());
    Thread.sleep(2000);
    driver.close();
    driver.quit();
    }
}
  /*  @Given("User is on login page")
    public void user_is_on_login_page() {
        driver.get("https://practice.expandtesting.com/login");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.expandtesting.com/login");
        login = new loginPage(driver);
    }

    @When("User enters {string} and {string}")
    public void user_enters_username_and_password(String username, String password) {
        login.loginValidUser(username, password);
    }

    @When("clicks login button")
    public void clicks_login_button() {
        // already handled inside login() OR create separate method
    }

    @Then("User should navigate to dashboard")
    public void user_should_navigate_to_dashboard() {
        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
    }
}
*/