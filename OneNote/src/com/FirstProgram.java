package com;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class FirstProgram {

		// TODO Auto-generated method stub
	static  AndroidDriver dr=null;
		
		public static  AndroidDriver<AndroidElement> capabilities() throws MalformedURLException
		{
		

		// TODO Auto-generated method stub

		     DesiredCapabilities capabilities = new DesiredCapabilities();
		 
		     capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		     capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		     capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		 
		
		 	capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.microsoft.office.onenote" );

			capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.microsoft.office.onenote.ui.ONMSplashActivity" );
		   
		     capabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);

		 //    capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		    dr = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		   
		   return dr;
		}
}




