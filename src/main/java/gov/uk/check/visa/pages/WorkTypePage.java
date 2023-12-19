package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class WorkTypePage extends Utility {

    private static final Logger log = LogManager.getLogger(StartPage.class);

    @CacheLookup
    @FindBy(xpath = "(//input[@id='response-0'])[1]")
    WebElement selectJobTypeHealthAndCare;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;

    public void selectJobType(){
        log.info("Selecting job type  : " + selectJobTypeHealthAndCare.toString());
        clickOnElement(selectJobTypeHealthAndCare);

    }
    public void clickNextStepButton(){
        log.info("Clicking on next step button : " + nextStepButton.toString());
        clickOnElement(nextStepButton);
    }
}
