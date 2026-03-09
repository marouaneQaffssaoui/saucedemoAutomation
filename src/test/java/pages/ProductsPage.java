package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage {
    public ProductsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(className="title")
    WebElement pageTitle;

    @FindBy(id="add-to-cart-sauce-labs-backpack")
    WebElement addToCart;

    @FindBy(className="shopping_cart_link")
    WebElement shopingCart;

    public boolean isProductsPageDisplayed(){
        return pageTitle.isDisplayed();
    }
    public void addProductToCart(){
        addToCart.click();
    }
    public void openCart(){
        shopingCart.click();
    }
}
