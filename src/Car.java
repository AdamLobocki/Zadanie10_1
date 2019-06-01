public class Car extends Vehicle {

    private boolean airConditioner;

    public boolean getAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(boolean airConditioner) {
        this.airConditioner = airConditioner;
    }

    public Car(String name, double fuelCapacity, double fuelConsumption, boolean airConditioner) {
        super(name, fuelCapacity, fuelConsumption);
        this.airConditioner = airConditioner;
    }

    @Override
    public String getInfo(){
        return getName() + ", " + getFuelCapacity() + ", " + getFuelConsumption() + ", " + airConditioner;
    }


@Override
   public double range() {
        double x;
        if (airConditioner == true) {
            x = (getFuelCapacity() / (getFuelConsumption() + 0.8) * 100);
        } else
            x = getFuelCapacity() / getFuelConsumption() * 100;
        return x;
    }

}
