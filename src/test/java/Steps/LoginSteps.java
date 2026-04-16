package Steps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class LoginSteps {

    @Given("User is at the login page of the application")
    public void user_is_at_the_login_page_of_the_application() {
        System.out.println("User is at the login page of the application");
    }

    @When("User logs in with following username and password")
    public void user_logs_in_with_following_username_and_password(DataTable dataTable) {

        // Convert DataTable into List of rows
        List<List<String>> data = dataTable.asLists(String.class);

        // Loop through all rows
        for (List<String> row : data) {

            String username = row.get(0);
            String password = row.get(1);

            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
        }
    }
    @Then("user should be able to login with correct username and password")
        public void user_should_be_able_to_login_with_correct_username_and_password() {
            System.out.println("Login successful");

    }
}