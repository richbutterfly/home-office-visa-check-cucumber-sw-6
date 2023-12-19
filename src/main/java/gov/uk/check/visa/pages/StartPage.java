package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class StartPage extends Utility {

    private static final Logger log = LogManager.getLogger(StartPage.class);

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Start now']")
    WebElement startNowButton;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Hide this message')]")
    WebElement hideTheMessage;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Accept additional cookies')]")
    WebElement acceptCookies;

    public void clickStartNow(){
        log.info("Clicking on Start now button : " + startNowButton.toString());
        clickOnElement(startNowButton);
    }
    public void acceptAllCookies(){
        log.info("Clicking on Accept All Cookies : " + acceptCookies.toString());
        clickOnElement(acceptCookies);
    }
    public void clickOnHideThisMessage (){
        log.info("Clicking on Hide this message : " + hideTheMessage.toString());
        clickOnElement(hideTheMessage);
    }
}
