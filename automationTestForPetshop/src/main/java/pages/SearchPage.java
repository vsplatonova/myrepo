package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage extends AbstractPage {


    public SearchPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//button[@data-testid=\"InputSearch__btn\"]")
    private WebElement searchBtn;
    @FindBy(xpath = "//input[@data-testid='InputSearch__input-empty']")
    private WebElement search;

    public List<WebElement> findResultPurina() {

        return getDriver().findElements(By.xpath("//*[contains(text(),' Purina One ')]"));
    }

    public List<WebElement> findResultPuppy() {

        return getDriver().findElements(By.xpath("//*[contains(text(),'корм для щенков')]"));
    }

    public List<WebElement> findResultRoalCanin() {

        return getDriver().findElements(By.xpath("//*[contains(text(),'корм для щенков')]"));
    }

    public List<WebElement> findResultCats() {

        return getDriver().findElements(By.xpath("//li[@data-testid=\"product__item\"]"));
    }


    public SearchPage clickSearch() {
        search.click();
        return this;

    }

    public SearchPage enterItem(String item) {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(search).sendKeys(item).click().build().perform();
        return this;
    }

    public SearchPage clickToFind() {
        searchBtn.click();
        return this;
    }

    public void scrollPage() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,5000)");
    }


}
