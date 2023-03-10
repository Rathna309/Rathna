package org.example;

import org.Browser.Browser;
import org.Pages.Page1;
import org.Pages.Page2;
import org.Pages.Page3;

public class Sample {
    public static void main(String[] args) throws InterruptedException {
        Browser.OpenBrowser();
        Browser.OpenUrl("https://www.smartbazaar.co.uk/");
        Page1.SearchBox("flower");
        Page1.ClickEnter();
        System.out.println(Page2.SaveText());
        Page2.SelectProduct("MARIGOLD FLOWERS – ORANGE");
        System.out.println(Page3.PrintText());
        //Browser.CloseBrowser();
    }
}
