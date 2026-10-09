package Appiumpractice.com.Adhik;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Meatynsloginpage {

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

        options.setAppPackage("com.example.adhik_pos");
        options.setAppActivity("com.example.adhik_pos.MainActivity");

        // Appium 3 server URL
        URL url = URI.create("http://127.0.0.1:4723/").toURL();

        // Start session
        AndroidDriver driver = new AndroidDriver(url, options);
        Thread.sleep(5000);
        System.out.println("Application started successfully");
        
        // Token
        Thread.sleep(2000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement token = wait.until(
        	    ExpectedConditions.presenceOfElementLocated(
        	        By.xpath("//android.widget.EditText")
        	    )
        	);

        	token.click();
        	token.sendKeys("MEATYNS0626");

      
        
        
        //click on submit button
        driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Submit\"]")).click();
        
        
        // login
        WebElement username = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.EditText[1]"));
        username.click();
        username.sendKeys("mbazar");
        
        WebElement password = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.EditText[2]"));
        password.click();
        password.sendKeys("Pankaj@123");
        
        WebElement loginbutton = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Login\"]"));
        loginbutton.click();
        
        driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
        
        WebElement menubutton = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button"));
        Actions act = new Actions(driver);
        act.moveToElement(menubutton).click().build().perform();   
        
        WebElement changepassword = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Change Password\"]"));
        Actions act1 = new Actions(driver);
        act1.moveToElement(changepassword).click().build().perform(); 
        
        WebElement oldpassword = driver.findElement(By.xpath("//android.widget.ScrollView/android.widget.EditText[1]"));
        oldpassword.click();
        oldpassword.sendKeys("123");
        
        WebElement newpassword = driver.findElement(By.xpath("//android.widget.ScrollView/android.widget.EditText[2]"));
        newpassword.click();
        newpassword.sendKeys("Pankaj@123");
        
        WebElement changepassword1 = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Change Password\"]"));
        changepassword1.click();
        
        driver.quit();
        
    
        
}}
