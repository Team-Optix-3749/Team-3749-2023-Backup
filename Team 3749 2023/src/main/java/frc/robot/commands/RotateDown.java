package frc.robot.commands;

import frc.robot.subsystems.*;
import frc.robot.utils.Constants;
import edu.wpi.first.wpilibj2.command.CommandBase;

/***
 * @author Ryan McWeeny
 * 
 *         Rotates a motor that controls the arm
 */
public class RotateDown {
    @SuppressWarnings({ "PMD.UnusedPrivateField", "PMD.SingularField" })

    Base base = new Base();

    // Initializes the BaseCommand
    public RotateUp(Arm arm) {
        this.arm = arm;
        addRequirements(arm);
    }

    // Run on command init
    @Override
    public void initialize() {
    }

    // Run every 20 ms
    @Override
    public void execute() {
        base.set(Constants.arm.speed.get().doubleValue());
    }

    // Run on command finish
    @Override
    public void end(boolean interrupted) {
    }

    // Returns true when the command should end
    @Override
    public boolean isFinished() {
        return false;
    }
}
