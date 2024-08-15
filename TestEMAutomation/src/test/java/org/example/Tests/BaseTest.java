package org.example.Tests;



import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import pages.*;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    protected WebDriver driver;

    protected HomePage homePage = new HomePage(setUp());
    protected TextInputPage textInputPage = new TextInputPage(setUp());
    protected DynamicTablesPage dynamicTablePage = new DynamicTablesPage(setUp());
    protected MouseoverPage mouseOverPage = new MouseoverPage(setUp());
    protected FramesPage framesPage = new FramesPage(setUp());
    protected AlertsPage alertsPage = new AlertsPage(setUp());


   private WebDriver setUp() {
        WebDriverManager.chromedriver().setup();
        if (driver == null) {
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        return driver;
    }

    @BeforeClass
    public void prepare() {
        open(getFromProperties("homeUrl"));
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }
    public String getFromProperties(String propertyKey) {
        try {

            Properties props = new Properties();
            FileInputStream  inputStream = new FileInputStream("src/main/resources/application.properties");
            props.load(inputStream);
            return props.getProperty(propertyKey);
        } catch (Exception e) {
            System.out.println("Не удалось загрузить файл");
        }
        return propertyKey;
    }
}

