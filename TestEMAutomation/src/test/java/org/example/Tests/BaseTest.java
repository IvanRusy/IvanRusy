package org.example.Tests;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.FramesPage;
import pages.HomePage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {

    HomePage homePage = new HomePage(setup());
    FramesPage framesPage = new FramesPage(setup());


    protected WebDriver driver;
    private WebDriver setup(){
        WebDriverManager.chromedriver().setup();
        if (driver == null) {
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        return  driver;
    }

    @BeforeClass
    public void startTest(){
        driver.get(getFromProperties("homeUrl"));
    }
    @AfterClass
    public void tearDawn(){driver.quit();}

    public String getFromProperties(String propertyKey){
        Properties prop = new Properties();
        try {
            FileInputStream inputStream = new FileInputStream("src/main/resources/application.properties");
        }catch (IOException e){
            System.out.println("OPS");
        }
        return prop.getProperty(propertyKey);
    }


}
