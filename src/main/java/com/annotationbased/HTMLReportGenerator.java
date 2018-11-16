package com.annotationbased;

public class HTMLReportGenerator implements ReportGenerator{

	public String generateReport(int recordsPerPage) {
		// TODO Auto-generated method stub
		return "Generated HTML Report  with " + recordsPerPage + "records";	}
}