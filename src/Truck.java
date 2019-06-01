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
        double xAC = 1.6;
        double xW = 0.5;
        if (getAirConditioner()) {
            x =( getFuelCapacity() / (getFuelConsumption() + xAC + (weight / 100) * xW)) *100;
        } else
            x = (getFuelCapacity() / (getFuelConsumption() + (weight / 100) * xW)) *100;
        return x;
    }
}
