package classesWithAttiributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.name = "Laptop";
		product.id = 1;
		product.description = "Monster Laptop";
		product.price = 5000;
		product.stockAmount = 3;
		
		ProductManager productmanager = new ProductManager();
		productmanager.Add(product);
		

	}

}
