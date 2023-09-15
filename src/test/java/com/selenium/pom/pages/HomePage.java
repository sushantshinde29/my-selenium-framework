package com.selenium.pom.pages;

import com.selenium.pom.base.BasePage;
import org.openqa.selenium.WebDriver;
import com.selenium.pom.pages.components.MyHeader;
import com.selenium.pom.pages.components.ProductThumbnail;

public class HomePage extends BasePage {
    public MyHeader getMyHeader() {
        return myHeader;
    }

    public ProductThumbnail getProductThumbnail() {
        return productThumbnail;
    }

    private MyHeader myHeader;
    private ProductThumbnail productThumbnail;

    public HomePage(WebDriver driver) {
        super(driver);
        myHeader = new MyHeader(driver);
        productThumbnail = new ProductThumbnail(driver);
    }

    public HomePage load(){
        load("/");
        return this;
    }
}
