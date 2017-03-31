package entity;

import java.util.HashSet;
import java.util.Set;

public class Food {
	private int foodID;
	private String foodname;
	private Set<TypeLink>typelink = new HashSet<TypeLink>();
	private Set<StyleLink>StyleLink = new HashSet<StyleLink>();
	private User User ;
	
	
	
	public int getFoodID() {
		return foodID;
	}
	public void setFoodID(int foodID) {
		this.foodID = foodID;
	}
	public String getFoodname() {
		return foodname;
	}
	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	public Set<TypeLink> getTypelink() {
		return typelink;
	}
	public void setTypelink(Set<TypeLink> tyoelink) {
		this.typelink = tyoelink;
	}
	public Set<StyleLink> getStyleLink() {
		return StyleLink;
	}
	public void setStyleLink(Set<StyleLink> styleLink) {
		StyleLink = styleLink;
	}
	public User getUser() {
		return User;
	}
	public void setUser(User user) {
		User = user;
	}
	public Food(int foodID, String foodname, Set<TypeLink> typelink, Set<entity.StyleLink> styleLink,
			entity.User user) {
		super();
		this.foodID = foodID;
		this.foodname = foodname;
		this.typelink = typelink;
		StyleLink = styleLink;
		User = user;
	}
	public Food() {
		super();
	}
	public Food(String foodname) {
		super();
		this.foodname = foodname;
	}
	
	

	
	
}
