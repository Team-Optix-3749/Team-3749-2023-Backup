// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.commands.RotateDown;
import frc.robot.commands.RotateUp;
import frc.robot.subsystems.Arm;
import frc.robot.utils.POV;
import frc.robot.utils.Xbox;
/***
 * @author Anusha Khobare
 * @author Ryan R McWeeny
 *     Sets button bindings for button A and button B on an Xbox Controller.
 *     Button A runs the RotateDown Command (causing the arm to rotate down) while held.
 *     Button B runs the RotateUp Command (causing the arm to rotate up) while held.
 *     When buttons are released or niether button is pressed, niether command runs.
 */
public class RobotContainer {

  // Controllers
  private final Xbox pilot = new Xbox(0);
  private final Xbox operator = new Xbox(1);

  private final POV pilotPOV = new POV(pilot);
  private final POV operatorPOV = new POV(operator);

  Arm arm;

  public RobotContainer() {
    configureButtonBindings();
    configureDefaultCommands();
  }

  private void configureDefaultCommands() {}

  private void configureButtonBindings() {
    pilot.aWhileHeld(
      () -> arm.setSpeed(Constants.setpoint_velocity), () -> arm.setSpeed(0), arm
    );
    pilot.bWhileHeld(
      () -> arm.setSpeed(-Constants.setpoint_velocity), () -> arm.setSpeed(0), arm
    );
  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }  
}
