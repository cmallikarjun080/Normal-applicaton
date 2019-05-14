package com.cts.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Company {
    private Employee employee;
    
      private String compName;
      private String location;
      
	public Employee getEmployee() {
		return employee;
	}
    @Autowired
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Company [employee=" + employee + ", compName=" + compName + ", location=" + location + "]";
	}

	


	
	
      
}
