package frc.robot.utils;

/***
 * Stores constant variables within subclasses for different subsystems.
 * Such constant values can include motor IDs, motor speed, PID
 * constants, etc...
 */
public final class Constants {

    public static final class Base {
        public static final int talon_id = 3749;
        public static final SmartData<Double> speed = new SmartData<Double>("Base Speed", 2.54);
    }
    public static final kd = 0;
    public static final kp = 0;
    public static final ki = 0;
    public static double setpoint_velocity = 0;
    public static double stop_velocity = 0;
}
