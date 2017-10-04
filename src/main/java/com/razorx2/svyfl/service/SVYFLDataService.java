package com.razorx2.svyfl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.razorx2.svyfl.dao.SVYFLData_Dao;

@Service("svyflDataService")
@Transactional
public class SVYFLDataService {
	
	@Autowired
	SVYFLData_Dao dataDao;

	public List getCurrentGames() {
		return dataDao.getCurrentGames();
	}
}
