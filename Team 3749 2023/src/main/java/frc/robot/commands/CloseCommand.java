
package frc.robot.commands;

import frc.robot.utils.*;
import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj2.command.CommandBase;
public class CloseCommand extends CommandBase{
    private Claw m_claw;
    public CloseCommand(Claw claw){
        m_claw = claw;
        addRequirements(claw);
    }
    @Override
    public void initialize() {}
    @Override
    public void execute() {
        // refences PID controller in Elevator subsystem
        m_claw.setSpeed(-Constants.setpoint_velocity);}
        @Override
    public void end(boolean interrupted) {
        m_claw.setSpeed(Constants.stop_velocity); //set speed to 0 to stop
    }
    @Override
    public boolean isFinished() {
        return false;
    }
}
