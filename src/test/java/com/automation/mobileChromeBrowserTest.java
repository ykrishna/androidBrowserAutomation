package com.automation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by sony on 24/12/2016.
 */
public class mobileChromeBrowserTest {

    private WebDriver driver;
    private DesiredCapabilities capabilities;
    private ChromeOptions options;
    private String path = "C:\\Users\\sony\\Desktop\\Developement\\chromeDriver\\2.26\\chromedriver.exe";
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver",path);
//		System.setProperty("webdriver.ie.driver","iedriverLocation");
//		Map<String,String> MobileEmulation = new HashMap<String,String>();
//		MobileEmulation.put("deviceName","Google Nexus 5");
//		Map<String,Object> chromeOptions = new HashMap<String, Object>();
//		chromeOptions.put("mobileEmulation",MobileEmulation);
        options = new ChromeOptions();
        options.setExperimentalOption("androidPackage", "com.android.chrome");
//		options.setExperimentalOption("androidDeviceSerial", "008abef36gh0ef65km4");
        capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        driver = new ChromeDriver(capabilities);
    }

    @Test
    public void chromeBrowserAutomationTest() {
        driver.get("http://www.google.co.uk");
    }

    @After
    public void tearDownSetUp(){
        driver.close();
    }
}
