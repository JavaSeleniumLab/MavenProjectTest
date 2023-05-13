package Utilities;

import DriverWrapper.DriverSetUp;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ForFailedTestCases extends DriverSetUp implements ITestListener {
    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        takeScreenShotForPassedTests(iTestResult.getMethod().getMethodName());

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
            takeScreenShotForFailedTests(iTestResult.getMethod().getMethodName());

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
