package com.solvd.carina.demo.gui.components.xataka;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.solvd.carina.demo.gui.pages.xataka.MobilePage;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class FooterMenu extends AbstractUIObject {

    @FindBy (xpath = "//a[@class='list-item foot-list-item' and text() = 'Xataka Móvil']")
    private ExtendedWebElement mobileLink;
    @FindBy (xpath = "//a[@class='list-item foot-list-item' and text() = 'Xataka Foto'/..]")
    private ExtendedWebElement photoLink;
    @FindBy (xpath = "//a[@class='list-item foot-list-item' and text() = 'Xataka Smart Home']/..")
    private ExtendedWebElement smartHomeLink;
    @FindBy (xpath = "//a[@class='list-item foot-list-item' and text() = 'Xataka Windows']/..")
    private ExtendedWebElement windowsLink;

    public FooterMenu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public MobilePage openMobilePage(){
        mobileLink.scrollTo();
        mobileLink.click();
        return new MobilePage(driver);
    }
}
