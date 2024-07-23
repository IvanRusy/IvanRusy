package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void setup() throws IOException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        if (driver == null){
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.get(getFromProperties("homeurl"));
    }

    @AfterClass
    public void tearDawn(){
        driver.quit();
    }

    public String getFromProperties(String propertyKey) throws IOException {
        Properties props = new Properties();
        InputStream inputStream = ClassLoader.getSystemResourceAsStream("src/main/resources/application.properties.properties");
        props.load(inputStream);
        return  props.getProperty(propertyKey);
    }


}
