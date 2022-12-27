package com.webapp.demo.Controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.demo.ClsLog.LogClass;
import com.webapp.demo.Dao.LogDao;

@RestController
public class LogControler {
	@Autowired
	LogDao dao;
	@RequestMapping(path="/checkIn")
	@ResponseBody
	public void CheckIn(@RequestParam String logname,LogClass obj){
		obj.setLogType("in");
		LocalDate logdate = LocalDate.now();
		LocalTime logtime = LocalTime.now();
		obj.setDate(logdate.toString());
		obj.setTime(logtime.toString());
		obj.setId(logname+logtime.toString());
		dao.save(obj);
		System.out.println("checkIn"+ logname);
		
	}
	
	@RequestMapping(path="/checkOut")
	@ResponseBody
	public void CheckOut(@RequestParam String logname,LogClass obj){
		obj.setLogType("out");
		LocalDate logdate = LocalDate.now();
		LocalTime logtime = LocalTime.now();
		obj.setDate(logdate.toString());
		obj.setTime(logtime.toString());
		obj.setId(logname+logtime.toString());
		dao.save(obj);
		System.out.println("checkout"+ logname);
		
	}
	
	@RequestMapping(path="/getLog")
	@ResponseBody
	public List<LogClass> GetLogByDate(@RequestParam String logdate,LogClass obj){
		
		
		System.out.println("getLog"+ logdate);
		return dao.findAllByDate(logdate);
	
}
	@RequestMapping(path="/getAllLog")
	@ResponseBody
	public List<LogClass> GetAllLog(){
		return dao.findAll();
	
}
	
}