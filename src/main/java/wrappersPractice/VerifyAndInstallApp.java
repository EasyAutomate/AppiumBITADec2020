package wrappersPractice;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class VerifyAndInstallApp extends GenericWrappers {

	@Test
	public void runTC() {
		launchAndroidApp("deviceName", "", "", "", System.getProperty("user.dir")+"/apps/MultiTouch Tester_v1.2.apk");
		verifyAndInstallApp("com.the511plus.MultiTouchTester", System.getProperty("user.dir")+"/apps/MultiTouch Tester_v1.2.apk");
		switchToAnotherApp("com.the511plus.MultiTouchTester");
	}

}
