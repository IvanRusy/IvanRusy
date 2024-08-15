package org.example.Tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;


public class TextInputTest extends BaseTest{
    @Test
    public void inputTextTest(){
        homePage.getTestDirectory(HomePage.Links.TEXT_INPUT);
        String startButtonValue = textInputPage.getTextFromButton();

        String expectedText = textInputPage.setText("HelloWorld");
        String actualText = textInputPage.getTextFromButton();

        Assert.assertEquals(actualText, expectedText);
        Assert.assertNotEquals(actualText, startButtonValue);

    }
}
