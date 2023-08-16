package io.github.mfaisalkhatri.pages;

import io.appium.java_client.android.AndroidDriver;
import io.github.ashwith.flutter.FlutterElement;
import io.github.ashwith.flutter.FlutterFinder;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.List;

public class CatalogPage {

    private final FlutterFinder finder;

    public CatalogPage(final AndroidDriver driver) {
        this.finder = new FlutterFinder(driver);
    }

    public String pageTitle() {
        return this.finder.byText("Catalog").getText();
    }

}
