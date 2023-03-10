package org.PageObjects;

import org.Browser.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject2 extends Browser {
    public PageObject2(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//*[@class='products columns-5']")
    WebElement var1;

    public WebElement SelectProduct(){
        return var1;
    }
    @FindBy(xpath="//div[@id='content']/nav")
    WebElement var2;
    public WebElement SaveText(){
        return var2;
    }
}
