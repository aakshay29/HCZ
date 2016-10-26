package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the HCZAPPLICATION database table.
 * 
 */
@Entity
@NamedQuery(name="Hczapplication.findAll", query="SELECT h FROM Hczapplication h")
public class Hczapplication implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long applicationid;

	private String address;

	private String applicantname;

	@Temporal(TemporalType.DATE)
	private Date birthday;

	private long citizen;

	private long druguser;

	private String education;

	private String empreferences;

	private String jobhistory;

	private String skills;

	private long veteran;

	//bi-directional many-to-one association to Hczjob
	@ManyToOne
	@JoinColumn(name="JOBID")
	private Hczjob hczjob;

	//bi-directional many-to-one association to Hczapplicationstatus
	@OneToMany(mappedBy="hczapplication")
	private List<Hczapplicationstatus> hczapplicationstatuses;

	//bi-directional many-to-one association to Hczinterviewanswer
	@OneToMany(mappedBy="hczapplication")
	private List<Hczinterviewanswer> hczinterviewanswers;

	public Hczapplication() {
	}

	public long getApplicationid() {
		return this.applicationid;
	}

	public void setApplicationid(long applicationid) {
		this.applicationid = applicationid;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getApplicantname() {
		return this.applicantname;
	}

	public void setApplicantname(String applicantname) {
		this.applicantname = applicantname;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public long getCitizen() {
		return this.citizen;
	}

	public void setCitizen(long citizen) {
		this.citizen = citizen;
	}

	public long getDruguser() {
		return this.druguser;
	}

	public void setDruguser(long druguser) {
		this.druguser = druguser;
	}

	public String getEducation() {
		return this.education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getEmpreferences() {
		return this.empreferences;
	}

	public void setEmpreferences(String empreferences) {
		this.empreferences = empreferences;
	}

	public String getJobhistory() {
		return this.jobhistory;
	}

	public void setJobhistory(String jobhistory) {
		this.jobhistory = jobhistory;
	}

	public String getSkills() {
		return this.skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public long getVeteran() {
		return this.veteran;
	}

	public void setVeteran(long veteran) {
		this.veteran = veteran;
	}

	public Hczjob getHczjob() {
		return this.hczjob;
	}

	public void setHczjob(Hczjob hczjob) {
		this.hczjob = hczjob;
	}

	public List<Hczapplicationstatus> getHczapplicationstatuses() {
		return this.hczapplicationstatuses;
	}

	public void setHczapplicationstatuses(List<Hczapplicationstatus> hczapplicationstatuses) {
		this.hczapplicationstatuses = hczapplicationstatuses;
	}

	public Hczapplicationstatus addHczapplicationstatus(Hczapplicationstatus hczapplicationstatus) {
		getHczapplicationstatuses().add(hczapplicationstatus);
		hczapplicationstatus.setHczapplication(this);

		return hczapplicationstatus;
	}

	public Hczapplicationstatus removeHczapplicationstatus(Hczapplicationstatus hczapplicationstatus) {
		getHczapplicationstatuses().remove(hczapplicationstatus);
		hczapplicationstatus.setHczapplication(null);

		return hczapplicationstatus;
	}

	public List<Hczinterviewanswer> getHczinterviewanswers() {
		return this.hczinterviewanswers;
	}

	public void setHczinterviewanswers(List<Hczinterviewanswer> hczinterviewanswers) {
		this.hczinterviewanswers = hczinterviewanswers;
	}

	public Hczinterviewanswer addHczinterviewanswer(Hczinterviewanswer hczinterviewanswer) {
		getHczinterviewanswers().add(hczinterviewanswer);
		hczinterviewanswer.setHczapplication(this);

		return hczinterviewanswer;
	}

	public Hczinterviewanswer removeHczinterviewanswer(Hczinterviewanswer hczinterviewanswer) {
		getHczinterviewanswers().remove(hczinterviewanswer);
		hczinterviewanswer.setHczapplication(null);

		return hczinterviewanswer;
	}

}