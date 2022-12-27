package com.webapp.demo.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.webapp.demo.ClsLog.LogClass;

public interface LogDao extends JpaRepository<LogClass,Integer >{
	
	@Query(value="select * from class_log where date= ?1",nativeQuery = true)
	List<LogClass> findAllByDate(String logsdate);
}