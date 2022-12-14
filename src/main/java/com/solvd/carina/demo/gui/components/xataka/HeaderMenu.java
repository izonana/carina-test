package com.solvd.carina.demo.gui.components.xataka;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HeaderMenu extends AbstractUIObject {
    @FindBy(xpath = "//a[@class='masthead-nav-topics-anchor']")
    private List<ExtendedWebElement> headerMenuButtons;

    public boolean headerButtonNamed(String name){
        for (ExtendedWebElement element:
                headerMenuButtons) {
            if (element.getText().equals(name)){
                return true;
            }
        }
        return  false;
    }

    public HeaderMenu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
}
