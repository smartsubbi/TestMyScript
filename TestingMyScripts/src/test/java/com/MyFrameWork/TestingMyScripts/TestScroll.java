package com.MyFrameWork.TestingMyScripts;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.net.InetAddress;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Factory.BrowserFactory;
import Factory.ConfigDataProviderFactory;
import Utility.CaptureScreenshot;
public class TestScroll 
{

	
	static DateFormat dateFormat = new SimpleDateFormat("E.MMMM.yyyy_HH.mm.ss[a]");
	static Date date = new Date();
	static String userDirectory =  System.getProperty("user.dir");
	static String emailReportPath = userDirectory+"/ExtentReports/SchoolOfDragonsLive_" +dateFormat.format(date) + ".html";
	static String path = userDirectory.replace("\\","/");
	static String reportPath = "\\\\172.20.11.105\\d\\JenkinsWorkspace\\LiveLoginTestCases\\ExtentReports\\SchoolOfDragonsLive_" +dateFormat.format(date) + ".html";	
	
//	@Test
//	public static void getIp() throws Throwable
//	{
////		InetAddress address = InetAddress.getLocalHost(); 
////	    String hostIP = address.getHostAddress() ;
////	    String hostName = address.getHostName();
////	    System.out.println( "IP: " + hostIP + "\n" + "Name: " + hostName);	    
////	    String splitDir[] = userDirectory.split(":");  
////		System.out.println(splitDir[1]); 		
////		String finalPath = "\\\\"+hostIP+splitDir[1];
////		System.out.println(finalPath);
//		
		//static File dir1 = new File("directory-source");
//		
//		if(dir1.isDirectory()) 
//		{
//		    File[] content = dir1.listFiles();
//		    System.out.println(content.length);
//		    for(int i = 0; i < content.length; i++) 
//		    {
//		    	File sourceFile = new File("D:/Files/"+content[i]);
//		    	File destinationFile = new File("D:/Files1/"+content[i]);		        
//		        FileUtils.moveFile(sourceFile, destinationFile);
//		    }
//		    System.out.println(content.length);
//		}
//	}
	
//	public static void main(String[] args) throws IOException {
//
//		//File sourceFile = new File("directory-source/test1.txt");
//		File destinationDir = new File("directory-destination");		
//		File sourceDir = new File("directory-source");
//		//System.out.println(sourceFile);
//
//		//FileUtils.moveFileToDirectory(sourceFile, destinationDir, true);
//		
//		
//		if(destinationDir.isDirectory()) 
//			{
//			    File[] content = sourceDir.listFiles();
//			    
//			    System.out.println(content.length);
//			    for(int i = 0; i < content.length; i++) 
//			    {
//			    	//sourceFile = new File(content[i]);
//			    	System.out.println(content[i]);
//			    	FileUtils.moveFileToDirectory(content[i], destinationDir, true);			
//			    }
//			    System.out.println(content.length);
//
//	}
//	}
	
	
//	public void testAuthChrome() throws Throwable
//	{
//		WebDriver driver;
//		System.setProperty("webdriver.chrome.driver", ConfigDataProviderFactory.getConfig().getChromePath());
//		driver = new ChromeDriver();
//		Runtime.getRuntime().exec("C:\\Users\\subramanyakb\\Desktop\\ChromeAuthetication.exe");
//		driver.get("http://staging.schoolofdragons.com/");
//		
//		System.out.println("Website opened");
//		
//		Thread.sleep(15000);
//		
//		CaptureScreenshot.takeScreenshot(driver, "Application");
//		
//		System.out.println("Screenshot taken");
//		
//		Thread.sleep(15000);
//		
//		Assert.assertTrue(driver.findElement(By.xpath("//div[@id='ctl00_logindiv']/a[2]")).isDisplayed());
//		
//		System.out.println("Element is present");	
//		
//		driver.close();
//		driver.quit();
//		
//		System.out.println("Closed all");
//		
//	}
	
	
//	public void naukri() throws Throwable
//	{
//		WebDriver driver;
//		System.setProperty("webdriver.chrome.driver", ConfigDataProviderFactory.getConfig().getChromePath());
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://dev.schoolofdragons.com/");
//		Thread.sleep(3000);
//		try {
//			Runtime.getRuntime().exec("C:/Users/subramanyakb/Desktop/ChromeAuthetication.exe");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}		
//		Thread.sleep(15000);
//		System.out.println("Page Load Done");
//		CaptureScreenshot.takeScreenshot(driver, "Application");
//		driver.findElement(By.xpath("//div[@id='ctl00_logindiv']/a[@title='Log in']"));
//		System.out.println("Element Verification Done");
//		driver.close();
//		driver.quit();	
//		
//	}
	
@Test
	public void autoriseMail() throws Throwable
	{	
//		WebDriver driver;			
//		FirefoxProfile profile = new FirefoxProfile();
//		profile.setPreference("network.automatic-ntlm-auth.trusted-uris",
//		"schoolofdragons.com");
//		profile.setPreference("network.automatic-ntlm-auth.allow-non-fqdn",
//				"true");
//		driver = new FirefoxDriver(profile);	    		
//		driver.get("http://qa.schoolofdragons.com/");	
//		driver.findElement(By.xpath("//div[@id='ctl00_logindiv']/a[.='Log in']"));	
//		
//		System.setProperty("USERNAME_CREATED", "subbuPlayer");
//		driver.close();
//		driver.quit();
		
//		ProcessBuilder pb = new ProcessBuilder("CMD", "/C", "SET");
//	    Map<String, String> env = pb.environment();
//	    env.put("MYVAR", "myValue");
//	    Process p = pb.start();
//	    InputStreamReader isr = new InputStreamReader(p.getInputStream());
//	    char[] buf = new char[1024];
//	    while (!isr.ready()) {
//	        ;
//	    }
//	    while (isr.read(buf) != -1) {
//	        System.out.println(buf);
//	    }

//		ProcessBuilder pb = new ProcessBuilder("/bin/sh"); // or any other program you want to run
//
//	    Map<String, String> envMap = pb.environment();
//
//	    envMap.put("MY_ENV_VAR", "1");
//	    Set<String> keys = envMap.keySet();
//	    for(String key:keys){
//	        System.out.println(key+" ==> "+envMap.get(key));
//	    }
//	 try
//	    {
//	        Class<?> processEnvironmentClass = Class.forName("java.lang.ProcessEnvironment");
//	        Field theEnvironmentField = processEnvironmentClass.getDeclaredField("theEnvironment");
//	        theEnvironmentField.setAccessible(true);
//	        Map<String, String> env = (Map<String, String>) theEnvironmentField.get(null);
//	        env.put("UsernameC","SubbuPlayer");
//	        Field theCaseInsensitiveEnvironmentField = processEnvironmentClass.getDeclaredField("theCaseInsensitiveEnvironment");
//	        theCaseInsensitiveEnvironmentField.setAccessible(true);
//	        Map<String, String> cienv = (Map<String, String>)     theCaseInsensitiveEnvironmentField.get(null);
//	        cienv.put("UsernameC","SubbuPlayer");
//	    }
//	    catch (NoSuchFieldException e)
//	    {
//	      try {
//	        Class[] classes = Collections.class.getDeclaredClasses();
//	        Map<String, String> env = System.getenv();
//	        for(Class cl : classes) {
//	            if("java.util.Collections$UnmodifiableMap".equals(cl.getName())) {
//	                Field field = cl.getDeclaredField("m");
//	                field.setAccessible(true);
//	                Object obj = field.get(env);
//	                Map<String, String> map = (Map<String, String>) obj;
//	                map.clear();
//	                map.put("UsernameC","SubbuPlayer");;
//	            }
//	        }
//	      } catch (Exception e2) {
//	        e2.printStackTrace();
//	      }
//	    } catch (Exception e1) {
//	        e1.printStackTrace();
//	    } 
//	System.setProperty( "usernamec", "SubbuPlayer" );
//	 
//	Field fieldSysPath = ClassLoader.class.getDeclaredField( "sys_paths" );
//	fieldSysPath.setAccessible( true );
//	fieldSysPath.set( null, null );
//	System.out.println(System.getProperty("usernamec"));
//	
//	AbstractBuild currentBuild = (AbstractBuild) Thread.currentThread().executable;
//
//	ParametersAction newParamAction = new hudson.model.ParametersAction(new hudson.model.StringParameterValue(“TEST_TEMP_VAR”,”value28″));
//
//	currentBuild.addAction(newParamAction);
	String emailIdToSend = System.getProperty("BUILD_NUMBER");
	
	System.out.println("Build number is : "+emailIdToSend);
	   String workingDir = System.getProperty("user.dir");
	   System.out.println("Current working directory : " + workingDir);
	}
	
	
//	public static void main(String[] args) throws IOException {
//
//		ProcessBuilder pb = new ProcessBuilder("/bin/sh"); // or any other program you want to run
//
//	    Map<String, String> envMap = pb.environment();
//
//	    envMap.put("MY_ENV_VAR", "1");
//	    Set<String> keys = envMap.keySet();
//	    for(String key:keys){
//	        System.out.println(key+" ==> "+envMap.get(key));
//	    }
//	}

	 public static void scrollToBottom(WebDriver driver) throws Throwable 
	 {				 
		 Actions action = new Actions(driver);  
	     action.sendKeys(Keys.PAGE_DOWN);  
	     Thread.sleep(5000);  
	     action.click(driver.findElement(By.xpath("//html[@id='ng-app']/body/section/div/div[1]/img[@class='brand-img img-responsive']"))).perform();  	       
	 } 
	
	

}
