package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the HCZINTERVIEWQUESTIONS database table.
 * 
 */
@Entity
@Table(name="HCZINTERVIEWQUESTIONS")
@NamedQuery(name="Hczinterviewquestion.findAll", query="SELECT h FROM Hczinterviewquestion h")
public class Hczinterviewquestion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long interviewquestionid;

	private long interviewtype;

	private String question;

	//bi-directional many-to-one association to Hczinterviewanswer
	@OneToMany(mappedBy="hczinterviewquestion")
	private List<Hczinterviewanswer> hczinterviewanswers;

	public Hczinterviewquestion() {
	}

	public long getInterviewquestionid() {
		return this.interviewquestionid;
	}

	public void setInterviewquestionid(long interviewquestionid) {
		this.interviewquestionid = interviewquestionid;
	}

	public long getInterviewtype() {
		return this.interviewtype;
	}

	public void setInterviewtype(long interviewtype) {
		this.interviewtype = interviewtype;
	}

	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Hczinterviewanswer> getHczinterviewanswers() {
		return this.hczinterviewanswers;
	}

	public void setHczinterviewanswers(List<Hczinterviewanswer> hczinterviewanswers) {
		this.hczinterviewanswers = hczinterviewanswers;
	}

	public Hczinterviewanswer addHczinterviewanswer(Hczinterviewanswer hczinterviewanswer) {
		getHczinterviewanswers().add(hczinterviewanswer);
		hczinterviewanswer.setHczinterviewquestion(this);

		return hczinterviewanswer;
	}

	public Hczinterviewanswer removeHczinterviewanswer(Hczinterviewanswer hczinterviewanswer) {
		getHczinterviewanswers().remove(hczinterviewanswer);
		hczinterviewanswer.setHczinterviewquestion(null);

		return hczinterviewanswer;
	}

}