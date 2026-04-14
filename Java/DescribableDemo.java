interface Describable{
	String describe();
}

class Product implements Describable{
	private String name;
	private String sku;

	Product(String name, String sku){
		this.name = name;
		this.sku = sku;
	}

	public String describe() {
		String description = "Name = "+this.name+" ("+this.sku+")";
		return description;
	}
}

public class DescribableDemo{
	public static void main(String[] args){
		Describable d = new Product("Mouse", "SKU-001");
		System.out.println(d.describe());
	}
}