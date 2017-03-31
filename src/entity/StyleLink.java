package entity;

public class StyleLink {
	private int styleLinkID;
	private Food food;
	private Foodstyle foodstyle;
	public int getStyleLinkID() {
		return styleLinkID;
	}
	public void setStyleLinkID(int styleLinkID) {
		this.styleLinkID = styleLinkID;
	}
	public Food getFood() {
		return food;
	}
	public void setFood(Food food) {
		this.food = food;
	}
	public Foodstyle getFoodstyle() {
		return foodstyle;
	}
	public void setFoodstyle(Foodstyle foodstyle) {
		this.foodstyle = foodstyle;
	}
	public StyleLink(int styleLinkID, Food food, Foodstyle foodstyle) {
		super();
		this.styleLinkID = styleLinkID;
		this.food = food;
		this.foodstyle = foodstyle;
	}
	public StyleLink() {
		super();
	}
	
	
}
