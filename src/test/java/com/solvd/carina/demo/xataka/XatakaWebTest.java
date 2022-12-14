package com.solvd.carina.demo.xataka;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.solvd.carina.demo.gui.pages.xataka.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class XatakaWebTest implements IAbstractTest {
    @Test
    public void testPageisOpened(){
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(),"Home page didn't open");
    }

}
