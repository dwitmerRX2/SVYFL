package com.razorx2.svyfl.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="svyfl_data")
public class SVYFLData {

	@Id
	@Column(name="id")
	private int id;
	@Column(name="Counts")
	private String counts;
	@Column(name="Location")
	private String location;
	@Column(name="Time")
	private String time;
	@Column(name="Date")
	private Date date;
	@Column(name="Division")
	private String division;
	@Column(name="Visitor")
	private String visitor;
	@Column(name="Vscore", nullable=false, columnDefinition="int default 0")
	private int visitor_score;
	@Column(name="Home")
	private String home;
	@Column(name="Hscore", nullable=false, columnDefinition="int default 0")
	private int home_score;
	@Column(name="Note")
	private String note;
	@Column(name="Winner")
	private String winner;
	@Column(name="Loser")
	private String loser;
	@Column(name="WPctC", nullable=false, columnDefinition="int default 0")
	private float winning_percentage;
	@Column(name="LPctC", nullable=false, columnDefinition="int default 0")
	private float losing_percentage;
	@Column(name="WPctS", nullable=false, columnDefinition="int default 0")
	private float winning_percentage_strength;
	@Column(name="LPctS", nullable=false, columnDefinition="int default 0")
	private float losing_percentage_strength;
	@Column(name="Spread", nullable=false, columnDefinition="int default 0")
	private int spread;
	@Column(name="Wscore", nullable=false, columnDefinition="int default 0")
	private int winning_score;
	@Column(name="Lscore", nullable=false, columnDefinition="int default 0")
	private int losing_score;
	@Column(name="Vleague")
	private String visitor_league;
	@Column(name="Hleague")
	private String home_league;
	@Column(name="Wleague")
	private String winning_league;
	@Column(name="Lleague")
	private String losing_league;
	@Column(name="HV_Winner")
	private String HV_Winner;
	@Column(name="Wconf")
	private String winning_conference;
	@Column(name="Lconf")
	private String losing_conference;
	@Column(name="Conf")
	private String conference;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCounts() {
		return counts;
	}
	public void setCounts(String counts) {
		this.counts = counts;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getVisitor() {
		return visitor;
	}
	public void setVisitor(String visitor) {
		this.visitor = visitor;
	}
	public int getVisitor_score() {
		return visitor_score;
	}
	public void setVisitor_score(int visitor_score) {
		this.visitor_score = visitor_score;
	}
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
	public int getHome_score() {
		return home_score;
	}
	public void setHome_score(int home_score) {
		this.home_score = home_score;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getWinner() {
		return winner;
	}
	public void setWinner(String winner) {
		this.winner = winner;
	}
	public String getLoser() {
		return loser;
	}
	public void setLoser(String loser) {
		this.loser = loser;
	}
	public float getWinning_percentage() {
		return winning_percentage;
	}
	public void setWinning_percentage(float winning_percentage) {
		this.winning_percentage = winning_percentage;
	}
	public float getLosing_percentage() {
		return losing_percentage;
	}
	public void setLosing_percentage(float losing_percentage) {
		this.losing_percentage = losing_percentage;
	}
	public float getWinning_percentage_strength() {
		return winning_percentage_strength;
	}
	public void setWinning_percentage_strength(float winning_percentage_strength) {
		this.winning_percentage_strength = winning_percentage_strength;
	}
	public float getLosing_percentage_strength() {
		return losing_percentage_strength;
	}
	public void setLosing_percentage_strength(float losing_percentage_strength) {
		this.losing_percentage_strength = losing_percentage_strength;
	}
	public int getSpread() {
		return spread;
	}
	public void setSpread(int spread) {
		this.spread = spread;
	}
	public int getWinning_score() {
		return winning_score;
	}
	public void setWinning_score(int winning_score) {
		this.winning_score = winning_score;
	}
	public int getLosing_score() {
		return losing_score;
	}
	public void setLosing_score(int losing_score) {
		this.losing_score = losing_score;
	}
	public String getVisitor_league() {
		return visitor_league;
	}
	public void setVisitor_league(String visitor_league) {
		this.visitor_league = visitor_league;
	}
	public String getHome_league() {
		return home_league;
	}
	public void setHome_league(String home_league) {
		this.home_league = home_league;
	}
	public String getWinning_league() {
		return winning_league;
	}
	public void setWinning_league(String winning_league) {
		this.winning_league = winning_league;
	}
	public String getLosing_league() {
		return losing_league;
	}
	public void setLosing_league(String losing_league) {
		this.losing_league = losing_league;
	}
	public String getHV_Winner() {
		return HV_Winner;
	}
	public void setHV_Winner(String hV_Winner) {
		HV_Winner = hV_Winner;
	}
	public String getWinning_conference() {
		return winning_conference;
	}
	public void setWinning_conference(String winning_conference) {
		this.winning_conference = winning_conference;
	}
	public String getLosing_conference() {
		return losing_conference;
	}
	public void setLosing_conference(String losing_conference) {
		this.losing_conference = losing_conference;
	}
	public String getConference() {
		return conference;
	}
	public void setConference(String conference) {
		this.conference = conference;
	}
	
}
