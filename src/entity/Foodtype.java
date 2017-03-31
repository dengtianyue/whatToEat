package entity;

import java.util.HashSet;
import java.util.Set;

public class Foodtype {
	private int foodtypeID;
	private String typeName;
	private Set<TypeLink>typelink = new HashSet<TypeLink>();
	
	public int getFoodtypeID() {
		return foodtypeID;
	}
	public void setFoodtypeID(int foodtypeID) {
		this.foodtypeID = foodtypeID;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public Set<TypeLink> getTypelink() {
		return typelink;
	}
	public void setTypelink(Set<TypeLink> typelink) {
		this.typelink = typelink;
	}
	public Foodtype() {
		super();
	}
	public Foodtype(int foodtypeID, String typeName, Set<TypeLink> typelink) {
		super();
		this.foodtypeID = foodtypeID;
		this.typeName = typeName;
		this.typelink = typelink;
	}
	public Foodtype(String typeName) {
		super();
		this.typeName = typeName;
	}


	
	
}
