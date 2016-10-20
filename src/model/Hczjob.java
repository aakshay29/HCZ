package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the HCZJOBS database table.
 * 
 */
@Entity
@Table(name="HCZJOBS")
@NamedQuery(name="Hczjob.findAll", query="SELECT h FROM Hczjob h")
public class Hczjob implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long jobid;

	private String jobdescription;

	private String jobname;

	private String jobqualifications;

	private long jobstatus;

	//bi-directional many-to-one association to Hczapplication
	@OneToMany(mappedBy="hczjob")
	private List<Hczapplication> hczapplications;

	public Hczjob() {
	}

	public long getJobid() {
		return this.jobid;
	}

	public void setJobid(long jobid) {
		this.jobid = jobid;
	}

	public String getJobdescription() {
		return this.jobdescription;
	}

	public void setJobdescription(String jobdescription) {
		this.jobdescription = jobdescription;
	}

	public String getJobname() {
		return this.jobname;
	}

	public void setJobname(String jobname) {
		this.jobname = jobname;
	}

	public String getJobqualifications() {
		return this.jobqualifications;
	}

	public void setJobqualifications(String jobqualifications) {
		this.jobqualifications = jobqualifications;
	}

	public long getJobstatus() {
		return this.jobstatus;
	}

	public void setJobstatus(long jobstatus) {
		this.jobstatus = jobstatus;
	}

	public List<Hczapplication> getHczapplications() {
		return this.hczapplications;
	}

	public void setHczapplications(List<Hczapplication> hczapplications) {
		this.hczapplications = hczapplications;
	}

	public Hczapplication addHczapplication(Hczapplication hczapplication) {
		getHczapplications().add(hczapplication);
		hczapplication.setHczjob(this);

		return hczapplication;
	}

	public Hczapplication removeHczapplication(Hczapplication hczapplication) {
		getHczapplications().remove(hczapplication);
		hczapplication.setHczjob(null);

		return hczapplication;
	}

}