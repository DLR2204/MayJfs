package demo;

import org.springframework.stereotype.Component;

@Component("pro")
public class Product {

	int proprice;
	
	String proName;
	
	int proquant;
	
	String proType;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int proprice, String proName, int proquant, String proType) {
		super();
		this.proprice = proprice;
		this.proName = proName;
		this.proquant = proquant;
		this.proType = proType;
	}
	
	
}
