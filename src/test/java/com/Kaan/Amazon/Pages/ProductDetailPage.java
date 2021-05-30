package com.Kaan.Amazon.Pages;

import com.Kaan.Amazon.Util.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {
    By addToBasketButton = By.id("add-to-basket");


    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductDetailPage() {
        return isDisplayed(addToBasketButton);
    }

    public void addtoBasket() {
        click(addToBasketButton);









    }
}
