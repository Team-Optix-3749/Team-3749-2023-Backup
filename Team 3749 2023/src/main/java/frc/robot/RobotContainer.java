// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.commands.Detract;
import frc.robot.commands.Extend;
import frc.robot.subsystems.Elevator;
import frc.robot.utils.POV;
import frc.robot.utils.Xbox;
/***
 * @author Anusha Khobare
 * @author Ryan R McWeeny
 * 
 *     Robot Container uses Xbox and POV to add button bindings for the commands. Button A is binded to the Extend Command and
 *     Button B is binded to the Detract Command.
 */

public class RobotContainer {

  // Controllers
  private final Xbox pilot = new Xbox(0);
  private final Xbox operator = new Xbox(1);

  private final POV pilotPOV = new POV(pilot);
  private final POV operatorPOV = new POV(operator);

  Elevator elevator;  

  public RobotContainer() {
    configureButtonBindings();
    configureDefaultCommands();
  }

  private void configureDefaultCommands() {}

  private void configureButtonBindings() {
    // Note that previous button bindings such as .whileHeld() have been replaced by .whileTrue()
    //pilot.a().whileTrue(new Extend(elevator)); //while button A remains held continue to run Extend command
    //pilot.b().whileTrue(new Detract(elevator)); //while button B remains held continue to run Detract command
    //when neither button is held, do nothing and wait for button press
    pilot.a().whileTrue(
      () -> elevator.set(Constants.setpoint_velocity), () -> elevator.set(Constants.stop_velocity), claw
    );
    pilot.b().whileTrue(
      () -> elevator.set(-Constants.setpoint_velocity), () -> elevator.set(Constants.stop_velocity), claw
    );
  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }  
}
