package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class MyStepdefs {
    HomePage homePage = new HomePage();
    @Given("Open Calculator App")
    public void openCalculatorApp() {

    }

    @When("I sum from {int} to {int}")
    public void iSumFromTo(int numberTo, int numberFrom) {
        homePage.sumTotal(numberTo,numberFrom);
    }

    @Then("The screen display total correct")
    public void theScreenDisplayTotalCorrect() {

    }
}
