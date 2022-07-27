package stepDefs;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.testinium.deviceinformation.exception.DeviceNotFoundException;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.junit.runner.Result;
import org.testng.ITestResult;


import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;

import static general.CommonFunctions.closeApp;
import static general.CommonFunctions.getTime;
import static general.MobileDriver.finishDriver;
import static general.MobileDriver.startDriver;
import static general.Reporting.*;


public class Hook {

    public static ExtentTest test;


    @Before
    public static void beforeScenario(Scenario scenario) throws DeviceNotFoundException, IOException {
        startDriver();
        System.out.println("before class");
        test = getExtentReport().createTest(scenario.getName());

    }

    //    @AfterClass
    @After
    public static void afterScenario(Scenario scenario) throws IOException, IllegalAccessException {

            if (scenario.getStatus() == io.cucumber.java.Status.PASSED) {
                String methodName = scenario.getName();
                String logText = "Test Case: " + methodName + " passed";
                Markup m = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
                test.log(Status.PASS, m);
            } else if (scenario.getStatus() == io.cucumber.java.Status.FAILED) {
                String methodName = scenario.getName();
                String logText = "Test Case: " + methodName + " failed";
                Markup m = MarkupHelper.createLabel(logText, ExtentColor.RED);
                test.log(Status.FAIL, m);
            }
        closeApp("com.sand.airdroid");
        finishDriver();

    }
}
