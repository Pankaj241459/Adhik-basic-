package Appiumpractice.com.Adhik;

import java.net.URI;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class appinstallinrealdevice {
	public static void main(String[] args) throws Exception {

        UiAutomator2Options options = new UiAutomator2Options();
        //change for git

        // Android
        options.setPlatformName("Android");

        // Appium automation
        options.setAutomationName("UiAutomator2");

        // Real device
        options.setDeviceName("motorola motorola edge 60 pro");
        options.setUdid("ZA223GSZC5");
        options.setPlatformVersion("16");

        // APK
        options.setApp("D:\\Mobile testing\\meatyns_10_08_26.apk");

        // Appium 3 server URL
        URL url = URI.create("http://127.0.0.1:4723/").toURL();

        // Start session
        AndroidDriver driver = new AndroidDriver(url, options);

        System.out.println("Application started successfully");

        Thread.sleep(30000);

        driver.quit();
    }
}