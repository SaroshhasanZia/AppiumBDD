package general;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Reporting {

    public static ExtentReports report;



    public static void startReport(){
        ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir") + "/reports/ExtentReport-" + new SimpleDateFormat("yyyy-MM-dd'T'HH-mm-ss").format(Calendar.getInstance().getTime()) + ".html");
        spark.config().setEncoding("utf-8");
        spark.config().setDocumentTitle("AutoReport");
        spark.config().setReportName("Test Report");
        spark.config().setTheme(Theme.DARK);
        report = new ExtentReports();
        report.attachReporter(spark);
        report.setSystemInfo("Tester", "Sarosh");

    }

    public static ExtentReports getExtentReport(){
        if (report != null) {
            return report;
        } else {
            throw new IllegalStateException("Extent Report object not initialized");
        }
    }


    public static void EndReport(){
        report.flush();

    }
}
