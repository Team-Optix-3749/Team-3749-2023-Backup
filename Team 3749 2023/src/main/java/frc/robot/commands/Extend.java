package frc.robot.commands;

import frc.robot.utils.*;
import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class Extend extends CommandBase {
    private final Elevator m_elevator;

    public Extend(Elevator elevator) {
        m_elevator = elevator;
        addRequirements(elevator);
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        m_elevator.setSpeed(Constants.setpoint_velocity);
    }

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