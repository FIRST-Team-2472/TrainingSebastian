package frc.robot.commands;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.TalonMotorSubsystem;

public class TalonMotorCommand extends Command {
    TalonMotorSubsystem talonMotorSubsystem;
    Supplier<Double> joystick;

    public TalonMotorCommand(TalonMotorSubsystem talonMotorSubsystem, Supplier<Double> joystick) {
        this.talonMotorSubsystem = talonMotorSubsystem;
        this.joystick = joystick;
        addRequirements(talonMotorSubsystem);

    }

    @Override
    public void initialize() {
        // whatever should run on start up
    }

    @Override
    public void execute() {
        // whatever your command does
        SmartDashboard.putNumber("Xbox Input", joystick.get());
        talonMotorSubsystem.setSpeed(joystick.get());
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public void end(boolean isInterrupted) {
        // whatever runs when it ends.
        talonMotorSubsystem.setSpeed(0);
    }
}
