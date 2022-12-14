package com.solvd.carina.demo.gui.pages.xataka;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carina.demo.gui.components.xataka.HeaderMenu;
import com.solvd.carina.demo.gui.components.xataka.SideMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MobilePage extends AbstractPage {
    @FindBy(xpath = "//ul[@class='masthead-nav-topics']")
    private HeaderMenu headerMenu;
    @FindBy(xpath = "//nav[@class='head-menu-categories']")
    private SideMenu sideMenu;
    public MobilePage(WebDriver driver) {
        super(driver);
    }
    @FindBy (xpath = "//a[@class='masthead-actions-menu m-v1 js-toggle']")
    private ExtendedWebElement sideMenuButton;

    public HeaderMenu getHeaderMenu() {
        return headerMenu;
    }

    public SideMenu getSideMenu() {
        sideMenuButton.click();
        return sideMenu;
    }
}
