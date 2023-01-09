package testCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class ConstantSettings {

        static WebDriver webDriver;

        @BeforeAll

        static void setDriver() {

            WebDriverManager.chromedriver().setup();
            ChromeOptions options= new ChromeOptions();
            options.addArguments("--incognito");
            options.addArguments("start-maximized");
            webDriver= new ChromeDriver(options);
            webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        }

        @BeforeEach

        void initMainPage(){
            webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            webDriver.get("https://www.petshop.ru/");
            webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        }
        @AfterAll
        static void close() {
            if (webDriver!=null) webDriver.quit();
        }
        public WebDriver getWebDriver(){return this.webDriver;}


    }
