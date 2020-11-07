package web.model;

//import javax.persistence.*;

/**
 * @author Serov Maxim
 */
public class Car {
    private Long id;

    private String brand;

    private String model;

    private int horsePower;

    public Car() {
    }

    public Car(String brand, String model, int horsePower) {
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Car: " +
                "brand: '" + brand + '\'' +
                ", model: '" + model + '\'' +
                ", horsePower: " + horsePower +
                '}';
    }
}