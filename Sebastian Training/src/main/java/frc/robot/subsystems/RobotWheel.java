package frc.robot.subsystems;

public class RobotWheel {
    int wheelDiameter;
    String motorType;
    String tractionType;

    public void wheelConfig() {
        System.out.println("The wheel's diameter is" + wheelDiameter + ", the motor type is" + motorType + "and the traction type is " + tractionType);
    }

    public void spinWheel() {
        System.out.println("The wheel diameter is " + wheelDiameter + "and the motor type is " + motorType);
    }

}