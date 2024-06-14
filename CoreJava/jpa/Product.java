package jpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	private int proId;
	
	private String proName;
	
	private int proPrice;
	
	private int ProQuant;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public int getProId() {
		return proId;
	}

	public void setProId(int proId) {
		this.proId = proId;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public int getProPrice() {
		return proPrice;
	}

	public void setProPrice(int proPrice) {
		this.proPrice = proPrice;
	}

	public int getProQuant() {
		return ProQuant;
	}

	public void setProQuant(int proQuant) {
		ProQuant = proQuant;
	}

	public Product(int proId, String proName, int proPrice, int proQuant) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.proPrice = proPrice;
		ProQuant = proQuant;
	}
	
	

}
