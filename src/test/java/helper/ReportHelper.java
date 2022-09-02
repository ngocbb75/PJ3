package helper;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportHelper {
    public static ExtentHtmlReporter htmlReport;
    public static ExtentReports extent;
    public static ExtentTest rp;

    public static void reportSetting(){
        htmlReport = new ExtentHtmlReporter("./output.html");
        htmlReport.config().setTheme(Theme.STANDARD);
        htmlReport.config().setReportName("Automation Test Report");
        extent = new ExtentReports();
        extent.attachReporter(htmlReport);
        extent.setSystemInfo("Win 10", "Chrome");
        rp = extent.createTest("Assignment Automation");
    }

    public static ExtentTest getRp(){
        return rp;
    }

    public void setRp(ExtentTest rp){
        this.rp = rp;
    }
}
