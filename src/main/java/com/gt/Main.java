package com.gt;

public class Main {
    public static void main(String[] args) {
        Vehicle gregsVroomVroom = new Vehicle(
                12121212,
                "Honda Accord",
                "White",
                200_000,
                2_000
        );

        System.out.println(gregsVroomVroom.getMakeModel());
    }
}

class Vehicle {
    // Properties
    private long vehicleId;
    private String makeModel;
    private String color;
    private int odometerReading;
    private float price;

    // Constructor(s)
    public Vehicle(long vehicleId, String makeModel, String color, int odometerReading, float price){
        this.vehicleId = vehicleId;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;
    }

    // Getters and Setters
    public long getVehicleId(){
        return this.vehicleId;
    }

    public void setVehicleId(long vehicleId){
        this.vehicleId = vehicleId;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    // Custom methods

}