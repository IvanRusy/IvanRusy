package org.example.Tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    @BeforeTest

    public void parentBefore() {
        System.out.println("Before parent");

    }
    @AfterTest
    public void parentAfter(){
        System.out.println("After parent");
    }

    @BeforeSuite
    public void parentBeforeSuite() {
        System.out.println("Before Suite parent");
    }

    @AfterSuite
    public void parentAfterSuite() {
        System.out.println("After Suite parent");
    }
}
