public class Truck extends Car {
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Truck(String name, double fuelCapacity, double fuelConsumption, boolean airConditioner, double weight) {
        super(name, fuelCapacity, fuelConsumption, airConditioner);
        this.weight = weight;
    }
    @Override
    public String getInfo(){
        return getName() + ", " + getFuelCapacity() + ", " + getFuelConsumption() + ", " + getAirConditioner() +
                ", " + weight;
    }

    @Override
  public   double range() {
        double x;
        if (getAirConditioner() == true) {
            x =( getFuelCapacity() / (getFuelConsumption() + 1.6 + (weight / 100) * 0.5)) *100;
        } else
            x = (getFuelCapacity() / (getFuelConsumption() + (weight / 100) * 0.5)) *100;
        return x;
    }
}
