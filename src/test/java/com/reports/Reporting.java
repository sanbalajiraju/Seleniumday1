package com.reports;

import java.io.File;

import net.masterthought.cucumber.Configuration;


public class Reporting {
	
	
	public static void generateJvmReport(String jsonfile) {
		File file=new File("C:\\Users\\HP 348 NOTEBOOK\\eclipse-workspace\\CucumberClass\\target");
		
	Configuration configuration=new Configuration(file, jsonfile);
	configuration.addClassifications("browser", "Chrome");
	configuration.addClassifications("browserversion", "113");
	configuration.addClassifications("OS", "Windows");
	
	
	
	@Afterclass
	p s  v generateReorts()
	{
		classname.generateReports();
	}

	github
	
	
	File reportOutputDirectory=new file("target");
	List<String> jsonFiles=new ArrayList<>();
	jsonFiles.add("Reports/cucumber.java");
	string BuildNumber="1";
	Strig projectNmae="CcumnbetProjrcy";
	ReportBuilder reortBuilder=new ReportBuilder(jsonFiles,configuration);
	Reportable result=reportBuilder.generateReports();
		
		
	
		
		
	}
	

}
