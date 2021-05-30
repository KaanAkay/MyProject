package com.Kaan.Amazon.Pages;
import com.Kaan.Amazon.Util.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class SearchBox extends BasePage {

    By searchBoxLocator = new By.ByCssSelector("//input[@type=\"text\"][1]");
    By submitButtonLocator = new By.ByCssSelector("//div//button[starts-with(@data-cy,\"search-find-button\")]");

        public SearchBox(WebDriver driver) {
            super(driver);
        }


        public void search(String text) {
        type(searchBoxLocator, text);
        click(submitButtonLocator);


    }

}
