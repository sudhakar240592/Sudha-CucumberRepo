package com.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;
import net.masterthought.cucumber.presentation.PresentationMode;

public class JvmReport {

	public static void getReport() {
		File reportOutputDirectory = new File(System.getProperty("user.dir")+"/resource/com/jvm");
		List<String> jsonFiles = new ArrayList<>();
		jsonFiles.add(System.getProperty("user.dir")+"/resource/com/report/cucumber-report.json");

		String buildNumber = "1";
		String projectName = "AdactinTest";

		Configuration configuration = new Configuration(reportOutputDirectory, projectName);

		configuration.setBuildNumber(buildNumber);
		configuration.addClassifications("Platform", "Windows");
		configuration.addClassifications("Browser", "Chrome");
		

		ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
		Reportable result = reportBuilder.generateReports();
		
	}
}