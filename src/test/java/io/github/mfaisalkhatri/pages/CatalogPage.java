package io.github.mfaisalkhatri.pages;

import io.appium.java_client.android.AndroidDriver;
import io.github.ashwith.flutter.FlutterFinder;

public class CatalogPage {

    private final FlutterFinder finder;

    public CatalogPage (final AndroidDriver driver) {
        this.finder = new FlutterFinder (driver);
    }

    public String pageTitle () {
        return this.finder.byText ("Catalog")
            .getText ();
    }
}