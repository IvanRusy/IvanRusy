package org.example.Tests;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

@Listeners(MyListener.class)
public class TestBrowser {

    @DataProvider(name = "EquivalentClasses")
    public Object[][] prepareTestData(){
        return new Object[][]{{-1,"correct"},{0,"correct"},{1,"correct"},{50,"correct"},{99,"correct"},{100,"correct"},{101,"correct"}};
    }

    @AfterMethod
    public void preSteps(){
        System.out.println("Подготовка");
    }


    @Test(dataProvider = "EquivalentClasses")
    public void browserCheck(int i, String isCorrect){
      //  Assert.assertTrue(isCorrect);
        Assert.assertEquals(isCorrect,"correct");
    }

    @Test(dependsOnMethods = "browserCheck")
    public void browserVersionCheck(){
        SoftAssert sf = new SoftAssert();
        int a = 5;
        sf.assertEquals(a,5);
        int b = 10;
        sf.assertEquals(b,10);
        sf.assertEquals(a+b,15);

        sf.assertAll();
    }
}
