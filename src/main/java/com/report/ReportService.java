package com.report;

public class ReportService {
    //ReportGenerator master = new HTMLReportGenerator();   // Line1
	ReportGenerator master;
    public ReportGenerator getMaster() {
		return master;
	}

	public void setMaster(ReportGenerator master) {
		this.master = master;
	}

	int recordsPerPage = 100;

	//default constructor for setter dependency injection
	public ReportService() {
		// TODO Auto-generated constructor stub
	}
	
	//paramaterised constructor for constructor dependency injection
    public ReportService(ReportGenerator master, int recordsPerPage) {
		super();
		this.master = master;
		this.recordsPerPage = recordsPerPage;
	}

	public void generateReport() {
        System.out.println(master.generateReport(recordsPerPage));
    }
}