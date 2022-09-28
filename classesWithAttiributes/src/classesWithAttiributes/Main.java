package classesWithAttiributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setName( "Laptop");
		product.setId(1) ;
		product.setDescription ("Monster Laptop");
		product.setPrice  (5000);
		product.setStockAmount ( 3);
		
		ProductManager productmanager = new ProductManager();
		productmanager.Add(product);
		System.out.println(product.getCod());

	}

}
