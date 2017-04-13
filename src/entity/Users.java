package entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Users entity. @author MyEclipse Persistence Tools
 */

public class Users implements java.io.Serializable {

	// Fields

	private Integer uid;
	private String userName;
	private String password;
	private Set dislikelists = new HashSet(0);
	private Set likelists = new HashSet(0);

	// Constructors

	
	
	/** default constructor */
	public Users() {
	}

	public Users(Integer uid, String userName, String password) {
		super();
		this.uid = uid;
		this.userName = userName;
		this.password = password;
	}

	public Users(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	/** full constructor */
	public Users(String userName, String password, Set dislikelists,
			Set likelists) {
		this.userName = userName;
		this.password = password;
		this.dislikelists = dislikelists;
		this.likelists = likelists;
	}

	// Property accessors

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set getDislikelists() {
		return this.dislikelists;
	}

	public void setDislikelists(Set dislikelists) {
		this.dislikelists = dislikelists;
	}

	public Set getLikelists() {
		return this.likelists;
	}

	public void setLikelists(Set likelists) {
		this.likelists = likelists;
	}

}