package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends Utility {
    private static final Logger log = LogManager.getLogger(StartPage.class);
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You will not need a visa to come to the UK')]")
    WebElement resultMessage;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You need a visa to work in health and care')]")
    WebElement healthAndCareVisa;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You may need a visa']")
    WebElement resultMessageYouMayNeedAVisa;

    public String getResultMessage() {
        log.info("Getting text from : " + resultMessage.toString());
        return getTextFromElement(resultMessage);
    }
    public String getResultMessageForHealthAndCareVisa() {
        log.info("Getting text from : " + healthAndCareVisa.toString());
        return getTextFromElement(healthAndCareVisa);
    }
    public String getResultMessageYouMayNeedAVisa() {
        log.info("Getting text from : " + resultMessageYouMayNeedAVisa.toString());
        return getTextFromElement(resultMessageYouMayNeedAVisa);
    }
}
