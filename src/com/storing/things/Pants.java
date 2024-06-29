package com.storing.things;

//Class Shirt where is information about pants, their name and material
public class Pants implements Thing {
	
	String name;
	Material material;
	
	
	
	public Pants(String name, Material material) {
		super();
		this.name = name;
		this.material = material;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Material getMaterial() {
		return material;
	}
	
	public void setMaterial(Material material) {
		this.material = material;
	}
	
	@Override
	public String toString() {
		return "Pants [name=" + name + ", material=" + material + "]";
	}
	

}
