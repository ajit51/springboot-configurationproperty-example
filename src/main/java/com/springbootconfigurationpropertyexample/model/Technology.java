package com.springbootconfigurationpropertyexample.model;

public class Technology {

    private String technologyName;

    public String getTechnologyName() {
        return technologyName;
    }

    public void setTechnologyName(String technologyName) {
        this.technologyName = technologyName;
    }

	@Override
	public String toString() {
		return "Technology [technologyName=" + technologyName + "]";
	}
    
    
}
