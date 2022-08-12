package com.example.demo.service;

import java.sql.Date;
import java.util.List;

import com.example.demo.entity.Visitor;

public interface VisitorService {
	
	Visitor saveVisitor(Visitor visitor);
	List<Visitor> show();
	
	Visitor getById(int id);
	
	Visitor saveUpdated(Visitor visitor);
	void deleteById(int id);
	List<Visitor> findByName(String visitorName);
	
	List<Visitor> findByCardNo(int cardNo);
	
	List<Visitor> findByDate(Date date1,Date date2);
     
	List<Visitor> findByAllowStatus(boolean allowStatus);
	
}
