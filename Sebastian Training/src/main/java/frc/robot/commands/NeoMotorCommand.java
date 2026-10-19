package frc.robot.commands;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.NeoMotorSubsystem;

public class NeoMotorCommand extends Command {
    NeoMotorSubsystem neoMotorSubsystem;
    Supplier<Double> joystick;

    // the the var type is supplier because that is what we get from the controllers
    public NeoMotorCommand(NeoMotorSubsystem neoMotorSubsystem, Supplier<Double> joystick) {
        this.neoMotorSubsystem = neoMotorSubsystem;
        this.joystick = joystick;
        addRequirements(neoMotorSubsystem);
        // addRequirments is a method from the command class that stops multiple
        // //commands from using the same subsystem at once.

    }

    @Override
    public void initialize() {
        // whatever should run on start up
    }

    @Override
    public void execute() {
        // whatever your command does
        SmartDashboard.putNumber("Xbox Input", joystick.get());
        neoMotorSubsystem.setSpeed(joystick.get());
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public void end(boolean isInterrupted) {
        // whatever runs when it ends.
    }

}
