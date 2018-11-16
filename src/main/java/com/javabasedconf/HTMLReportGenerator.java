package com.javabasedconf;

import org.springframework.stereotype.Service;

@Service(value="htmlReportGenerator")
public class HTMLReportGenerator implements ReportGenerator{

	public String generateReport(int recordsPerPage) {
		// TODO Auto-generated method stub
		return "Generated HTML Report  with " + recordsPerPage + "records";	}
}