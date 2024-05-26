package Mydemo.resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {

public static ExtentReports getReportObject(){
		// TODO Auto-generated method stub
		ExtentReports extent;
		String path=System.getProperty("user+dir")+"//reports//index.html";
		ExtentSparkReporter reporter= new ExtentSparkReporter(path);
		reporter.config().setReportName("WebAutomation result");
		reporter.config().setDocumentTitle("Test result");
		 extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("tester", "punitha");
		return extent;
	}

}
