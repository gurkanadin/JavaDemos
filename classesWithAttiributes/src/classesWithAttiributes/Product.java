package classesWithAttiributes;

public class Product {
	public Product(int id, String name,String description, double price, int stockAmount, String color) {
		System.out.println("Block Running");
		this._id = id;
		this._color = color;
		this._description = description;
		this._stockAmount = stockAmount;
		this._price = price;
		this._name= name;
	}
	public Product() {}
	// attribute field
	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _color;
	private String _cod;

	// getter
	public int getId() {
		return _id;
	}

	// setter
	public void setId(int id) {
		// this class
		_id = id;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		this._name = name;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		this._description = description;
	}

	public double getPrice() {
		return _price;
	}

	public void setPrice(double price) {
		this._price = price;
	}

	public int getStockAmount() {
		return _stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this._stockAmount = stockAmount;
	}

	public String getColor() {
		return _color;
	}

	public void setColor(String color) {
		this._color = color;
	}

	public String getCod() {
		return this._name.substring(0,1)+ _id;
	}

	
	

}
