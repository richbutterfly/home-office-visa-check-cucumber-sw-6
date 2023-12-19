package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DurationOfStayPage extends Utility {

    private static final Logger log = LogManager.getLogger(StartPage.class);

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space() = '6 months or less')]")
    WebElement lessThanSixMonths;
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement moreThanSixMonths;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;

    public void clickOnLongerThan6Months() {
        log.info("Clicking on Longer than 6 months : " + moreThanSixMonths.toString());
        clickOnElement(moreThanSixMonths);

    }

    public void clickNextStepButton() {
        log.info("Clicking on Continue button for next step: " + nextStepButton.toString());
        clickOnElement(nextStepButton);
    }
}
