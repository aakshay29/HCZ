package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the HCZAPPLICATIONSTATUS database table.
 * 
 */
@Entity
@NamedQuery(name="Hczapplicationstatus.findAll", query="SELECT h FROM Hczapplicationstatus h")
public class Hczapplicationstatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long statusid;

	private long alcoholtest;

	private long codingtest;

	private long dottest;

	private long educationdegree;

	private long groupinterview;

	private long hrinterview;

	private long managerinterview;

	private long nationality;

	private long standardpaneltest;

	private String status;

	private long veteran;

	private long workhistory;

	//bi-directional many-to-one association to Hczapplication
	@ManyToOne
	@JoinColumn(name="APPLICATIONID")
	private Hczapplication hczapplication;

	public Hczapplicationstatus() {
	}

	public long getStatusid() {
		return this.statusid;
	}

	public void setStatusid(long statusid) {
		this.statusid = statusid;
	}

	public long getAlcoholtest() {
		return this.alcoholtest;
	}

	public void setAlcoholtest(long alcoholtest) {
		this.alcoholtest = alcoholtest;
	}

	public long getCodingtest() {
		return this.codingtest;
	}

	public void setCodingtest(long codingtest) {
		this.codingtest = codingtest;
	}

	public long getDottest() {
		return this.dottest;
	}

	public void setDottest(long dottest) {
		this.dottest = dottest;
	}

	public long getEducationdegree() {
		return this.educationdegree;
	}

	public void setEducationdegree(long educationdegree) {
		this.educationdegree = educationdegree;
	}

	public long getGroupinterview() {
		return this.groupinterview;
	}

	public void setGroupinterview(long groupinterview) {
		this.groupinterview = groupinterview;
	}

	public long getHrinterview() {
		return this.hrinterview;
	}

	public void setHrinterview(long hrinterview) {
		this.hrinterview = hrinterview;
	}

	public long getManagerinterview() {
		return this.managerinterview;
	}

	public void setManagerinterview(long managerinterview) {
		this.managerinterview = managerinterview;
	}

	public long getNationality() {
		return this.nationality;
	}

	public void setNationality(long nationality) {
		this.nationality = nationality;
	}

	public long getStandardpaneltest() {
		return this.standardpaneltest;
	}

	public void setStandardpaneltest(long standardpaneltest) {
		this.standardpaneltest = standardpaneltest;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public long getVeteran() {
		return this.veteran;
	}

	public void setVeteran(long veteran) {
		this.veteran = veteran;
	}

	public long getWorkhistory() {
		return this.workhistory;
	}

	public void setWorkhistory(long workhistory) {
		this.workhistory = workhistory;
	}

	public Hczapplication getHczapplication() {
		return this.hczapplication;
	}

	public void setHczapplication(Hczapplication hczapplication) {
		this.hczapplication = hczapplication;
	}

}