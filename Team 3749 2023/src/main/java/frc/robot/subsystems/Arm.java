package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import com.revrobotics.RelativeEncoder;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.utils.Constants;

/***
 * @author Anusha Khobare
 * @author Ryan R McWeeny
 *     Arm.java intializes talon motor, talon motor encoder, and PID Controller. setSpeed() uses speed PID. 
 */
public class Arm extends SubsystemBase{
    private WPI_TalonFX talon = new WPI_TalonFX(Constants.Base.talon_id); //intialize motor
    private RelativeEncoder talon_encoder; //intialize encoder
    private final PIDController elevatorController = new PIDController(Constants.kp, Constants.ki, Constants.kd); //intiaize PID Controller
    
    public void setSpeed(double setpoint_velocity){
        //setpoint_velocity is either the negative or positive value of Constants.setpoint_velocity
        talon.set(elevatorController.calculate(talon_encoder.getVelocity(), setpoint_velocity));
        //uses current motor velocity and desired velocty to caluclate 
    }
     // Runs every 20 ms
    @Override
    public void periodic() {
        }
}
