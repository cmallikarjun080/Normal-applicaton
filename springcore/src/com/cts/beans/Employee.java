package com.cts.beans;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class Employee {
     private int empId;
     private String empName;
     private String compName;
     
     
     public void getRecruited() {
    	 System.out.println("teju got recruited in cts..");
     }
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getCompName() {
		return compName;
	}
	@Required
	public void setCompName(String compName) {
		this.compName = compName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", compName=" + compName + "]";
	}
     
}
