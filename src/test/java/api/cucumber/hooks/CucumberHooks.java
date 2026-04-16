package api.cucumber.hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberHooks {
    @Before(order = -3)
    public void setUp1(){
        System.out.println("----Before hook---");}
    @Before( order = 1)
    public void setUp2(){
        System.out.println("----BeforeStep hook---");}


    @After
                public void tearDown(){
            System.out.println("----After hook----");
        }
        @BeforeStep
    public void setUpSteps(){
            System.out.println("----BeforeStep hook---");
        }
        @AfterStep
    public void tearDownStep(){
            System.out.println("-----AfterStep hook---- ");
        }
    @Given("I open the BBC homepage")
    public void i_open_the_bbc_homepage() {
        System.out.println("----The BBC page has been opened----");
       // throw new io.cucumber.java.PendingException();
    }
    @When("I click on the News link")
    public void i_click_on_the_news_link() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
        System.out.println("----The News link has been clicked----");
        //throw new io.cucumber.java.PendingException();
    }
    @Then("I should see {string} in the page title")
    public void i_should_see_in_the_page_title(String string) {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
        System.out.println("----The page title has been seen----");
      //throw new io.cucumber.java.PendingException();
    }

}

