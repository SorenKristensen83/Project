package model;
/**
 * 
 */

/**
 * @author Nicolai
 *
 */
public class Product {

	private int barcode;
	private String productName;
	private double purchasePrice;
	private double salesPrice;
	private double rentPrice;
	private String countryOfOrigin;
	private int stock;
	
	// Getter & Setter Methods
	public int getBarcode() {return barcode;}
	public void setBarcode(int barcode) {this.barcode = barcode;}
	
	public String getProductName() {return productName;}
	public void setProductName(String productName) {this.productName = productName;}
	
	public double getPurchasePrice() {return purchasePrice;}
	public void setPurchasePrice(double purchasePrice) {this.purchasePrice = purchasePrice;}
	
	public double getSalesPrice() {return salesPrice;}
	public void setSalesPrice(double salesPrice) {this.salesPrice = salesPrice;}
	
	public double getRentPrice() {return rentPrice;}
	public void setRentPrice(double rentPrice) {this.rentPrice = rentPrice;}
	
	public String getCountryOfOrigin() {return countryOfOrigin;}
	public void setCountryOfOrigin(String countryOfOrigin) {this.countryOfOrigin = countryOfOrigin;}
	
	public int getStock() {return stock;}
	public void setStock(int stock) {this.stock = stock;}
}
