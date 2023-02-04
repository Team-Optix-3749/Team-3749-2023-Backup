package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.utils.Constants;
public class Elevator extends SubsystemBase{
    private WPI_TalonFX talon = new WPI_TalonFX(Constants.Base.talon_id);
    private RelativeEncoder talon_encoder = talon.getEncoder();
    private final PIDController elevatorController = new PIDController(Constants.kp, Constants.ki, Constants.kd);
    
    private void setSpeed(setpoint_velocity){
        talon.set(PIDController.calculate(talon_encoder, setpoint_velocity));
    }
        // Runs every 20 ms
    @Override
    public void periodic() {
    }
    
}