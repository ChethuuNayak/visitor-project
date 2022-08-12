package com.example.demo.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Visitor;


public interface VisitorRepository extends JpaRepository<Visitor, Integer>{
	
	@Query("SELECT n FROM Visitor n WHERE n.visitorName=:visitorName")
	public List<Visitor> findByName(@RequestParam("visitorName") String visitorName);
	
	@Query("SELECT n FROM Visitor n WHERE n.cardNo=:cardNo")
	public List<Visitor> findByCardNo(@RequestParam("cardNo") int cardNo);	
	 
	@Query("SELECT x FROM Visitor x where x.date >=:date1 and x.date <=:date2")
	public List<Visitor> findByDate(@RequestParam("date1") Date date1,@RequestParam("date2") Date date2);
	
	@Query("SELECT n FROM Visitor n WHERE n.allowStatus=:allowStatus")
	public List<Visitor> findbyAllowStatus(@RequestParam("allowStatus") boolean allowStatus);
}
