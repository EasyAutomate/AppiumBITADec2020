package wrappersPractice;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class LaunchAndroidApp extends GenericWrappers {

	@Test
	public void runTC() {
//		launchAndroidApp("deviceName", "com.the511plus.MultiTouchTester", "com.the511plus.MultiTouchTester.MultiTouchTester",
//				"", "");
		launchAndroidApp("deviceName", "", "", "", System.getProperty("user.dir")+"/apps/MultiTouch Tester_v1.2.apk");
	}

}
