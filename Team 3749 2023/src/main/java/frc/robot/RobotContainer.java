package frc.robot;

import frc.robot.commands.*;
import frc.robot.subsystems.*;
import frc.robot.utils.POV;
import frc.robot.utils.Xbox;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.InstantCommand;

public class RobotContainer {

    private final Drivetrain drivetrain = new Drivetrain();


    frc.robot.utils.Xbox Pilot;
    frc.robot.utils.Xbox Operator;
    POV PiPOV;
    POV OpPOV;

    public RobotContainer() {
        configureButtonBindings();
    }

    private void configureButtonBindings() {
        Pilot = new Xbox(0);
        Operator = new Xbox(1);

        PiPOV = new POV(new GenericHID(0));
        OpPOV = new POV(new GenericHID(1));

        drivetrain.setDefaultCommand(new LimelightFollow(drivetrain, Pilot::getLeftY));

        // m_intake.setDefaultCommand(
        //     new Input(m_intake, Pilot::getLeftTrigger, Pilot::getRightTrigger));
    }
    public Command getAutonomousCommand() {
        return Commands.print("No autonomous command configured");
  }      
}
 