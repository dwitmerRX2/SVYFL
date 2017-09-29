package com.razorx2.svyfl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.razorx2.svyfl.dao.LeagueDao;
import com.razorx2.svyfl.model.League;

@Service("leagueService")
@Transactional
public class LeagueService {
	
	@Autowired
	LeagueDao leagueDao;
	
	public League getCurrentLeague() {
		return leagueDao.getCurrentLeague();
	}

}
