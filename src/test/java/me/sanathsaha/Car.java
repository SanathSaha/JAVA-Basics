package me.sanathsaha;

class Car extends Vehicle {
    private int numOfDoors;

    public Car(String brand, double speed, int numOfDoors) {
        super(brand, speed);
        this.numOfDoors = numOfDoors;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car Information:");
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Number of Doors: " + numOfDoors);
    }
}
