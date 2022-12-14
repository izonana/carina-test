package com.solvd.carina.demo.xataka;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.solvd.carina.demo.gui.components.xataka.HeaderMenu;
import com.solvd.carina.demo.gui.components.xataka.SideMenu;
import com.solvd.carina.demo.gui.pages.xataka.HomePage;
import com.solvd.carina.demo.gui.pages.xataka.MobilePage;
import com.solvd.carina.demo.gui.pages.xataka.PhotoPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class XatakaWebTest implements IAbstractTest {
    @Test
    public void testPageIsOpened(){
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(),"Home page didn't open");
    }
    @Test
    public void testMobilePageHeaderButtonsText(){
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        MobilePage mobilePage = homePage.getFooterMenu().openMobilePage();
        HeaderMenu headerMenu = mobilePage.getHeaderMenu();
        Assert.assertTrue(headerMenu.headerButtonNamed("ANÁLISIS"),"Button name not found");
        Assert.assertTrue(headerMenu.headerButtonNamed("COMPARATIVA TARIFAS"),"Button name not found");
        Assert.assertTrue(headerMenu.headerButtonNamed("APLICACIONES"),"Button name not found");
        Assert.assertTrue(headerMenu.headerButtonNamed("JUEGOS"),"Button name not found");
        Assert.assertTrue(headerMenu.headerButtonNamed("GUÍAS DE COMPRA"),"Button name not found");
        Assert.assertTrue(headerMenu.headerButtonNamed("OFERTAS MÓVILES"),"Button name not found");
    }
    @Test
    public void testPhotoPageHeaderButtonsText(){
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        PhotoPage photoPage = homePage.getFooterMenu().openPhotoPage();
        HeaderMenu headerMenu = photoPage.getHeaderMenu();
        Assert.assertTrue(headerMenu.headerButtonNamed("ANÁLISIS"),"Button name not found");
        Assert.assertTrue(headerMenu.headerButtonNamed("ACTUALIDAD"),"Button name not found");
        Assert.assertTrue(headerMenu.headerButtonNamed("TRUCOS FOTOGRAFÍA"),"Button name not found");
        Assert.assertTrue(headerMenu.headerButtonNamed("TUTORIALES"),"Button name not found");
        Assert.assertTrue(headerMenu.headerButtonNamed("GUÍAS"),"Button name not found");
        Assert.assertTrue(headerMenu.headerButtonNamed("FOTÓGRAFOS"),"Button name not found");
        Assert.assertTrue(headerMenu.headerButtonNamed("FOTOGRAFÍA MÓVIL"),"Button name not found");
    }

    @Test
    public void testMobilePageSideMenuButtonsText(){
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        MobilePage mobilePage = homePage.getFooterMenu().openMobilePage();
        SideMenu sideMenu = mobilePage.getSideMenu();
        Assert.assertTrue(sideMenu.categoryButtonNamed("Movistar"),"Button name not found");
        Assert.assertTrue(sideMenu.categoryButtonNamed("Apple"),"Button name not found");
        Assert.assertTrue(sideMenu.categoryButtonNamed("Samsung"),"Button name not found");
        Assert.assertTrue(sideMenu.categoryButtonNamed("Análisis"),"Button name not found");
        Assert.assertTrue(sideMenu.categoryButtonNamed("Aplicaciones"),"Button name not found");
        Assert.assertTrue(sideMenu.categoryButtonNamed("Mercado"),"Button name not found");
        Assert.assertTrue(sideMenu.categoryButtonNamed("Juegos"),"Button name not found");
        Assert.assertTrue(sideMenu.categoryButtonNamed("Android"),"Button name not found");
        Assert.assertTrue(sideMenu.categoryButtonNamed("Vodafone tarifas ofertas"),"Button name not found");
        Assert.assertTrue(sideMenu.categoryButtonNamed("Xiaomi"),"Button name not found");
        Assert.assertTrue(sideMenu.categoryButtonNamed("Smartphones Chinos"),"Button name not found");
        Assert.assertTrue(sideMenu.categoryButtonNamed("Conectividad y Redes"),"Button name not found");
    }
}
