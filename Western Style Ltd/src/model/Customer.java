package model;
/**
 * 
 */

/**
 * @author Nicolai
 *
 */
public class Customer {
	
	private String name;
	private String address;
	private int zipcode;
	private String city;
	private int phoneNumber;
	
	// Getter & Setter Methods
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	public String getAddress() {return address;}
	public void setAddress(String address) {this.address = address;}
	
	public int getZipcode() {return zipcode;}
	public void setZipcode(int zipcode) {this.zipcode = zipcode;}
	
	public String getCity() {return city;}
	public void setCity(String city) {this.city = city;}
	
	public int getPhoneNumber() {return phoneNumber;}
	public void setPhoneNumber(int phoneNumber) {this.phoneNumber = phoneNumber;}

}
