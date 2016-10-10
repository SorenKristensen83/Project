/**
 * 
 */

/**
 * @author Nicolai
 *
 */
public class Order {
	
	private int ID;
	private String date;
	private String deliveryDate;
	private String deliveryStatus;
	
	// Getter & Setter Methods
	public int getID() {return ID;}
	public void setID(int iD) {ID = iD;}
	
	public String getDate() {return date;}
	public void setDate(String date) {this.date = date;}
	
	public String getDeliveryDate() {return deliveryDate;}
	public void setDeliveryDate(String deliveryDate) {this.deliveryDate = deliveryDate;}
	
	public String getDeliveryStatus() {return deliveryStatus;}
	public void setDeliveryStatus(String deliveryStatus) {this.deliveryStatus = deliveryStatus;}

}
