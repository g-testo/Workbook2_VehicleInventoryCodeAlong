package com.gt;

public class Main {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[20];
        int totalNumOfVehicles = 0;

        vehicles[0] = new Vehicle(12121212, "Honda Accord", "White", 200_000, 2_000);
        vehicles[1] = new Vehicle(12121213, "Honda Fit", "White", 120_000, 1_900);
        vehicles[2] = new Vehicle(12121214, "Tesla Type S", "Red", 130_000, 1_800);
        vehicles[3] = new Vehicle(12121215, "Toyota Camry", "Orange", 140_000, 1_700);
        vehicles[4] = new Vehicle(12121216, "Ford Focus", "Black", 150_000, 1_600);
        vehicles[5] = new Vehicle(12121217, "Ferrari Enzo", "Yellow", 160_000, 1_500);


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