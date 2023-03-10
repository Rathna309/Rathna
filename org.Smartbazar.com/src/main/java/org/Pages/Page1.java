package org.Pages;

import org.Browser.Browser;
import org.PageObjects.PageObject1;

public class Page1 extends Browser {
    static PageObject1 obj1;
    public static void SearchBox(String data){
        obj1=new PageObject1();
        obj1.SearchBox().sendKeys(data);

    }
    public static void ClickEnter(){
        obj1.ClickEnter().submit();

    }
    public static String getTtitle1(){
        return driver.getTitle();

    }
}
