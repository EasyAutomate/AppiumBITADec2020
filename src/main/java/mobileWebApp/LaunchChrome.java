package mobileWebApp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class LaunchChrome {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		DesiredCapabilities dc = new DesiredCapabilities();
		// dc.setCapability("avd", "Pixel");
		dc.setCapability("deviceName", "My Android Device");
		dc.setCapability("browserName", "Chrome");
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		AppiumDriver<WebElement> driver = new AndroidDriver<WebElement>(url, dc);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.goglobalwithtwitter.com/en");
		driver.findElementByXPath("//button[@aria-label=\"Open Menu\"]").click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions
				.elementToBeClickable(driver.findElementByXPath("//*[text()='Get Started with Ads']"))).click();
		// driver.findElementByXPath("//*[text()='Get Started with Ads']").click();
	}
}
