package data.models;

public class User {
    private String name;
    private String description;
    private String type;
    private String price;
    public User(String name, String description, String type, String price) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.price = price;
    }

    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public String getdescription() {
        return description;
    }
    public void setdescription(String description) {
        this.description = description;
    }
    public String gettype() {
        return type;
    }
    public void settype(String type) {
        this.type = type;
    }
    public String getprice() {
        return price;
    }
    public void setprice(String price) {
        this.price = price;
    }
    // methods
    @Override
    public String toString() {
        return this.name + "," + this.description + "," + this.type + "," + this.price;
    }
    
}
