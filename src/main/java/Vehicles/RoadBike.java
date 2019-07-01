package Vehicles;

import Driving.Bike;

import static oracle.jrockit.jfr.events.Bits.intValue;

public class RoadBike extends Bike {
    private Double topSpeed;
    private Double milesTraveled;
    private Integer tirePressure;

    public RoadBike(Double topSpeed, Double milesTraveled, Integer tirePressure){
        this.topSpeed = topSpeed;
        this.milesTraveled = milesTraveled;
        this.tirePressure = tirePressure;
    }

    public RoadBike(){
        this.topSpeed = 20.0;
        this.milesTraveled = 0.0;
        this.tirePressure = 30;
    }

    /**
     * The top speed of a road bike should be 20.0
     * but for every 1 PSI under the recommended tire
     * pressure the tires of the bike are, the top
     * speed should be reduced 1mph.
     *
     * @return 20.0 minus any reduction to top speed
     */
    @Override
    public Double getTopSpeed() {
        return this.topSpeed - (Math.abs(30.0 - tirePressure));
    }


    /**
     * transport should calculate the time it takes in
     * seconds to travel a distance base on the top
     * speed and update the tire pressure. Long trips
     * on a road bike will reduce its PSI, so for
     * every 60 miles traveled in a single trip, the
     * tires of the bike should reduce 1 PSI until
     * the tires register 20 PSI where no more air
     * will be lost on trips.
     *
     * @param distance - length of travel in miles
     * @return time in seconds to travel distance
     */
    @Override
    public Integer transport(Double distance) {
        this.milesTraveled += distance;
        Double tirePressureDistance = distance;
        while (tirePressureDistance >= 60 && this.tirePressure > 20){
            tirePressure -= 1;
            tirePressureDistance -= 60;
        }
        return intValue(distance/this.topSpeed) * 60 * 60;
    }

    /**
     * Gets the current amount of pressure in PSI
     * in the tires
     *
     * @return PSI as Integer
     */
    @Override
    public Integer getTirePressure() {
        return this.tirePressure;
    }

    /**
     * Returns the tires to the recommended PSI
     */
    @Override
    public void inflateTires() {
        this.tirePressure = 30;
    }

    /**
     * The Recommended PSI of a road bike is 30
     * @return recommended PSI
     */
    @Override
    public Integer recommendedTirePressure() {
        return 30;
    }
}
