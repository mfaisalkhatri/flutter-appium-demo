package io.github.mfaisalkhatri.tests;

import io.github.mfaisalkhatri.pages.CatalogPage;
import io.github.mfaisalkhatri.pages.LoginPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FlutterSampleAppTests extends BaseTest {


    @Test
    public void testProviderShopperApp() {
        final LoginPage loginPage = new LoginPage(this.driverManager.get());
        final CatalogPage catalogPage = loginPage.performLogin("faisal.k@user.com", "Pass1234");
        assertEquals(catalogPage.pageTitle(), "Catalog");
    }
}
