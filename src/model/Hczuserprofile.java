package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the HCZUSERPROFILE database table.
 * 
 */
@Entity
@NamedQuery(name="Hczuserprofile.findAll", query="SELECT h FROM Hczuserprofile h")
public class Hczuserprofile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long userid;

	private String address;

	private String education;

	private String email;

	private String experience;

	private String firstreference;

	private String objective;

	private String secondreference;

	private String skills;

	private String username;

	private String usersummary;

	public Hczuserprofile() {
	}

	public long getUserid() {
		return this.userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEducation() {
		return this.education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getExperience() {
		return this.experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getFirstreference() {
		return this.firstreference;
	}

	public void setFirstreference(String firstreference) {
		this.firstreference = firstreference;
	}

	public String getObjective() {
		return this.objective;
	}

	public void setObjective(String objective) {
		this.objective = objective;
	}

	public String getSecondreference() {
		return this.secondreference;
	}

	public void setSecondreference(String secondreference) {
		this.secondreference = secondreference;
	}

	public String getSkills() {
		return this.skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsersummary() {
		return this.usersummary;
	}

	public void setUsersummary(String usersummary) {
		this.usersummary = usersummary;
	}

}