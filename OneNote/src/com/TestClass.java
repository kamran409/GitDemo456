package com;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.AndroidKeyMetastate;

public class TestClass extends FirstProgram{
//public static AndroidDriver dr;
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver=capabilities();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		dr.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	//dr.findElement(By.id("com.microsoft.office.onenote:id/getStartedButton")).click();
	//	dr.findElementById("com.microsoft.office.onenote:id/signin_input").sendKeys("kamrank19@microsoft.com");
		//dr.findElementById("com.microsoft.office.onenote:id/signin_next").click();
		//dr.findElementByXPath("//android.widget.EditText[@text='Password']").sendKeys("1111cccc");
	
		//dr.findElementById("i0118").sendKeys("Intune123!");
	//	dr.findElementByXPath("//android.widget.EditText[@text='Password']").sendKeys("Intune123!");
		//dr.findElementByXPath("//android.widget.Button[@text='Sign in']").click();
		//dr.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
	
		dr.findElement(By.xpath("//android.widget.Button[@text='Get Started']")).click();
		dr.findElementById("com.microsoft.office.onenote:id/action_notebook_mode").click();
	
		dr.findElementById("com.microsoft.office.onenote:id/options_newnotebook").click();

		dr.findElementById("com.microsoft.office.onenote:id/field_input_middle").sendKeys("ksspStSarapohuhjjsfhksasdasaf");
		dr.findElementById("android:id/button1").click();	
		
		
		dr.findElementByXPath("//android.view.ViewGroup[@index='2']").click();
		
		dr.findElementById("com.microsoft.office.onenote:id/section_entry_recycler").click();

		
		
		dr.findElementById("com.microsoft.office.onenote:id/entry_title").click();
	
		dr.findElementByXPath("//android.view.ViewGroup[@index='0']").click();


	
	
		
		//System.out.println(dr.findElementsByXPath("//android.widget.RelativeLayout[@index='5']").contains("kamran"));
	//	Boolean is=dr.findElementById("com.microsoft.office.onenote:id/airspace_page_hostwindow").getSize()!=0;
		//if(dr.getPageSource().contains("Kamran")) {
	  //      System.out.println("PASS");
	  //  } else {
	 //       System.out.println("FAIL");
	  //  }
		//boolean isTheTextPresent = driver.getPageSource().contains("kamran");
		//assertTrue(isTheTextPresent);
//	Assert.assertEquals(dr.findElementByXPath("//android.widget.FrameLayout[@index='0']").getCssValue("style"), "kamran");
		
	
	//Assert.assertTrue(dr.findElementById("com.microsoft.office.onenote:id/canvasContainer").isDisplayed());
		
		//	dr.findElementByXPath("//android.widget.TextView[@index='1']").click();

	/*	dr.findElementById("com.microsoft.office.onenote:id/lenssdk_button_capture").click();
			
		
		dr.findElementByXPath("//*[@content-desc='Done Button']").click();
		
	
		
		dr.findElementByXPath("//android.view.ViewGroup[@index='0']").click();
		JavascriptExecutor js = (JavascriptExecutor)dr;
        MobileElement t1=null;
		
		t1 =(MobileElement) js.executeScript("return document.getElementsByClassName('//android.view.ViewGroup[index='2']");
		t1.sendKeys("adada"); */
	

	dr.findElementById("com.microsoft.office.onenote:id/button_pictures").click();
		
		//dr.findElementByXPath("//android.widget.TextView[@index='1']").click();
		
		dr.findElementById("com.microsoft.office.onenote:id/lenssdk_button_capture").click();
		
	
	dr.findElementByXPath("//*[@content-desc='Done Button']").click();
	
	dr.findElementById("com.microsoft.office.onenote:id/button_todotag").click();
	
	dr.findElementById("com.microsoft.office.onenote:id/button_audio").click();




	dr.findElementById("com.microsoft.office.onenote:id/audio_notes_stop").click();
	
	//dr.findElementById("com.microsoft.office.onenote:id/button_insert_file").click();

	//dr.findElementByXPath("//android.widget.TextView[@text='VID-20191203-WA0001.mp4']").click();

	dr.findElementById("com.microsoft.office.onenote:id/button_bulletlist").click();
	
	dr.findElementById("com.microsoft.office.onenote:id/button_numberlist").click();

	
	dr.findElementById("com.microsoft.office.onenote:id/scroll_button").click();
	

	dr.findElementById("com.microsoft.office.onenote:id/button_bold").click();

	dr.findElementById("com.microsoft.office.onenote:id/button_italic").click();

	dr.findElementById("com.microsoft.office.onenote:id/button_underline").click();
	
	dr.findElementById("com.microsoft.office.onenote:id/button_strikethrough").click();

	dr.findElementById("com.microsoft.office.onenote:id/button_highlight").click();
	
	dr.findElementById("com.microsoft.office.onenote:id/button_link").click();

dr.findElementById("com.microsoft.office.onenote:id/field_input_bottom").sendKeys("www.google.com");

dr.findElementById("com.microsoft.office.onenote:id/positiveButton").click();

dr.findElementById("com.microsoft.office.onenote:id/options_toggle_inkmode").click();

dr.findElementById("com.microsoft.office.onenote:id/pen_tools_eraser").click();


dr.findElementById("com.microsoft.office.onenote:id/pen_tools_lasso").click(); 


	}

}
