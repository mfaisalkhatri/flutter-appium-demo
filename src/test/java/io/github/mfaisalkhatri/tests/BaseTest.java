package io.github.mfaisalkhatri.tests;

import java.net.MalformedURLException;

import io.github.mfaisalkhatri.drivers.AndroidDriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected AndroidDriverManager driverManager;

    @BeforeClass (alwaysRun = true)
    public void setup () throws MalformedURLException {
        this.driverManager = new AndroidDriverManager ();
        this.driverManager.createFlutterDriver ();
    }

    @AfterClass (alwaysRun = true)
    public void tearDown () {
        this.driverManager.quitDriver ();
    }
}
