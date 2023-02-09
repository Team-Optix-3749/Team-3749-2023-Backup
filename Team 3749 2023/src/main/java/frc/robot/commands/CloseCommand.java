package frc.robot.commands;

import frc.robot.utils.*;
import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj2.command.CommandBase;
/***
 * @author Anusha Khobare
 * 
 * CloseCommand.java runs the motor backwards with the setSpeed() function and stops when the function is done
 */
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
        m_claw.setSpeed(-Constants.setpoint_velocity);} //run backwards
        @Override
    public void end(boolean interrupted) {
        m_claw.setSpeed(Constants.stop_velocity); //set speed to 0 to stop
    }
    @Override
    public boolean isFinished() {
        return false;
    }
}
