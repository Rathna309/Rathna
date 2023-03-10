package org.Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Browser {
    public static WebDriver driver;
    public static String fileProperties(String propertiesData)//browser
    {
        String returnData = null;
        try {
            String filelocation = System.getProperty("user.dir") + "//src//main//resources//Configuration//Configure.properties";
            File file = new File(filelocation);
            FileInputStream fileinput = new FileInputStream(file);
            Properties prop = new Properties();
            prop.load(fileinput);
            returnData = prop.getProperty(propertiesData); //browser
        }catch(Exception e)
        {
            System.out.println("Properties" + e);
        }
        return returnData;
    }
    public static void OpenBrowser(){
        String Choice=Browser.fileProperties("Browser");
        if(Choice.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }else if(Choice.equalsIgnoreCase("Mozilla")){
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
            driver.manage().window().maximize();
        }
    }
    public static void OpenUrl(String URL) throws InterruptedException {
        driver.get(URL);
        Thread.sleep(4000);
        driver.findElement(By.linkText("Accept")).click();
        Thread.sleep(5000);
    }
    public static void CloseBrowser(){
        driver.quit();
    }
}
