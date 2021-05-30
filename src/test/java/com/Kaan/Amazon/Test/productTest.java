package com.Kaan.Amazon.Test;

import com.Kaan.Amazon.Pages.BasketPage;
import com.Kaan.Amazon.Pages.SearchProductPage;
import com.Kaan.Amazon.Pages.ProductDetailPage;
import com.Kaan.Amazon.Pages.ProductsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class productTest {

    ProductsPage productsPage;
    ProductDetailPage productDetailPage;
    SearchProductPage productPage;
    BasketPage basketPage;

    public productTest(){
    }

    @And("selectTheRandomProduct")
    public void selecttherandomproduct() {

        productsPage.selectProduct(1);
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage(), "Not on product detail page");
    }

    @Then("goToBasket")
    public void gotobasket() {

        productPage.goToBasket();
        Assertions.assertTrue(basketPage.checkIfProductAdded(),"product did not add anything!!");
    }

    @And("addTheProductBasket")
    public void addtheproductbasket() {

    productDetailPage.addtoBasket();

    Assertions.assertTrue(productPage.isProductCountUp(),
            "product count did not increase");
    }
    @When("clickToBasketButton")
    public void clicktobasketbutton() {  }

    @Then("controlCountTheBasket")
    public void controlcountthebasket() {

    }
}
