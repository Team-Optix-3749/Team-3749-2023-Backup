package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;

/** An example command that uses an example subsystem. */
public class ArcadeCommand extends CommandBase {
    private Drivetrain m_drivetrain;
    private DoubleSupplier leftOutput, rightOutput; 
      public void ArcadeCommand(Drivetrain drivetrain, DoubleSupplier leftValue, DoubleSupplier rightValue) {
        m_drivetrain = drivetrain;
        addRequirements(drivetrain);
        leftOutput = leftValue;
        rightOutput = leftValue;
  }
   @Override 
    public void initialize() {
    }

    // Run every 20 ms
    @Override
    public void execute() {
        m_drivetrain.setMotorOutputs(leftOutput.getAsDouble(), rightOutput.getAsDouble());
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
}