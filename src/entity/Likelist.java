package entity;

/**
 * Likelist entity. @author MyEclipse Persistence Tools
 */

public class Likelist implements java.io.Serializable {

	// Fields

	private Integer lid;
	private Foods foods;
	private Users users;

	// Constructors

	/** default constructor */
	public Likelist() {
	}

	/** full constructor */
	public Likelist(Foods foods, Users users) {
		this.foods = foods;
		this.users = users;
	}

	// Property accessors

	public Integer getLid() {
		return this.lid;
	}

	public void setLid(Integer lid) {
		this.lid = lid;
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