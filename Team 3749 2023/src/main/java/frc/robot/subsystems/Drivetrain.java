
package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.interfaces.Gyro;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.utils.Constants;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import java.lang.Math;
import frc.robot.utils.*;

public class Drivetrain extends SubsystemBase{
  public WPI_TalonFX frontLeft = new WPI_TalonFX(Constants.Drivetrain.frontLeftID);
  public WPI_TalonFX frontRight = new WPI_TalonFX(Constants.Drivetrain.frontRightID);

  public WPI_TalonFX backLeft = new WPI_TalonFX(Constants.Drivetrain.backLeftID);
  public WPI_TalonFX backRight = new WPI_TalonFX(Constants.Drivetrain.backRightID);

  public MotorControllerGroup leftMotorControl = new MotorControllerGroup(frontLeft, backLeft);
  public MotorControllerGroup rightMotorControl = new MotorControllerGroup(frontRight, backRight);

  public DifferentialDrive differentialDrive = new DifferentialDrive(leftMotorControl, rightMotorControl);

  //private final Gyro gyro = new AHRS();
  public Drivetrain (){
    leftMotorControl.setInverted(true);
  }

  
    public void arcadeDrive(double speed, double rotation) {
    differentialDrive.arcadeDrive(speed, rotation);
  }
  
    public void stop() {
    differentialDrive.arcadeDrive(0, 0);
  }
  public void periodic(){
    LimelightPhotonGetters.getX();
  }
}


  

