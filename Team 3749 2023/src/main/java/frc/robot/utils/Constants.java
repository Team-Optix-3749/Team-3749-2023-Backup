package frc.robot.utils;

/***
 * Stores constant variables within subclasses for different subsystems.
 * Such constant values can include motor IDs, motor speed, PID
 * constants, etc...
 */
public final class Constants {

    public static final class Base {
        public static final int talon_id = 3749; //motor_id (placeholder number currently)
        public static final SmartData<Double> speed = new SmartData<Double>("Base Speed", 2.54);
    }
    //PID Values (0 as a placeholder)
    public static final double kd = 0;
    public static final double kp = 0;
    public static final double ki = 0;

    public static double setpoint_velocity = 0; //desired velocity (0 as placeholder)
    public static double stop_velocity = 0; // stops the motors by setting speed to 0
}
