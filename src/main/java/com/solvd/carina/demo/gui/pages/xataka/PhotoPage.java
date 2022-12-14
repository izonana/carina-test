package com.solvd.carina.demo.gui.pages.xataka;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carina.demo.gui.components.xataka.HeaderMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PhotoPage extends AbstractPage {


    @FindBy(xpath = "//ul[@class='masthead-nav-topics']")
    private HeaderMenu headerMenu;
    public PhotoPage(WebDriver driver) {
        super(driver);
    }

    public HeaderMenu getHeaderMenu() {
        return headerMenu;
    }
}
