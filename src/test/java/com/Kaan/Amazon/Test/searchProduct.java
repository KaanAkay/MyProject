package com.Kaan.Amazon.Test;
import com.Kaan.Amazon.Pages.SearchBox;
import com.Kaan.Amazon.Pages.SearchProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchProduct {
    WebDriver driver;


    SearchProductPage searchProductPage;

    @Given("clickToSearchBox")
    public void clicktosearchbox() {

        By submitButtonLocator = new By.ByCssSelector("//div//button[starts-with(@data-cy,\"search-find-button\")]");
        driver.findElement(submitButtonLocator).click();

    }

    @And("writeTheProductName")
    public void writetheproductname() {



    }

    @And("clickTheSubmitButton")
    public void clickthesubmitbutton() {




    }

}
