package TestngListenersConcept;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {
	
	public static WebDriver driver;
	
	
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver","G:\\mounika se\\selenium workspace\\selenium libraries\\project171\\browser_drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("http://www.google.com");
	}

	public void failed() {
		try {
			Date d=new Date();
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MMM/dd/ hh-mm-ss");
			String time=sdf.format(d);
			File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("G:\\mounika se\\selenium workspace\\selenium libraries\\maven workspace\\failedtcscreenshots\\Capture\\"+"failshot_"+this.getClass().getName()+"-"+time+".png"));
		} catch (Exception e) {
			
			System.out.println("failed testcase"+e.getMessage());
		}
	}

	
	
	
}

