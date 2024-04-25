class Product {
    private String itemNo;
    private String name;
    private double price;
    private short quantity;
    public Product () {
        itemNo = "FQ-5010 TU";
        name = "HP 15s";
        price = 60_000;
        quantity = 1;
    }
    /* SET ITEM NUMBER SHOULD NOT BE THERE, BECAUSE IT SHOULD BE GIVEN AT THE CONSTRUCTION TIME
    public void setItemNo(String num) {
        itemNo = num;
    }
    */

     public String getItemNo(){
        return itemNo;
    }
    public String getName() {
        return name;
    }
    public void setPrice(double pr){
        price = pr;
    }
    public double getPrice() {
        return price;
    }
    public void setQuantity(short q) {
        quantity = q;
    }
    public short getQuantity() {
        return quantity;
    }
    public String getDetails() {
         return
                 "Name: " + getName() + "\n" +
                 "Item Number: " + getItemNo() + "\n" +
                 "Price: " + getPrice() + "\n" +
                 "Quantity: " + getQuantity();
    }
}


class Customer{
    private String customerID;
    private String name;
    private String address;
    private String phoneNo;
    Customer(String n, String cID, String addr, String ph) {
        name = n;
        customerID = cID;
        address = addr;
        phoneNo = ph;
    }

    Customer() {
        customerID = "IA-3229H";
        name = "RYAN SEROPOVA";
        address = "27-A, FIRST FLOOR, NEW AVENUE APARTMENT, EAST ROAD, LOS ANGELES, USA";
        phoneNo = "+1 98320002";
    }
    public String getName() {
        return name;
    }
    public String getCustomerID() {
        return customerID;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String a){
        address = a;
    }
    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String ph) {
        phoneNo = ph;
    }

    public String getDetails() {
        return
                "Name: " + getName() + "\n" +
                "Customer ID: " + getCustomerID() + "\n" +
                "Address: " + getAddress() + "\n" +
                "Phone Number: " + getPhoneNo();
    }
}

public class Product_and_Customer_Challenge {
    public static void main(String[] args) {
        Product p = new Product();
        p.setPrice(69_000);
        p.setQuantity((short) 3);
        System.out.println(p.getDetails());

        Customer c = new Customer();
        c.setAddress("Washington DC");
        c.setPhoneNo("+25 966474");
        System.out.println(c.getDetails());

        Customer c2 = new Customer("Gian", "XZ-332H", "Tokyo (Japan)","+2 6545646");
        System.out.println(c2.getDetails());
    }
}
