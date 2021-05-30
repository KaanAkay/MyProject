package com.Kaan.Amazon.Pages;

import com.Kaan.Amazon.Util.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasketPage extends BasePage {

By productNameLocator = new By.ByCssSelector("//div[starts-with(@class,\"gg-w-11 gg-d-10 gg-t-8 gg-m-18 pull-right-m\")]");

public boolean checkIfProductAdded(){
    return getProducts().size()>0;

}

    public BasketPage(WebDriver driver) {

    super(driver);
    }

    private List<WebElement> getProducts(){

        return findAll(productNameLocator);


    }

}
