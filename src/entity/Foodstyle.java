package entity;

import java.util.HashSet;
import java.util.Set;

public class Foodstyle {
	private int foodstyleID;
	private String styleName;
	private Set<StyleLink>StyleLink = new HashSet<StyleLink>();
	public int getFoodstyleID() {
		return foodstyleID;
	}
	public void setFoodstyleID(int foodstyleID) {
		this.foodstyleID = foodstyleID;
	}
	public String getStyleName() {
		return styleName;
	}
	public void setStyleName(String styleName) {
		this.styleName = styleName;
	}
	public Set<StyleLink> getStyleLink() {
		return StyleLink;
	}
	public void setStyleLink(Set<StyleLink> styleLink) {
		StyleLink = styleLink;
	}
	public Foodstyle(int foodstyleID, String styleName, Set<entity.StyleLink> styleLink) {
		super();
		this.foodstyleID = foodstyleID;
		this.styleName = styleName;
		StyleLink = styleLink;
	}
	public Foodstyle() {
		super();
	}
	public Foodstyle(String styleName) {
		super();
		this.styleName = styleName;
	}
	
	

	
	
	
	
	
}
