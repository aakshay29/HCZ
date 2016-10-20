package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


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

	private BigDecimal alcoholtest;

	private BigDecimal codingtest;

	private BigDecimal dottest;

	private BigDecimal educationdegree;

	private BigDecimal groupinterview;

	private BigDecimal hrinterview;

	private BigDecimal managerinterview;

	private BigDecimal nationality;

	private BigDecimal standardpaneltest;

	private String status;

	private BigDecimal veteran;

	private BigDecimal workhistory;

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

	public BigDecimal getAlcoholtest() {
		return this.alcoholtest;
	}

	public void setAlcoholtest(BigDecimal alcoholtest) {
		this.alcoholtest = alcoholtest;
	}

	public BigDecimal getCodingtest() {
		return this.codingtest;
	}

	public void setCodingtest(BigDecimal codingtest) {
		this.codingtest = codingtest;
	}

	public BigDecimal getDottest() {
		return this.dottest;
	}

	public void setDottest(BigDecimal dottest) {
		this.dottest = dottest;
	}

	public BigDecimal getEducationdegree() {
		return this.educationdegree;
	}

	public void setEducationdegree(BigDecimal educationdegree) {
		this.educationdegree = educationdegree;
	}

	public BigDecimal getGroupinterview() {
		return this.groupinterview;
	}

	public void setGroupinterview(BigDecimal groupinterview) {
		this.groupinterview = groupinterview;
	}

	public BigDecimal getHrinterview() {
		return this.hrinterview;
	}

	public void setHrinterview(BigDecimal hrinterview) {
		this.hrinterview = hrinterview;
	}

	public BigDecimal getManagerinterview() {
		return this.managerinterview;
	}

	public void setManagerinterview(BigDecimal managerinterview) {
		this.managerinterview = managerinterview;
	}

	public BigDecimal getNationality() {
		return this.nationality;
	}

	public void setNationality(BigDecimal nationality) {
		this.nationality = nationality;
	}

	public BigDecimal getStandardpaneltest() {
		return this.standardpaneltest;
	}

	public void setStandardpaneltest(BigDecimal standardpaneltest) {
		this.standardpaneltest = standardpaneltest;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getVeteran() {
		return this.veteran;
	}

	public void setVeteran(BigDecimal veteran) {
		this.veteran = veteran;
	}

	public BigDecimal getWorkhistory() {
		return this.workhistory;
	}

	public void setWorkhistory(BigDecimal workhistory) {
		this.workhistory = workhistory;
	}

	public Hczapplication getHczapplication() {
		return this.hczapplication;
	}

	public void setHczapplication(Hczapplication hczapplication) {
		this.hczapplication = hczapplication;
	}

}