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
public class LimelightFollow extends CommandBase {
    @SuppressWarnings({ "PMD.UnusedPrivateField", "PMD.SingularField" })

    private final Drivetrain drive;
    private DoubleSupplier speed;
    private double[] april_lst;
    private double target_size;
    private double target_x;

    public LimelightFollow(Drivetrain drivetrain, DoubleSupplier speed) {
        drive = drivetrain;
        this.speed = speed;
        addRequirements(drivetrain);
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        april_lst = AprilTagGetters.getXAndSize();
        target_x = april_lst[1];
        target_size = april_lst[2];
        System.out.println(target_x);
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