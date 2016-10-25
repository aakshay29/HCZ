package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the HCZINTERVIEWANSWERS database table.
 * 
 */
@Entity
@Table(name="HCZINTERVIEWANSWERS")
@NamedQuery(name="Hczinterviewanswer.findAll", query="SELECT h FROM Hczinterviewanswer h")
public class Hczinterviewanswer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long interviewanswerid;

	private String answer;

	private long interviewtype;

	//bi-directional many-to-one association to Hczapplication
	@ManyToOne
	@JoinColumn(name="APPLICATIONID")
	private Hczapplication hczapplication;

	//bi-directional many-to-one association to Hczinterviewquestion
	@ManyToOne
	@JoinColumn(name="INTERVIEWQUESTIONID")
	private Hczinterviewquestion hczinterviewquestion;

	public Hczinterviewanswer() {
	}

	public long getInterviewanswerid() {
		return this.interviewanswerid;
	}

	public void setInterviewanswerid(long interviewanswerid) {
		this.interviewanswerid = interviewanswerid;
	}

	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public long getInterviewtype() {
		return this.interviewtype;
	}

	public void setInterviewtype(long interviewtype) {
		this.interviewtype = interviewtype;
	}

	public Hczapplication getHczapplication() {
		return this.hczapplication;
	}

	public void setHczapplication(Hczapplication hczapplication) {
		this.hczapplication = hczapplication;
	}

	public Hczinterviewquestion getHczinterviewquestion() {
		return this.hczinterviewquestion;
	}

	public void setHczinterviewquestion(Hczinterviewquestion hczinterviewquestion) {
		this.hczinterviewquestion = hczinterviewquestion;
	}

}