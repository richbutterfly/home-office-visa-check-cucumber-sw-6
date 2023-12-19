package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SelectNationalityPage extends Utility {

    private static final Logger log = LogManager.getLogger(StartPage.class);
    @CacheLookup
    @FindBy(id = "response")
    WebElement nationalityDropDownList;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;

    public void selectNationality(String nationality) {
        log.info("Selecting nationality from Dropdown:" + nationalityDropDownList.getText());
        selectByVisibleTextFromDropDown(nationalityDropDownList, nationality);

    }

    public void clickNextStepButton() {
        log.info("Clicking on Continue button for next step : " + continueButton.toString());
        clickOnElement(continueButton);

    }
}
