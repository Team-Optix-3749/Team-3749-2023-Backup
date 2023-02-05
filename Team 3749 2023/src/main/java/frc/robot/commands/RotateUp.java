package frc.robot.commands;

import frc.robot.utils.*;
import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj2.command.CommandBase;

/***
 * @author Ryan McWeeny
 * @author Anusha Khobare
 * 
 *         Command uses PID controller to spin motor that extends elevator
 */

public class RotateUp extends CommandBase {
    // declares Elevator subsystem
    private final Arm m_arm;

    // Initializes the Extend command
    public RotateUp(Arm arm) {
        m_arm = arm;
        addRequirements(arm);
    }

    // Run on command init
    @Override
    public void initialize() {
    }

    // Run every 20 ms
    @Override
    public void execute() {
        // refences PID controller in Elevator subsystem
        m_arm.setSpeed(Constants.setpoint_velocity);
    }

    // Run on command finish
    @Override
    public void end(boolean interrupted) {
        m_arm.setSpeed(Constants.stop_velocity); //set speed to 0 to stop
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }
}