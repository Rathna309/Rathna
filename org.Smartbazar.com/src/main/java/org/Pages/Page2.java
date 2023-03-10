package org.Pages;

import org.Browser.Browser;
import org.PageObjects.PageObject2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Page2 extends Browser {
    static PageObject2 obj2;
    public static  void SelectProduct(String data1) throws InterruptedException {
        Thread.sleep(2000);
        List<WebElement> Testdata=obj2.SelectProduct().findElements(By.xpath(".//li/div/div/div[3]/div[1]/h4/a"));
        Actions a=new Actions(driver);
        for(int i=0;i<Testdata.size();i++){
            String Tdata=Testdata.get(i).getText();
            if(Tdata.equalsIgnoreCase(data1))
            {
                a.moveToElement(Testdata.get(i)).click().build().perform();
                break;
            }
            //System.out.println(Tdata);
        }

    }
    public static String SaveText() {
        obj2=new PageObject2();
        return obj2.SaveText().getText();
    }
}
