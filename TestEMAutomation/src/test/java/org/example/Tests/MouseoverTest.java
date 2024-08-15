package org.example.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class MouseoverTest extends BaseTest{
    @Test
    public void mouseOverTest(){
        homePage.getTestDirectory(HomePage.Links.MOUSE_OVER);

        int clickCount = 6;
        int expectedClickCount = clickCount * 2;

        mouseOverPage.doubleClicker(clickCount);
        String actual = mouseOverPage.getCountOfClick();
        Assert.assertEquals(actual, Integer.toString(expectedClickCount));

    }
}
