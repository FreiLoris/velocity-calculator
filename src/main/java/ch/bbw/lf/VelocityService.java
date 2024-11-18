package ch.bbw.lf;

public class VelocityService {
    public static double calculateVelocity(double distance, double time) {
        return distance / time;
    }
    public static double calculateDistance(double velocity, double time) {
        return velocity * time;
    }
    public static double calculateTime(double velocity, double distance) {
        return distance / velocity;
    }
}
