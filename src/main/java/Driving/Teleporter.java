package Driving;

public class Teleporter implements Drivable {

    @Override
    public Double getTopSpeed() {
        return Double.POSITIVE_INFINITY;
    }

    @Override
    public Integer transport(Double distance) {
        return 0;
    }
}
