package com.storing.things;

//Class Shirt where is information about shirt, its name and material
public class Shirt implements Thing{
	
	String name;
	Material material;
	
	public Shirt(String name, Material material) {
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
		return "Shirt [name=" + name + ", material=" + material + "]";
	}
	

}
