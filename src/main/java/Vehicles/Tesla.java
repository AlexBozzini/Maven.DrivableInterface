package Vehicles;

import Driving.Car;

import static oracle.jrockit.jfr.events.Bits.intValue;

public class Tesla extends Car {
    private Double milesTraveled;
    private Double topSpeed;

    public Tesla(Double milesTraveled, Double topSpeed) {
        this.milesTraveled = milesTraveled;
        this.topSpeed = topSpeed;
    }

    public Tesla(){
        this.milesTraveled = 0.0;
        this.topSpeed = 155.0;
    }

    @Override
    public Boolean needsOilChange() {
        return false;
    }

    @Override
    public void changeOil() {
        // N/A
    }

    @Override
    public Boolean checkEngineLight() {
        return false;
    }

    @Override
    public Double getDistanceTraveled() {
        return this.milesTraveled;
    }

    @Override
    public Double getTopSpeed() {
        return this.topSpeed;
    }

    @Override
    public Integer transport(Double distance) {
        this.milesTraveled += distance;
        return intValue(distance/this.topSpeed) * 60 * 60;
    }
}
