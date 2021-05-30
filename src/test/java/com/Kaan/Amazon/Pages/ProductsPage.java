package com.Kaan.Amazon.Pages;
import com.Kaan.Amazon.Util.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class ProductsPage extends BasePage {

    By productNameLocator = new By.ByCssSelector("img.img-cont");

    public ProductsPage(WebDriver driver) {

        super(driver);
    }


    public void selectProduct(int i) {
        getAllProducts().get(i).click();


    }

    private List<WebElement> getAllProducts(){

       return findAll(productNameLocator);
    }


}

