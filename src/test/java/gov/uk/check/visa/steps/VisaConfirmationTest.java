package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class VisaConfirmationTest {

    @Given("I am on Homepage")
    public void iAmOnHomepage() {
    }

    @When("I accept all cookies")
    public void iAcceptAllCookies() {
        new StartPage().acceptAllCookies();
    }

    @And("I click on Hide this message")
    public void iClickOnHideThisMessage() {
        new StartPage().clickOnHideThisMessage();
    }

    @And("I click on start now button")
    public void iClickOnStartNowButton() {
        new StartPage().clickStartNow();
    }

    @And("I select a Nationality {string}")
    public void iSelectANationality(String arg0) {
        new SelectNationalityPage().selectNationality("Australia");
    }

    @And("I click on Continue button")
    public void iClickOnContinueButton() {
        new SelectNationalityPage().clickNextStepButton();
    }

    @And("I select reason {string}")
    public void iSelectReason(String arg0) {
        new ReasonForTravelPage().selectReasonForVisit("Tourism");
    }

    @Then("I verify the result {string}")
    public void iVerifyTheResult(String arg0) {
        String expectedMessage = "You will not need a visa to come to the UK";
        Assert.assertEquals(new ResultPage().getResultMessage(), expectedMessage, "Error message not displayed");
    }


    @And("I select Nationality {string}")
    public void iSelectNationality(String arg0) {
        new SelectNationalityPage().selectNationality("Chile");
    }

    @And("I click on continue button for going to next page")
    public void iClickOnContinueButtonForGoingToNextPage() {
        new SelectNationalityPage().clickNextStepButton();
    }

    @When("I select a reason {string}")
    public void iSelectAReason(String arg0) {
        new ReasonForTravelPage().selectReasonForVisit("Work, academic visit or business");
    }

    @And("I click on Continue button{int}")
    public void iClickOnContinueButton(int arg0) {
        new ReasonForTravelPage().clickNextStepButton1();
    }

    @When("I select intended to stay for {string}")
    public void iSelectIntendedToStayFor(String arg0) {
        new DurationOfStayPage().clickOnLongerThan6Months();
    }

    @And("I click on Continue button for next step")
    public void iClickOnContinueButtonForNextStep() {
        new DurationOfStayPage().clickNextStepButton();
    }

    @When("I select have planning to work for {string}")
    public void iSelectHavePlanningToWorkForHealthAndCareProfessional(String arg0) {
        new WorkTypePage().selectJobType();
    }

    @And("I click on continue button{int}")
    public void iClickOnContinueButton2(int arg0) {
        new WorkTypePage().clickNextStepButton();
    }

    @Then("I verify result {string}")
    public void iVerifyResultYouNeedAVisaToWorkInHealthAndCare() {
        String expectedMsg = "You need a visa to work in health and care";
        Assert.assertEquals(new ResultPage().getResultMessageForHealthAndCareVisa(), expectedMsg, "Error message not displayed");
    }


    @When("I select the Nationality {string}")
    public void iSelectTheNationalityColombia(String arg0) {
        new SelectNationalityPage().selectNationality("Colombia");
    }

    @And("I click on continue button to go on next page")
    public void iClickOnContinueButtonToGoOnNextPage() {
        new SelectNationalityPage().clickNextStepButton();
    }

    @When("I select reason {string} for longer stay")
    public void iSelectReasonForLongerStay(String arg0) {
        new ReasonForTravelPage().selectReasonForVisit("Join partner or family for a long stay");
    }

    @And("I click on the Continue button")
    public void iClickOnTheContinueButton() {
        new ReasonForTravelPage().clickNextStepButton1();
    }

    @Then("I verify the message {string}")
    public void iVerifyTheMessage(String arg0) {
        String expectedMsg1 = "You may need a visa";
        Assert.assertEquals(new ResultPage().getResultMessageYouMayNeedAVisa(), expectedMsg1, "Error message not displayed");
    }


}
