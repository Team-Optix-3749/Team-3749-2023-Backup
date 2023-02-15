package frc.robot.commands;

import frc.robot.utils.*;
import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj2.command.CommandBase;

/***
 * @author Ryan McWeeny
 * @author Anusha Khobare
 * 
 *         Command uses PID controller to spin motor that detracts elevator
 */

public class Detract extends CommandBase {
    // declares Elevator subsystem
    private final Elevator m_elevator;

    // Initializes the Detract command
    public Detract(Elevator elevator) {
        m_elevator = elevator;
        addRequirements(elevator);
    }

    // Run on command init
    @Override
    public void initialize() {
    }

    // Run every 20 ms
    @Override
    public void execute() {
        // refences PID controller in Elevator subsystem
        m_elevator.setSpeed(-Constants.setpoint_velocity);
    }

    // Run on command finish
    @Override
    public void end(boolean interrupted) {
        m_elevator.setSpeed(Constants.stop_velocity); //set speed to 0 to stop
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }
}