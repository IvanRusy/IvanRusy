package org.example.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class DynamicTablesTest extends BaseTest {
    @Test
    public void testDynamicTable() {
        homePage.getTestDirectory(HomePage.Links.DYNAMIC_TABLE);

        String expectedValue = dynamicTablePage.getExpectedValue();
        String actualValue = dynamicTablePage.getTableValue();

        Assert.assertEquals(actualValue, expectedValue);
    }

}