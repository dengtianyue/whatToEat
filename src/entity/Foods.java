package entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Foods entity. @author MyEclipse Persistence Tools
 */

public class Foods implements java.io.Serializable {

	// Fields

	private Integer fid;
	private String foodName;
	private String foodType;
	private Set dislikelists = new HashSet(0);
	private Set likelists = new HashSet(0);

	// Constructors

	/** default constructor */
	public Foods() {
	}

	/** full constructor */
	public Foods(String foodName, String foodType, Set dislikelists,
			Set likelists) {
		this.foodName = foodName;
		this.foodType = foodType;
		this.dislikelists = dislikelists;
		this.likelists = likelists;
	}

	// Property accessors

	public Integer getFid() {
		return this.fid;
	}

	public void setFid(Integer fid) {
		this.fid = fid;
	}

	public String getFoodName() {
		return this.foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getFoodType() {
		return this.foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
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

	@Override
	public String toString() {
		return "Foods [foodName=" + foodName + ", foodType=" + foodType + "]";
	}
	

}