package com.Kaan.Amazon.Pages;
import com.Kaan.Amazon.Util.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SearchProductPage extends BasePage {

    SearchBox searchBox;

    By shippingOptionLocator = new By.ByCssSelector("//div[starts-with(@class,\"title arrowDown\")]");
    By basketCountLocator = new By.ByCssSelector("//div//span[starts-with(@class,\"notify-user basket-item-count\")]");
    By basketContainerLocator = new By.ByCssSelector("//div[starts-with(@class,\"basket-icon-title hidden-m hidden-t\")]");

    public SearchProductPage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);

    }

    public SearchBox searchBox() {
        return this.searchBox;
    }

    public boolean isProductCountUp() {
        return getBasketCount()>0;
    }

    public boolean isOnProductPage() {

        return isDisplayed(shippingOptionLocator);
    }

    public void goToBasket() {
        click(basketContainerLocator);

    }

    private int getBasketCount(){
        String count = find(basketCountLocator).getText();
        return Integer.parseInt(count);

    }


}

