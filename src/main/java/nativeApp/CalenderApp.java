package nativeApp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class CalenderApp {
	
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "My Android Device");
		//If the Application to test is not installed
		//dc.setCapability("app", "Path of the APK file");
		//If the Application to test is already installed
		dc.setCapability("appPackage", "com.samsung.android.calendar");
		dc.setCapability("appActivity", "com.samsung.android.app.calendar.activity.MainActivity");
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		AppiumDriver<WebElement> driver = new AndroidDriver<WebElement>(url, dc);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("(//android.view.View[@content-desc=\" \"])[2]").click();
		System.out.println(driver.findElementById("com.samsung.android.calendar:id/title").getText());
	}

}
