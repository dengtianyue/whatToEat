package entity;

import java.util.HashSet;
import java.util.Set;

public class User {
	private int userID;
	private String password;
	private String username;
	private Set<Food>likeFood = new HashSet<Food>();
	private Set<Food>dislikeFood = new HashSet<Food>();
	
	
	public Set<Food> getLikeFood() {
		return likeFood;
	}
	public void setLikeFood(Set<Food> likeFood) {
		this.likeFood = likeFood;
	}
	public Set<Food> getDislikeFood() {
		return dislikeFood;
	}
	public void setDislikeFood(Set<Food> dislikeFood) {
		this.dislikeFood = dislikeFood;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public User(int userID, String password, String username, Set<Food> likeFood, Set<Food> dislikeFood) {
		super();
		this.userID = userID;
		this.password = password;
		this.username = username;
		this.likeFood = likeFood;
		this.dislikeFood = dislikeFood;
	}
	public User() {
		super();
	}
	public User(String password, String username, Set<Food> likeFood, Set<Food> dislikeFood) {
		super();
		this.password = password;
		this.username = username;
		this.likeFood = likeFood;
		this.dislikeFood = dislikeFood;
	}
	public User(String username, String password) {
		super();
		this.password = password;
		this.username = username;
	}
	
	
	
}
