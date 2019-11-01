package com.test;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.TouchAction;
import java.time.Duration;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.junit.*;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.Level;

public class swipetest {

    protected AndroidDriver<AndroidElement> driver = null;

    DesiredCapabilities dc = new DesiredCapabilities();

    @Before
    public void setUp() throws MalformedURLException {

        dc.setCapability(MobileCapabilityType.UDID, "AEUBB18307506891");
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.yamba.yamba.yamba");
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".SplashScreenActivity");
        driver = new AndroidDriver<>(new URL("http://localhost:4722/wd/hub"), dc);
        driver.setLogLevel(Level.INFO);
    }

    @Test
    public void testswipetest2() {
        new TouchAction(driver).press(469, 998).waitAction(Duration.ofMillis(690)).moveTo(443, 239).release().perform();
        new TouchAction(driver).press(358, 852).waitAction(Duration.ofMillis(543)).moveTo(330, 509).release().perform();
        new TouchAction(driver).press(271, 1024).waitAction(Duration.ofMillis(698)).moveTo(284, 430).release().perform();
        new TouchAction(driver).press(364, 1026).waitAction(Duration.ofMillis(655)).moveTo(332, 613).release().perform();
        new TouchAction(driver).press(430, 1041).waitAction(Duration.ofMillis(1077)).moveTo(360, 554).release().perform();
        new TouchAction(driver).press(135, 724).waitAction(Duration.ofMillis(706)).moveTo(145, 324).release().perform();
        new TouchAction(driver).press(309, 879).waitAction(Duration.ofMillis(381)).moveTo(254, 420).release().perform();
        new TouchAction(driver).press(288, 805).waitAction(Duration.ofMillis(470)).moveTo(241, 350).release().perform();
        new TouchAction(driver).press(296, 954).waitAction(Duration.ofMillis(520)).moveTo(279, 447).release().perform();
        new TouchAction(driver).press(545, 1016).waitAction(Duration.ofMillis(518)).moveTo(456, 509).release().perform();
        new TouchAction(driver).press(507, 898).waitAction(Duration.ofMillis(746)).moveTo(447, 501).release().perform();
        new TouchAction(driver).press(467, 794).waitAction(Duration.ofMillis(491)).moveTo(575, 315).release().perform();
        driver.pressKeyCode(AndroidKeyCode.HOME);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}