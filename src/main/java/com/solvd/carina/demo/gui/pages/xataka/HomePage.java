package com.solvd.carina.demo.gui.pages.xataka;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carina.demo.gui.components.xataka.FooterMenu;
import com.zebrunner.carina.utils.Configuration;
import com.zebrunner.carina.utils.R;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

    @FindBy( xpath = "//div[@class='menu-external foot-menu-external']")
    private FooterMenu footerMenu;
    @FindBy(xpath = "//div[@class='latam-blogs']")
    private ExtendedWebElement latamFooterTitle;

    public HomePage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(latamFooterTitle);
        setPageAbsoluteURL(R.CONFIG.get(Configuration.Parameter.URL.getKey()));
    }

}
