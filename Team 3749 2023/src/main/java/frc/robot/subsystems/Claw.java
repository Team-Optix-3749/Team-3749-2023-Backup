package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import com.revrobotics.RelativeEncoder;
import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.utils.Constants;
/***
 * @author Anusha Khobare
 * 
 * Claw.java intializes talon motor controlling the claw and the motor encoder. setSpeed() function uses Speed PID and the motor encoder.
 */
public class Claw extends SubsystemBase {
    private WPI_TalonFX talon = new WPI_TalonFX(Constants.Base.talon_id); //intialize motor
    private RelativeEncoder talon_encoder; //intialize encoder
    private final PIDController clawController = new PIDController(Constants.kp, Constants.ki, Constants.kd); //intiaize PID Controller
    public void setSpeed(double setpoint_velocity){
        //setpoint_velocity is either the negative or positive value of Constants.setpoint_velocity
        talon.set(clawController.calculate(talon_encoder.getVelocity(), setpoint_velocity));
        //uses current motor velocity and desired velocty to caluclate 
    }
    @Override
    public void periodic() {
    }
}
