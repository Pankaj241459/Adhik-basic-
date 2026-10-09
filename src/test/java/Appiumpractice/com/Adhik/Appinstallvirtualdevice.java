package Appiumpractice.com.Adhik;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Appinstallvirtualdevice
{

	public static void main(String[] args) throws Exception {

	    UiAutomator2Options options = new UiAutomator2Options();
	    //change

	    // Platform
	    options.setPlatformName("Android");

	    // Appium / UiAutomator2
	    options.setAutomationName("UiAutomator2");

	    // Emulator details
	    options.setDeviceName("Android emulator");
	    options.setUdid("emulator-5554");
	    options.setPlatformVersion("17");

	    // APK path
	    options.setApp("D:\\Mobile testing\\meatyns_10_08_26.apk");

	    // Appium Server URL
	    URL url = URI.create("http://127.0.0.1:4723/wd/hub").toURL();

	    // Start Appium session
	    AndroidDriver driver = new AndroidDriver(url, options);

	    System.out.println("App installation/session started successfully");

	    Thread.sleep(30000);

	    driver.quit();
	}}
