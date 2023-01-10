package testCases;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import pages.SearchPage;

import java.util.List;


public class SearchMainTest extends ConstantSettings {
    @Test
    public void searchMeal() {
        setDriver();
        initMainPage();
        SearchPage serchPage = new SearchPage(getWebDriver());
        serchPage
                .clickSearch()
                .enterItem("Royal Canin")
                .clickToFind()
                .scrollPage();
        Assertions.assertEquals("https://www.petshop.ru/search/?q=Royal%20Canin", getWebDriver().getCurrentUrl());

    }

    @Test
    public void searchOnEnglish() {
        setDriver();
        initMainPage();
        SearchPage searchPage = new SearchPage(getWebDriver());
        searchPage
                .clickSearch()
                .enterItem("rjhv lkz otyrjd")
                .clickToFind()
                .scrollPage();

        Assertions.assertEquals(33, searchPage.findResultPuppy().toArray().length);
    }

    @Test
    public void caseSensitivity() {
        setDriver();
        initMainPage();
        SearchPage searchPage = new SearchPage(getWebDriver());
        searchPage
                .clickSearch()
                .enterItem("КОРМ ДЛЯ КОШЕК")
                .clickToFind()
                .scrollPage();
        Assertions.assertNotEquals(0, searchPage.findResultCats().toArray().length);

    }

    @Test
    public void searchWithMistake() {

        setDriver();
        initMainPage();
        SearchPage searchPage = new SearchPage(getWebDriver());
        searchPage
                .clickSearch()
                .enterItem("Корм для щЭнков")
                .clickToFind();
        Assertions.assertNotEquals(0, searchPage.findResultPuppy().toArray().length);

    }

    @Test
    public void searchWithTranceliteration() {
        setDriver();
        initMainPage();
        SearchPage searchPage = new SearchPage(getWebDriver());
        searchPage
                .clickSearch()
                .enterItem("Пурина")
                .clickToFind();
        Assertions.assertNotEquals(0, searchPage.findResultPurina().toArray().length);

    }

    @Test
    public void searchWithSymbols() {
        setDriver();
        initMainPage();

        SearchPage searchPage = new SearchPage(getWebDriver());
        searchPage
                .clickSearch()
                .enterItem("@@@Корм для щенков@")
                .clickToFind();
        Assertions.assertEquals(26, searchPage.findResultPuppy().toArray().length);
    }

    @Test
    public void reorderSearch() {
        setDriver();
        initMainPage();

        SearchPage searchPage = new SearchPage(getWebDriver());
        searchPage
                .clickSearch()
                .enterItem("canin royal")
                .clickToFind();
        Assertions.assertNotEquals(0, searchPage.findResultRoalCanin().toArray().length);

    }
}
