package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement computerText;

    public String getComputerText() {
        log.info("Get text of Computer page : " + computerText.toString());
        return getTextFromElement(computerText);
    }
}