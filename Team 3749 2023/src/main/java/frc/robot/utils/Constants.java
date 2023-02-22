package frc.robot.utils;

/***
 * Stores constant variables within subclasses for different subsystems.
 * Such constant values can include motor IDs, motor speed, PID
 * constants, etc...
 */
public final class Constants {

    public static final class Base {
        public static final int neo_id = 3749;
        public static final int falcon_id = 6328;
        public static final SmartData<Double> speed = new SmartData<Double>("Base Speed", 2.54);
    }

    public static final class Drivetrain {
        public static final int frontLeftID= 14; 
        public static final int frontRightID= 12; 
        public static final int backLeftID= 13; 
        public static final int backRightID= 11; 
    }
    public static class VisionConstants {
        public static final int apriltag_pipeline_index = 0;
        public static final int reflective_tape_pipeline_index = 1;
        public static final double limelight_pxls = 1920;
      }
}
