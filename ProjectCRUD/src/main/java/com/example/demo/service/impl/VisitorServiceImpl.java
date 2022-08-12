package com.example.demo.service.impl;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Visitor;
import com.example.demo.repository.VisitorRepository;
import com.example.demo.service.VisitorService;

@Service
public class VisitorServiceImpl implements VisitorService{
     
	@Autowired
	private VisitorRepository visitorRepository;
	
	@Override
	public Visitor saveVisitor(Visitor visitor) {
	//	return visitorRepository.save(visitor);
		
		if(visitor.isAllowStatus()==true)
			visitor.setTemp("Enable");
		else
			visitor.setTemp("Disable");
		return visitorRepository.save(visitor);
	}

	@Override
	public List<Visitor> show() {
		return visitorRepository.findAll();
	}

	@Override
	public Visitor getById(int id) {
	   return visitorRepository.findById(id).get();
	}

	@Override
	public Visitor saveUpdated(Visitor visitor) {
		if(visitor.isAllowStatus()==true)
			visitor.setTemp("enabled");
		else 
			visitor.setTemp("disabled");
		return visitorRepository.save(visitor);
		
		
	}

	@Override
	public void deleteById(int id) {
		visitorRepository.deleteById(id);
		
	}

	@Override
	public List<Visitor> findByName(String visitorName) {
		return visitorRepository.findByName(visitorName);
	}

	@Override
	public List<Visitor> findByCardNo(int cardNo) {
		return visitorRepository.findByCardNo(cardNo);
	}

	@Override
	public List<Visitor> findByDate(Date date1, Date date2) {
		
		return visitorRepository.findByDate(date1,date2);
	}

	@Override
	public List<Visitor> findByAllowStatus(boolean allowStatus) {
		return visitorRepository.findbyAllowStatus(allowStatus);
	}
}
