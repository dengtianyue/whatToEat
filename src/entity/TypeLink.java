package entity;

public class TypeLink {
	private int typeLinkID;
	private Food food;
	private Foodtype foodtype;
	public int getTypeLinkID() {
		return typeLinkID;
	}
	public void setTypeLinkID(int typeLinkID) {
		this.typeLinkID = typeLinkID;
	}
	public Food getFood() {
		return food;
	}
	public void setFood(Food food) {
		this.food = food;
	}
	public Foodtype getFoodtype() {
		return foodtype;
	}
	public void setFoodtype(Foodtype foodtype) {
		this.foodtype = foodtype;
	}
	public TypeLink(int typeLinkID, Food food, Foodtype foodtype) {
		super();
		this.typeLinkID = typeLinkID;
		this.food = food;
		this.foodtype = foodtype;
	}
	public TypeLink() {
		super();
	}
	
	
	
}
