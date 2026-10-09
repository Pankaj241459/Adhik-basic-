package Appiumpractice.com.Adhik;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Automatecalculator {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		UiAutomator2Options options = new UiAutomator2Options();

        // Android
        options.setPlatformName("Android");

        // Appium automation
        options.setAutomationName("UiAutomator2");

        // Real device
        options.setDeviceName("motorola motorola edge 60 pro");
        options.setUdid("ZA223GSZC5");
        options.setPlatformVersion("16");

        options.setAppPackage("com.google.android.calculator");
        options.setAppActivity("com.android.calculator2.Calculator");

        // Appium 3 server URL
        URL url = URI.create("http://127.0.0.1:4723/").toURL();

        // Start session
        AndroidDriver driver = new AndroidDriver(url, options);
        Thread.sleep(5000);
        System.out.println("Application started successfully");

       // click on 8
        WebElement num8 = driver.findElement(By.id("com.google.android.calculator:id/digit_8"));
        num8.click();
        //click on + sign
        WebElement plus = driver.findElement(By.id("com.google.android.calculator:id/op_add"));
        plus.click();
        
        //click on 2
        WebElement num2 = driver.findElement(By.id("com.google.android.calculator:id/digit_2"));
        num2.click();
        
        //click on =
        WebElement equalsign = driver.findElement(By.id("com.google.android.calculator:id/eq"));
        equalsign.click();
        
        WebElement result=driver.findElement(AppiumBy.id("com.google.android.calculator:id/formula"));
       String resultstring = result.getText();
       if(resultstring.equals("10"))
       {
    	   System.out.println("result is correct ");
       }
       else {
    	   System.out.println("result is wrong");
       }
       
        driver.quit();

	}

}
