package io.github.mfaisalkhatri.pages;

import io.github.ashwith.flutter.FlutterFinder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LoginPage {

    private final RemoteWebDriver driver;
    private final FlutterFinder finder;

    public LoginPage(final RemoteWebDriver driver) {
        this.driver = driver;
        this.finder = new FlutterFinder(driver);
    }

    private WebElement userNameField() {
        return this.finder.byValueKey("username");
    }

    private WebElement passwordField() {
        return this.finder.byValueKey("password");
    }

    private WebElement enterBtn() {
        return this.finder.byText("ENTER");
    }

    public CatalogPage performLogin(final String userName, final String password) {
        this.userNameField().sendKeys(userName);
        this.passwordField().sendKeys(password);
        this.enterBtn().click();
        return new CatalogPage(this.driver);

    }


}
