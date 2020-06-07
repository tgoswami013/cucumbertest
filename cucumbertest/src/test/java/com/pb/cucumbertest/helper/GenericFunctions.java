package com.pb.cucumbertest.helper;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class GenericFunctions extends Base
{

	public static String getBase64Screenshot() throws IOException 
	{
		String Base64StringofScreenshot="";
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		    
		Date oDate = new Date();
		SimpleDateFormat oSDF = new SimpleDateFormat("ddMMYYYY_HHmmss");
		String sDate = oSDF.format(oDate);
		FileUtils.copyFile(src, new File(screenshotdir + "Screenshot_" + sDate + ".png"));
		    
		byte[] fileContent = FileUtils.readFileToByteArray(src);
		Base64StringofScreenshot = "data:image/png;base64," + Base64.getEncoder().encodeToString(fileContent);
		return Base64StringofScreenshot;
	}

}
