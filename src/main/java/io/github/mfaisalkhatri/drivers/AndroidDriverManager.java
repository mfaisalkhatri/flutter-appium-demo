package io.github.mfaisalkhatri.drivers;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class AndroidDriverManager {
    private AndroidDriver driver;

    public void createFlutterDriver() throws MalformedURLException {
        final DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName", "Pixel 6 Pro API 30");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("app", System.getProperty("user.dir") + "/src/test/resources/flutter_app/provider_shopper_faisal.apk");
        capabilities.setCapability("automationName", "Flutter");
        this.driver = new AndroidDriver(new URL("http://0.0.0.0:4723/"), capabilities);

        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    public AndroidDriver get() {
        return this.driver;
    }

    public void quitDriver() {
        this.driver.quit();
    }


}
