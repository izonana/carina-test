package com.solvd.carina.demo.gui.components.xataka;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SideMenu extends AbstractUIObject {

    @FindBy(xpath = "//nav[@class='head-menu-categories']//li//a")
    private List <ExtendedWebElement> categoryButtons;

    public SideMenu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public boolean categoryButtonNamed(String name){
        for (ExtendedWebElement element:
             categoryButtons) {
            if(element.getText().equals(name)){
                return true;
            }
        }
        return false;
    }
}
