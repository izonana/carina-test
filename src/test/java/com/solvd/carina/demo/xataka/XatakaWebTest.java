package com.solvd.carina.demo.xataka;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.solvd.carina.demo.gui.pages.xataka.HomePage;
import com.solvd.carina.demo.gui.pages.xataka.MobilePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class XatakaWebTest implements IAbstractTest {
    @Test
    public void testPageisOpened(){
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(),"Home page didn't open");
    }
    @Test
    public void testMobilePageHeaderButtonsText(){
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        MobilePage mobilePage = homePage.getFooterMenu().openMobilePage();
        Assert.assertTrue(mobilePage.headerContainsButtonNamed("ANÁLISIS"),"Button name not found");
        Assert.assertTrue(mobilePage.headerContainsButtonNamed("COMPARATIVA TARIFAS"),"Button name not found");
        Assert.assertTrue(mobilePage.headerContainsButtonNamed("APLICACIONES"),"Button name not found");
        Assert.assertTrue(mobilePage.headerContainsButtonNamed("JUEGOS"),"Button name not found");
        Assert.assertTrue(mobilePage.headerContainsButtonNamed("GUÍAS DE COMPRA"),"Button name not found");
        Assert.assertTrue(mobilePage.headerContainsButtonNamed("OFERTAS MÓVILES"),"Button name not found");
    }
}
