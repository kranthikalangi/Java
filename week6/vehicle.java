/*5. Write an application to create a super class Vehicle with information vehicle
number,insurance number,color and methods getConsumption() displayConsumption().
Derive the sub-classes TwoWheeler and FourWheeler with method maintenance() and
average() to print the maintenance And average of vehicle.    */


import java.util.Scanner;

// Superclass
class Vehicle {
    protected String vehicleNumber;
    protected String insuranceNumber;
    protected String color;

    public Vehicle(String vehicleNumber, String insuranceNumber, String color) {
        this.vehicleNumber = vehicleNumber;
        this.insuranceNumber = insuranceNumber;
        this.color = color;
    }

    public void getConsumption() {
        System.out.println("Getting consumption for vehicle " + vehicleNumber);
        // You can implement specific consumption logic here
    }

    public void displayConsumption() {
        System.out.println("Displaying consumption for vehicle " + vehicleNumber);
        // You can implement specific display logic here
    }
}

// Subclass TwoWheeler
class TwoWheeler extends Vehicle {
    public TwoWheeler(String vehicleNumber, String insuranceNumber, String color) {
        super(vehicleNumber, insuranceNumber, color);
    }

    public void maintenance() {
        System.out.println("Performing maintenance for Two Wheeler " + vehicleNumber);
        // You can implement specific maintenance logic here
    }

    public void average() {
        System.out.println("Calculating average for Two Wheeler " + vehicleNumber);
        // You can implement specific average calculation logic here
    }
}

// Subclass FourWheeler
class FourWheeler extends Vehicle {
    public FourWheeler(String vehicleNumber, String insuranceNumber, String color) {
        super(vehicleNumber, insuranceNumber, color);
    }

    public void maintenance() {
        System.out.println("Performing maintenance for Four Wheeler " + vehicleNumber);
        // You can implement specific maintenance logic here
    }

    public void average() {
        System.out.println("Calculating average for Four Wheeler " + vehicleNumber);
        // You can implement specific average calculation logic here
    }
}

// Main class
public class vehicle {
    public static void main(String[] args) {
        // Example usage
        TwoWheeler twoWheeler = new TwoWheeler("TW123", "TW-INS-456", "Red");
        FourWheeler fourWheeler = new FourWheeler("FW789", "FW-INS-012", "Blue");

        twoWheeler.getConsumption();
        twoWheeler.displayConsumption();
        twoWheeler.maintenance();
        twoWheeler.average();

        fourWheeler.getConsumption();
        fourWheeler.displayConsumption();
        fourWheeler.maintenance();
        fourWheeler.average();
    }
}

