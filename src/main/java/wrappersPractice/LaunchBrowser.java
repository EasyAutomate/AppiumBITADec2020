package wrappersPractice;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class LaunchBrowser extends GenericWrappers {

	@Test
	public void runTC() {
		launchChromeBrowser("myDevice", "http://www.google.com");
		enterValue(getWebElement(Locators.XPATH.toString(), "//*[@name='q']"), "Lokesh");
		pressEnter();

	}
}
