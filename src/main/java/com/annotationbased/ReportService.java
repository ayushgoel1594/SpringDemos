package com.annotationbased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class ReportService {
    //ReportGenerator master = new HTMLReportGenerator();   // Line1
	
	//3 possibilities of autowired i.e. while defining master, constructor, setter
	@Autowired
	@Qualifier("pdfReportGenerator") //required when there are multiple beans of same type 
	//@Qualifier is also not required when bean id in xml is same as the name of the object in java
	//An exception occurs when there is no such bean id mentioned in the qualifier
	ReportGenerator master;
    public ReportGenerator getMaster() {
		return master;
	}

    //@Autowired
	public void setMaster(ReportGenerator master) {
		this.master = master;
	}

	@Value("50")  //required for defining the values of the non primitive types
	int recordsPerPage;

	//default constructor for setter dependency injection
	public ReportService() {
		// TODO Auto-generated constructor stub
	}
	
	//paramaterised constructor for constructor dependency injection
	//@Autowired
    public ReportService(ReportGenerator master, int recordsPerPage) {
		super();
		this.master = master;
		this.recordsPerPage = recordsPerPage;
	}

	public void generateReport() {
        System.out.println(master.generateReport(recordsPerPage));
    }
}