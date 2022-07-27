package tests;


import com.testinium.deviceinformation.exception.DeviceNotFoundException;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.IOException;

import static general.CommonFunctions.closeApp;
import static general.MobileDriver.finishDriver;
import static general.MobileDriver.startDriver;
import static general.Reporting.EndReport;
import static general.Reporting.startReport;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/feature"},
        glue = {"stepDefs"},
//        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        plugin = { "pretty", "html:target/cucumber" },
        tags= "@LogOut")
public class TestRunner {





    @BeforeClass
    public static void beforeClass(){
        startReport();
    }

    @AfterClass
    public static void afterClass(){
        EndReport();
    }





}
