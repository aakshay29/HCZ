package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the HCZUSER database table.
 * 
 */
@Entity
@NamedQuery(name="Hczuser.findAll", query="SELECT h FROM Hczuser h")
public class Hczuser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long userid;

	private String username;

	private String userpassword;

	private BigDecimal userrole;

	public Hczuser() {
	}

	public long getUserid() {
		return this.userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpassword() {
		return this.userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	public BigDecimal getUserrole() {
		return this.userrole;
	}

	public void setUserrole(BigDecimal userrole) {
		this.userrole = userrole;
	}

}