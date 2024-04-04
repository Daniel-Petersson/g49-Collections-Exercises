package se.lexicon;

public class Car {
    //12. Create a new class and call it Car. Add fields for Id,Brand and Model + getters and setters
    //Create a new hashMap of type <Integer,Car> and populate it with elements containing an
    //id(Integer) and a car object(Car). Lastly, print out only the car's brand.

    //Fields
    private int id;
    private String brand;
    private String model;

    //Constructors
    public Car(int id, String brand, String model) {
        this.id = id;
        this.brand = brand;
        this.model = model;
    }

    //Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    //Getters

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
    @Override
    public String toString(){
        return "Key{"+
                // "Id: " +getId()+
                "Brand: " + getBrand();
                //", Model: " +getModel();
    }
}
