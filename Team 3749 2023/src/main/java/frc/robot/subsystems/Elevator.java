package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import com.revrobotics.RelativeEncoder;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.utils.Constants;

public class Elevator extends SubsystemBase{
    private WPI_TalonFX talon = new WPI_TalonFX(Constants.Base.talon_id);
    private RelativeEncoder talon_encoder;
    private final PIDController elevatorController = new PIDController(Constants.kp, Constants.ki, Constants.kd);
    
    public void setSpeed(double setpoint_velocity){
        talon.set(elevatorController.calculate(talon_encoder.getVelocity(), setpoint_velocity));
    }
        // Runs every 20 ms
    @Override
    public void periodic() {
    }
    
}
