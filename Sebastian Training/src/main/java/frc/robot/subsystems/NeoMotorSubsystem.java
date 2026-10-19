package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;
import com.revrobotics.spark.config.SparkMaxConfig;

public class NeoMotorSubsystem extends SubsystemBase {
    private SparkMax neoMotor = new SparkMax(0, MotorType.kBrushless); // we almost always use Brushless
    // motors but to use the other type replace kBrushless with kBrushed

    @SuppressWarnings("removal")
    public NeoMotorSubsystem() {
        // this creates a new config which will be applied to the motor
        SparkMaxConfig config = new SparkMaxConfig();
        // this stops the motor from melting itself by drawing too much power
        config.smartCurrentLimit(35);
        // this sets what the motor does when it is not getting a command the options
        // are kBreak and kCoast
        config.idleMode(IdleMode.kBrake);
        // this applies the config the other two parameters will be the same
        neoMotor.configure(config, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
    }

    public void setSpeed(double powerPercent) {
        neoMotor.set(powerPercent);
    }

    public static void setDefaultCommand(NeoMotorSubsystem neoMotorSubsystem) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setDefaultCommand'");
    }

}
