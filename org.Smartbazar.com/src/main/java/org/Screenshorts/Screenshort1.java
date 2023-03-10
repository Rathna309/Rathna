package org.Screenshorts;

import org.Browser.Browser;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;


public class Screenshort1 extends Browser {
    public static void ScreenShot(String name) throws Exception {
        try {
            TakesScreenshot scrShot =((TakesScreenshot)driver);

            File Src=scrShot.getScreenshotAs(OutputType.FILE);

            String filePath = System.getProperty("user.dir")+"//target//Screenshot//"+name+".png";
            File Dest=new File(filePath);
            FileUtils.copyFile(Src, Dest);
        }catch (Exception e)
        {
            System.out.println("Screen Captured");
        }

    }
}
