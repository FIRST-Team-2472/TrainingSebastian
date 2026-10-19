package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix6.configs.CurrentLimitsConfigs;
import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.hardware.TalonFX;

public class TalonMotorSubsystem extends SubsystemBase {
    TalonFX flywheel = new TalonFX(10);

    public TalonMotorSubsystem() {
        TalonFXConfiguration motorConfig = new TalonFXConfiguration();
        CurrentLimitsConfigs limits = new CurrentLimitsConfigs();
        limits.StatorCurrentLimit = 30;
        flywheel.getConfigurator().apply(motorConfig);
    }

    public void setSpeed(double powerPercent) {
        flywheel.set(powerPercent);
    }
}
