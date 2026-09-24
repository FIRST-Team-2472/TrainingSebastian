package frc.robot.subsystems;

public class Wheel {

    public Wheel() {
        RobotWheel wheel1 = new RobotWheel();
        RobotWheel wheel2 = new RobotWheel();

        wheel1.wheelDiameter = 10;
        wheel1.motorType = "a";
        wheel1.tractionType = "a";
        wheel1.wheelConfig();
        wheel1.spinWheel();

        wheel2.wheelDiameter = 20;
        wheel2.motorType = "b";
        wheel2.tractionType = "b";
        wheel2.wheelConfig();
        wheel2.spinWheel();
    }


}
