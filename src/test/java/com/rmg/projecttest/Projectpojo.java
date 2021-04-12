package com.rmg.projecttest;
//alt+shift+s to generate getters and setters

public class Projectpojo {
	String createdBy;
	String createdOn;
	
	String projectName;
	String status;
	int teamsize;
	
	public Projectpojo(String createdBy,String createdOn, String projectName,String status,int teamsize){
		
		this.createdBy=createdBy;
		this.createdOn=createdOn;
		this.projectName=projectName;
		this.status=status;
		this.teamsize=teamsize;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getTeamsize() {
		return teamsize;
	}

	public void setTeamsize(int teamsize) {
		this.teamsize = teamsize;
	}

}
