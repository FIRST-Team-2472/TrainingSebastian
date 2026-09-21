// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterSubsystem extends SubsystemBase {

  public ShooterSubsystem() {}
    public static void setShooterSpeed(double speed) {
      System.out.println("Shooter speed set to " + speed);
    }

    public static void setShooterSpeed(int speed) {
      System.out.println("Shooter speed set to " + speed);
    }

    public static double getRPM(double rpm) {
      return rpm;
    }

  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
