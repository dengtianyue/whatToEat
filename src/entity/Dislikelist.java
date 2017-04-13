package entity;

/**
 * Dislikelist entity. @author MyEclipse Persistence Tools
 */

public class Dislikelist implements java.io.Serializable {

	// Fields

	private Integer did;
	private Foods foods;
	private Users users;

	// Constructors

	/** default constructor */
	public Dislikelist() {
	}

	/** full constructor */
	public Dislikelist(Foods foods, Users users) {
		this.foods = foods;
		this.users = users;
	}

	// Property accessors

	public Integer getDid() {
		return this.did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public Foods getFoods() {
		return this.foods;
	}

	public void setFoods(Foods foods) {
		this.foods = foods;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

}