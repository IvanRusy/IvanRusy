package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DynamicTablesPage extends BasePage{
    public DynamicTablesPage(WebDriver driver){
        super(driver);
    }
    private final By expectedValue = By.xpath("//p[@class='bg-warning']");
    private final By columnHeaders = By.xpath("//span[@role='columnheader']");
    private final By chromeRow = By.xpath("//div//span[text()='Chrome']/following-sibling::span");

    public String getExpectedValue() {
        String value = driver.findElement(expectedValue).getText();
        return value.substring(12);
    }

    public int getCpuIndex() {
        List<WebElement> headers = driver.findElements(columnHeaders);
        for (int i = 0; i < headers.size(); i++) {
            if(headers.get(i).getText().equals("CPU")){
                return i;
            }
        }
        return 0;
    }
    public String getTableValue(){
        List<WebElement> rows = driver.findElements(chromeRow);
        return rows.get(getCpuIndex() - 1).getText();
    }


}
