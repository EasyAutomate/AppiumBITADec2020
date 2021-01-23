package wrappersPractice;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class ScrollPinchZoomPractice extends GenericWrappers {

	@Test
	public void runTC() {
		launchAndroidApp("My samsung", "com.the511plus.MultiTouchTester",
				"com.the511plus.MultiTouchTester.MultiTouchTester", "", "");
		scrollFromDownToUpinAppUsingPointerInput();
		scrollFromDownToUpinAppUsingTouchActions();
		scrollFromLeftToRightInAppUsingPointerInput();
		scrollFromLeftToRightInAppUsingTouchActions();
		scrollFromRightToLeftInAppUsingPointerInput();
		scrollFromRightToLeftInAppUsingTouchActions();
		scrollFromUpToDowninAppUsingPointerInput();
		scrollFromUpToDowninAppUsingTouchActions();
		pinchUsingPointerInput();
		pinchUsingTouchActions();
		zoomUsingTouchActions();
		ZoomUsingPointerInput();
	}

}
