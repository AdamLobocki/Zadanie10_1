public class Vehicle {
    private String name;
    private double fuelCapacity;
    private double fuelConsumption;

    public Vehicle(String name, double fuelCapacity, double fuelConsumption) {
        this.name = name;
        this.fuelCapacity = fuelCapacity;
        this.fuelConsumption = fuelConsumption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    double range() {
        double x = fuelCapacity / fuelConsumption * 100;
        return x;

    }

    public String getInfo() {
        return "";
    }
}
