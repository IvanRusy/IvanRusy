package org.example.Tests;

import org.testng.annotations.*;

public class TestNgTraining extends BaseTest{

    @BeforeMethod
    public void beforeMethodMethod() {
        System.out.println("Before test method children");
    }

    @AfterMethod
    public void afterMethodMethod() {
        System.out.println("After test method children");
    }

    @BeforeClass
    public void beforeClassClass() {
        System.out.println("Before test class children");
    }

    @AfterClass
    public void afterClassClass() {
        System.out.println("After test class children");
    }
    @Test
    public void testngCheck(){
        System.out.println("I just check testng");
    }

    @Test
    public void checkNgTest(){
        System.out.println("I check NGTest");
    }
}
