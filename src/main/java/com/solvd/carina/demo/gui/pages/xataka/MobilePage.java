package com.solvd.carina.demo.gui.pages.xataka;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MobilePage extends AbstractPage {

    @FindBy(xpath = "//a[@class='masthead-nav-topics-anchor']")
    private List<ExtendedWebElement> headerMenuButtons;
    public MobilePage(WebDriver driver) {
        super(driver);
    }

    public boolean headerContainsButtonNamed (String name){
        for (ExtendedWebElement element:
             headerMenuButtons) {
            if (element.getText().equals(name)){
                return true;
            }
        }
        return  false;
    }
}
