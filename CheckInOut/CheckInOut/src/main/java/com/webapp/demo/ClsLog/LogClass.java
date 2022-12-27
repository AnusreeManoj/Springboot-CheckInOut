package com.webapp.demo.ClsLog;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LogClass {
	
	@Id
	private String logid;
	private String logname;
	private String logType;
	private String logdate;
	private String logtime;
	public String getId() {
		return logid;
	}
	public void setId(String logid) {
		this.logid = logid;
	}
	public String getName() {
		return logname;
	}
	public void setName(String logname) {
		this.logname = logname;
	}
	public String getLogType() {
		return logType;
	}
	public void setLogType(String logType) {
		this.logType = logType;
	}
	public String getDate() {
		return logdate;
	}
	public void setDate(String logdate) {
		this.logdate = logdate;
	}
	public String getTime() {
		return logtime;
	}
	public void setTime(String logtime) {
		this.logtime = logtime;
	}
}