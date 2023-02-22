// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.*;
import frc.robot.utils.*;

import java.lang.annotation.Target;
import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public class ReflectiveAlign extends CommandBase {
    @SuppressWarnings({ "PMD.UnusedPrivateField", "PMD.SingularField" })

    private final Drivetrain drive;
    private DoubleSupplier speed;
    private double reflective_x;
    private double middle_x;
    private double x_diff;

    public ReflectiveAlign(Drivetrain drivetrain, DoubleSupplier speed) {
        drive = drivetrain;
        this.speed = speed;
        addRequirements(drivetrain);
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        reflective_x = LimelightPhotonGetters.getX();
        middle_x = Constants.VisionConstants.limelight_pxls / 2;
        x_diff = reflective_x - middle_x;
        drive.arcadeDrive(speed.getAsDouble(), x_diff/middle_x);
    }

    @Override
    public void end(boolean interrupted) {
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }
}