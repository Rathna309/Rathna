package org.Pages;


import org.Browser.Browser;
import org.PageObjects.PageObject3;

public class Page3 extends Browser {
    static PageObject3 obj3;
    public static String PrintText() throws InterruptedException {
        Thread.sleep(3000);
        obj3=new PageObject3();
        return obj3.PrintText().getText();
    }
}
