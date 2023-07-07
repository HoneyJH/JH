package a0707;

public class Car {
    private String modelName;
    private int modelYear;
    private String color;
    // private int maxSpeed;

    Car(String modelName, int modelYear, String color, int maxSpeed) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        // this.maxSpeed = maxSpeed;
    }

    Car(){
        this("아반떼", 2016, "흰색", 200);
    }

    public String getmodel(){
        return this.modelYear + "년식" + this.modelName + " " + this.color;
    }
}
