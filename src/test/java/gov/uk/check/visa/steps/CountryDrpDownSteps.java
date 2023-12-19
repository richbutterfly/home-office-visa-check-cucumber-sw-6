package gov.uk.check.visa.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;

public class CountryDrpDownSteps {


    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @Then("I can see following country into dropdown")
    public void iCanSeeFollowingCountryIntoDropdown(DataTable dataTable) {
        List<List<String>> countryList = dataTable.asLists(String.class);
        for (List<String> list : countryList){
            System.out.println(list);//list.get(0) for just name
        }

    }
}
