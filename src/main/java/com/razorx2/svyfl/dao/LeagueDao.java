package com.razorx2.svyfl.dao;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.razorx2.svyfl.model.League;

@Repository("leagueDao")
public class LeagueDao extends AbstractDAO<Integer, League> {
	
	public League getCurrentLeague() {
		Query q = getSession().createQuery("from League ORDER BY id DESC");
		q.setMaxResults(1);
		return (League) q.uniqueResult();
	}

}
