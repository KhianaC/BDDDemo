package Steps;
import org.junit.runner.RunWith;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


    public class PostSteps {
        @Given("User should be logged in and should be present on his wall")
        public void user_should_be_logged_in_and_should_be_present_on_his_wall() throws Throwable{
             System.out.println("user_should_be_logged_in_and_should_be_present_on_his_wall");
        }

        @When("I type the message in the box")
        public void i_type_the_message_in_the_box() throws Throwable{
             System.out.println("i_type_the_message_in_the_box");
        }


        @And("Click on Post button")
        public void click_on_post_button() throws Throwable{
            System.out.println("click_on_post_button");
        }

        @Then("the message should get posted.")
        public void the_message_should_get_posted() throws Throwable{
             System.out.println(" the_message_should_get_posted");
        }

        @When("User supply the youtube link in the text box")
        public void userSupplyTheYoutubeLinkInTheTextBox() {
            System.out.println("User supply the youtube link in the text box");
        }

        @Then("video should get posted on the user wall")
        public void videoShouldGetPostedOnTheUserWall() {
            System.out.println("video should get posted on the user wall");
        }

        @And("the video should have proper thumbnail")
        public void theVideoShouldHaveProperThumbnail() {
            System.out.println("the video should have proper thumbnail");
        }

        @When("I type the message as {string} in the box")
        public void iTypeTheMessageAsInTheBox(String text) {
            System.out.println(text);
        }

        @When("User supply the youtube link as {string}  in the text box")
        public void userSupplyTheYoutubeLinkAsInTheTextBox(String url) {
            System.out.println(url);
        }
    }





