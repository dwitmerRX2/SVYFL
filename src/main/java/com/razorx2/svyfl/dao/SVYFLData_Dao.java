package com.razorx2.svyfl.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.razorx2.svyfl.model.League;

@Repository("svyfldataDao")
public class SVYFLData_Dao extends AbstractDAO<Integer, League>{
	
	public List getCurrentGames() {
		Query q = getSession().createQuery("from SVYFLData WHERE Date < NOW() ORDER BY DATE");		
		return q.list();
	}

}
