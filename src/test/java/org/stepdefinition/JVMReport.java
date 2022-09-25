package org.stepdefinition;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	public static void generateJvmReport(String jsonpath) {
		// Mentioning File Location
		File f = new File(System.getProperty("user.dir") + "\\AllReports\\JVMReports");
		// Add Details
		Configuration c = new Configuration(f, "Star 360 Application");
		c.addClassifications("Platform", "Windows");
		c.addClassifications("JDK", "1.8");
		// Add Json File Path to List
		List<String> li = new ArrayList<String>();
		li.add(jsonpath);
		//Reportbuilder class
		ReportBuilder r = new ReportBuilder(li, c);
		r.generateReports();
	}

}
