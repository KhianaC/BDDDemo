package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefinitionsForScenarioWithExample {
    private WebDriver driver;

    @Given("User is on Home Page")
    public void user_is_on_home_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }
}
/*

        @When("User Navigate to LogIn Page")
        public void user_navigate_to_login_page() {
            System.out.println("User Navigate to Login Page");
        }

        @When("User enters {string} and {string}")
        public void user_enters_username_and_password(String username, String password) {

            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
            driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
            driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
            driver.findElement(By.xpath("//input[@id='login-button']")).click();
        }

        @Then("Message displayed Login Successfully")
        public void message_displayed_login_successfully() throws InterruptedException {
            System.out.println("Login Successfully Done");
           Thread.sleep(2000);
            driver.close();
        }
    }
*/


