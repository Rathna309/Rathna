package org.PageObjects;

import org.Browser.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject1 extends Browser {
    public PageObject1() {

        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//input[@class='aws-search-field']")
    WebElement var;
    public WebElement SearchBox(){
        return var;
        }
        @FindBy(className = "aws-search-btn_icon")
        WebElement click;
    public WebElement ClickEnter(){
        return click;
    }


}
