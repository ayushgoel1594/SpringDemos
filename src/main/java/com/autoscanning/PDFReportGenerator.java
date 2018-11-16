package com.autoscanning;

import org.springframework.stereotype.Service;

@Service(value="pdfReportGenerator")
public class PDFReportGenerator implements ReportGenerator{
	
	public String generateReport( int recordsPerPage) {
			return "Generated PDF Report with " + recordsPerPage + "records";
	}
}