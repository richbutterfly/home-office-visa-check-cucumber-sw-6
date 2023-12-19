package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ReasonForTravelPage extends Utility {

    private static final Logger log = LogManager.getLogger(StartPage.class);

    @CacheLookup
    @FindBy(xpath = "//div[@class='govuk-radios']//div//label")
    List<WebElement> reasonForVisitList;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;


    public void selectReasonForVisit(String reason){
        for (WebElement e : reasonForVisitList){
            if (e.getText().contains(reason)){
                clickOnElement(e);
                break;
            }
        }
    }
    public void clickNextStepButton1(){
        log.info("Clicking on Continue button for next step: " +nextStepButton);
        clickOnElement(nextStepButton);

    }
}
