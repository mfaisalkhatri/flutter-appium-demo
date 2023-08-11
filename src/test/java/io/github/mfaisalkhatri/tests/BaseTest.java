package io.github.mfaisalkhatri.tests;

import io.github.mfaisalkhatri.drivers.AndroidDriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;


public class BaseTest {

    protected AndroidDriverManager driverManager;
    @BeforeClass(alwaysRun = true)
    public void setup() throws MalformedURLException {
        this.driverManager = new AndroidDriverManager();
        this.driverManager.createFlutterDriver();
    }



    @AfterClass(alwaysRun = true)
    public void tearDown() {
        this.driverManager.quitDriver();
    }
}
