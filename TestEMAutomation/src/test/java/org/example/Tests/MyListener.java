package org.example.Tests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result){
        System.out.println("Test is Failure");

    }
    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Success");
    }


    @Override
    public void onStart(ITestContext context) {
        ITestListener.super.onStart(context);
        System.out.println("Starting test" + context);
    }
}
